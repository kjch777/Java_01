package com.kh.SocketEx;

import java.io.*;
import java.net.*;

// Server == ä�� ������ : ���� ���� �ۼ� ���־�� �Ѵ�.
// ��Ʈ ��ȣ 2�ڸ�, 3�ڸ�, 4�ڸ��� ��ǻ�Ϳ��� �̹� ������ ���ڰ� �����Ѵ�.
public class ServerPre {
	public static void main(String[] args) {
		try {
			
			ServerSocket s = new ServerSocket(12350);
			System.out.println("������ �� ��Ʈ ��ȣ�� ���Ƚ��ϴ�.");
			System.out.println("party chat open");
			
			Socket c = s.accept();
			System.out.println("client success");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			PrintWriter out = new PrintWriter(c.getOutputStream(), true);
			
			String m;
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				out.println("����� ����?");
				
			c.close();
			s.close(); // ���� ������ Ŭ���̾�Ʈ ���Ϻ��� ���� �ݾƵ� �Ǵ���, ���� ������ ���� ������ Ŭ���̾�Ʈ ���忡���� ���� ���� �Ǵ� �� �ƴ��� // �� ������ �´� �� ����.
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
