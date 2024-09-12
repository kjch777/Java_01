package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

// 대화를 시작하는 대화의 주체자
public class ServerEx {
	public static void main(String[] args) {
		// 대화의 주체자는 내 집 주소와 내 집에 어떻게 들어올지, 들어오는 경로(포트 번호) 생성하기

		// 서버 측의 포트 번호를 지정하여 ServerSocket 을 생성하기
		try {
			ServerSocket s = new ServerSocket(12340);
			/*
			 * java.net.BindException: Address already in use: bind at
			 * java.base/sun.nio.ch.Net.bind0(Native Method) at
			 * java.base/sun.nio.ch.Net.bind(Net.java:555) at
			 * java.base/sun.nio.ch.Net.bind(Net.java:544) at
			 * java.base/sun.nio.ch.NioSocketImpl.bind(NioSocketImpl.java:643) at
			 * java.base/java.net.ServerSocket.bind(ServerSocket.java:388) at
			 * java.base/java.net.ServerSocket.<init>(ServerSocket.java:274) at
			 * java.base/java.net.ServerSocket.<init>(ServerSocket.java:167) at
			 * com.kh.SocketEx.ServerEx.main(ServerEx.java:13)
			 * 은, 같은 포트 번호를
			 */
			System.out.println("주최자 측 포트 번호가 열렸습니다.");
			System.out.println("party chat open.");

			// 내 집에 방문하는 손님의 연결을 수락하기
			Socket b = s.accept();
			System.out.println("client success."); // 집 문을 열었음을 확인했다는 출력문
			
			// 주최자와 대화를 하기 위한 입출력 스트림 생성하기
			// 1.   참가자.getInputStream() : 참가자가 작성한 데이터(대화) 를 읽어오기 위한 입력 스트림을 숫자 값으로 가져온 것
			// 2. new InputStreamReader() : 숫자 값에서 문자 값으로 단어들(대화) 을 하나하나 변환할 때 사용한다.
			// 3.        BufferedReader() : 단어들(대화) 를 한 번에 가져오고 읽을 수 있도록 도와주는 메서드이다.
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
			// 작성한 내용을 눈으로 볼 수 있게 내보내는 역할을 하고, 눈으로 읽을 수 있게 도와주는 코드를 작성한 것이다.
			// 1. 참가자.getOutputStream(), true : 참가자가 작성한 내용을 내보내기 위해 가져온 것
			//                            true 를 사용하여, 내보내도 괜찮다는 코드를 작성한 것이다.
			
			// 2.                  PrintWriter : 텍스트를 출력할 때, 불편함 없이 매끄럽게 출력할 수 있도록 도와주는 메서드이다.
			//                        .flush() : 강제로 출력하는 역할을 하는데, true 에 포함되어 있다. 
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			// 참가자로부터 받은 메시지 수신 및 출력하기
			String m; // = in.readLine();
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				
				out.println("===== check ======");
				
			}

			s.close();
			b.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
