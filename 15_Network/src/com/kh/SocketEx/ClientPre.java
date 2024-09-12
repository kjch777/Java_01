package com.kh.SocketEx;

import java.io.*;
import java.net.*;

public class ClientPre {
	public static void main(String[] args) {
		try {
			Socket b = new Socket("localhost", 12350);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			// Ŭ���̾�Ʈ�� ������ ���� ������ ������ �޽����� �ٽ� ������ ����غ� �� �ִ�.
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
