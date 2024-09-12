package com.kh.SocketUpgrade;

import java.net.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

public class ServerEx {

	private static final int SERVER_PORT = 12145; // 포트 번호
	private static final int SERVER_SPACE = 50; // 입장할 수 있는 인원 수
	private static final Socket[] clientSockets = new Socket[SERVER_SPACE];
	private static ServerSocket serverSocket;

	public static void main(String[] args) throws Exception {

		serverSocket = new ServerSocket(SERVER_PORT);
		System.out.println("TCP Server started.");

		Thread serverAcceptThread = new Thread(() -> {
			int i = 0;
			while (true) {
				try {
					// 초대한 사람들이 들어오고 있는지(대기 중) 확인하는 출력문
					System.out.println("Waiting for clients...");
					
					// 한명이라도 접속하면, 접속했다는 문구를 보여주는 코드
					clientSockets[i] = serverSocket.accept();
					System.out.println("Client connected: " + clientSockets[i].getInetAddress().getHostAddress());
					
					// 방문자가 주최자에게서 온 메시지를 받을 수 있는 그릇을 생성하는 코드 
					if (clientSockets[i] != null && clientSockets[i].isConnected()) {
						ClientToServerThread clientHandler = new ClientToServerThread(i);
						clientHandler.start();
					}
					
					// 메모리 관리 : 사람들이 순차적으로 접속할 수 있도록 해주는 코드
					i = (i + 1) % clientSockets.length;
				} catch (IOException e) {
					serverSocket = null;
					break;
				}
			}

		});
		serverAcceptThread.start();

		// 주최자가 방문자에게 메시지를 보낼 수 있도록, 메시지가 담겨 보내질 수 있는 그릇을 생성하는 코드
		ServerToClientThread serverToClientThread = new ServerToClientThread();
		serverToClientThread.start();
	}

	static class ServerToClientThread extends Thread {
		@Override
		public void run() {
			super.run();
			try {
				while (true) {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
					String input = br.readLine();
					
					// finish 라는 문자열이 입력되면, 주최자가 열어놓은 서버를 종료하는 코드
					if (input.equals("finish")) {
						System.out.println("Server off... Goodbye!");
						for (Socket socket : clientSockets) {
							if (socket != null) {
								socket.close();
							}
						}
						serverSocket.close();
						break;
					}
					// 주최한 서버에 참석한 방문자를 차례대로 찾아서 전송하는 코드
					for (Socket clientSocket : clientSockets) {
						if (clientSocket != null && clientSocket.isConnected()) {
							OutputStream out = clientSocket.getOutputStream();
							PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, StandardCharsets.UTF_8),
									true);
							writer.println(input);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static class ClientToServerThread extends Thread {
		private final int index;
		private final InputStream in;
		private final BufferedReader reader;

		ClientToServerThread(int index) throws IOException {
			this.index = index;
			this.in = clientSockets[index].getInputStream();
			this.reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		}

		@Override
		public void run() {
			super.run();
			while (true) {
				try {
					// 방문자로부터 메시지를 전달받아, 글자로 확인할 수 있게 작성한 코드
					String message = reader.readLine();
					System.out.println("Message from client: " + message);
				} catch (IOException e) {
					System.out.printf("Client[%d] disconnected.\n", index);
					clientSockets[index] = null;
					break;
				}
			}
		}
	}
}