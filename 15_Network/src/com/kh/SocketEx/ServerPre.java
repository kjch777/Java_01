package com.kh.SocketEx;

import java.io.*;
import java.net.*;

// Server == 채팅 주최자 : 가장 먼저 작성 해주어야 한다.
// 포트 번호 2자리, 3자리, 4자리는 컴퓨터에서 이미 지정한 숫자가 존재한다.
public class ServerPre {
	public static void main(String[] args) {
		try {
			
			ServerSocket s = new ServerSocket(12350);
			System.out.println("주최자 측 포트 번호가 열렸습니다.");
			System.out.println("party chat open");
			
			Socket c = s.accept();
			System.out.println("client success");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			PrintWriter out = new PrintWriter(c.getOutputStream(), true);
			
			String m;
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				out.println("뭐라고 쓸까?");
				
			c.close();
			s.close(); // 서버 소켓을 클라이언트 소켓보다 먼저 닫아도 되는지, 서버 소켓이 먼저 닫히면 클라이언트 입장에서는 강제 종료 되는 것 아닌지 // 내 생각이 맞는 것 같다.
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
