package com.kh.SocketEx;

import java.io.*;
import java.net.*;

// 대화 참가자
public class ClientEx {
	public static void main(String[] args) {
		
            // localhost = 127.0.01 : 내 컴퓨터 주소		
		try { //            접속 하고자 하는 컴퓨터 주소, 서버의 포트 번호
			Socket c = new Socket("localhost", 12340);
			
			// 주최자와 대화를 하기 위한 입출력 스트림 생성하기
			// 1.   참가자.getInputStream() : 참가자가 작성한 데이터(대화) 를 읽어오기 위한 입력 스트림을 숫자 값으로 가져온 것
			// 2. new InputStreamReader() : 숫자 값에서 문자 값으로 단어들(대화) 을 하나하나 변환할 때 사용한다.
			// 3.        BufferedReader() : 단어들(대화) 를 한 번에 가져오고 읽을 수 있도록 도와주는 메서드이다.
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			// 작성한 내용을 눈으로 볼 수 있게 내보내는 역할을 하고, 눈으로 읽을 수 있게 도와주는 코드를 작성한 것이다.
			// 1. 참가자.getOutputStream(), true : 참가자가 작성한 내용을 내보내기 위해 가져온 것
			//                            true 를 사용하여, 내보내도 괜찮다는 코드를 작성한 것이다.
			
			// 2.                  PrintWriter : 텍스트를 출력할 때, 불편함 없이 매끄럽게 출력할 수 있도록 도와주는 메서드이다.
			//                        .flush() : 강제로 출력하는 역할을 하는데, true 에 포함되어 있다. 
			PrintWriter out = new PrintWriter(c.getOutputStream(), true);
			
			// 주최자로 메시지 전송하기
			out.println("Hi, jeans!");
			
			// 주최자로부터 받은 메시지 수신 및 출력하기
			String m; // = in.readLine();
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
			}
			
			// 닫고, 내가 할 말을 쓰고, 내보내고, 주최자 집에서 내 집으로 돌아가는 순서로 코드 작성하기
			in.close();
			out.close();
			c.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
