package com.kh.SocketUpgrade;

import java.nio.charset.StandardCharsets;
import java.net.*;
import java.io.*;

public class ClientEx {
	private static boolean isRunning;
	private static Socket clientSocket = null;
	private static final int SERVER_PORT = 12145; // 주최자(서버) 가 열어놓은 포트 번호. 클라이언트 포트 번호는 서버 포트 번호와 같아야 한다.

	public static void main(String[] args) {
		String serverHostname = "localhost"; // 우리집주소 = localhost = 127.0.0.1
		isRunning = true;
		
		// 서버와 연결이 가능하다면 연결하고, 서버에 연결되어 있는 방문자는 한 번 연결하면 끝이지만
		// 서버가 강제로 종료하고, 다시 접속하려 하면 다시 이 코드를 타고 null 값을 보여준다.
		Thread serverThread = new Thread(() -> {
			
			// 서버에서 방문자한테 메시지를 보내는 값으로 null 을 준 것이다. (처음에는 아무런 대화도 없기 때문이다.)
			ServerToClientThread serverToClientThread = null;
			
			// 방문자가 서버로 메시지를 보내는 값으로 null 을 준 것이다. (처음에는 아무런 대화도 없기 때문이다.)
			ClientToServerThread clientToServerThread = null;

			while (isRunning) {
				if (clientSocket == null) {
					try {
						System.out.println("Server finding...");
						clientSocket = new Socket(serverHostname, SERVER_PORT);
						if (clientSocket.isConnected()) {
							System.out.println("Connected to server.");
							
							// 서버와 성공적으로 접속했다면, 대화를 시작하기 위한 그릇을 생성해 준 코드
							serverToClientThread = new ServerToClientThread();
							serverToClientThread.start();
							clientToServerThread = new ClientToServerThread();
							clientToServerThread.start();
						}
					} catch (IOException e) {
						System.out.println("Failed to connect to server. Retrying...");
						if (serverToClientThread != null) {
							serverToClientThread.setFlag(false);
						}
						if (clientToServerThread != null) {
							clientToServerThread.setFlag(false);
						}
					}
				}
				try {
					
					// 만약, 서버와 클라이언트 간의 연결이 끊어졌다면, 1초마다 다시 재접속 시도를 진행하는 코드
					Thread.sleep(1000);
				} catch (InterruptedException ignored) {
				}
			}
		});
		serverThread.start();

	}

	static class ClientToServerThread extends Thread {
		private boolean flag = true;
		private final OutputStream out;
		private final BufferedReader br;

		ClientToServerThread() throws IOException {
			out = clientSocket.getOutputStream();
			br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
		}

		@Override
		public void run() {
			super.run();
			while (flag) {
				try {
					String input = br.readLine();
					
					// 서버장이 서버를 종료하고 싶다면, exit 를 입력해서 종료하게 하는 코드
					if (input.equals("finish")) {
						System.out.println("Client Off... Goodbye!");
						clientSocket = null;
						isRunning = false;
						break;
					}
					PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, StandardCharsets.UTF_8), true);
					writer.println(input);
				} catch (IOException e) {
					System.out.println("Failed to send message.");
				}
			}
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}
	}

	static class ServerToClientThread extends Thread {
		private boolean flag = true;
		private final BufferedReader reader;

		public ServerToClientThread() throws IOException {
			InputStream in = clientSocket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		}

		@Override
		public void run() {
			super.run();
			while (flag) {
				try {
					String response = reader.readLine();
					System.out.println("Response from server: " + response);
				} catch (IOException e) {
					System.out.println("Disconnected from server.");
					clientSocket = null;
					break;
				}
			}
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}
	}

}