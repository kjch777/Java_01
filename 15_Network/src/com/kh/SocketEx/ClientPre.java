package com.kh.SocketEx;

import java.io.*;
import java.net.*;

public class ClientPre {
	public static void main(String[] args) {
		try {
			Socket b = new Socket("localhost", 12350);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			// 클라이언트는 서버가 읽을 때까지 여러번 메시지를 다시 보내서 출력해볼 수 있다.
			for(int i = 0; i < 3; i++) {
				out.println("Hi, Hello");
				
				String m = in.readLine();
				System.out.println("send success : " + m);
			}
			
			/*
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
			}
			*/
			
			in.close();
			out.close();
			b.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
