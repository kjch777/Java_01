package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

// ��ȭ�� �����ϴ� ��ȭ�� ��ü��
public class ServerEx {
	public static void main(String[] args) {
		// ��ȭ�� ��ü�ڴ� �� �� �ּҿ� �� ���� ��� ������, ������ ���(��Ʈ ��ȣ) �����ϱ�

		// ���� ���� ��Ʈ ��ȣ�� �����Ͽ� ServerSocket �� �����ϱ�
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
			 * ��, ���� ��Ʈ ��ȣ��
			 */
			System.out.println("������ �� ��Ʈ ��ȣ�� ���Ƚ��ϴ�.");
			System.out.println("party chat open.");

			// �� ���� �湮�ϴ� �մ��� ������ �����ϱ�
			Socket b = s.accept();
			System.out.println("client success."); // �� ���� �������� Ȯ���ߴٴ� ��¹�
			
			// �����ڿ� ��ȭ�� �ϱ� ���� ����� ��Ʈ�� �����ϱ�
			// 1.   ������.getInputStream() : �����ڰ� �ۼ��� ������(��ȭ) �� �о���� ���� �Է� ��Ʈ���� ���� ������ ������ ��
			// 2. new InputStreamReader() : ���� ������ ���� ������ �ܾ��(��ȭ) �� �ϳ��ϳ� ��ȯ�� �� ����Ѵ�.
			// 3.        BufferedReader() : �ܾ��(��ȭ) �� �� ���� �������� ���� �� �ֵ��� �����ִ� �޼����̴�.
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
			// �ۼ��� ������ ������ �� �� �ְ� �������� ������ �ϰ�, ������ ���� �� �ְ� �����ִ� �ڵ带 �ۼ��� ���̴�.
			// 1. ������.getOutputStream(), true : �����ڰ� �ۼ��� ������ �������� ���� ������ ��
			//                            true �� ����Ͽ�, �������� �����ٴ� �ڵ带 �ۼ��� ���̴�.
			
			// 2.                  PrintWriter : �ؽ�Ʈ�� ����� ��, ������ ���� �Ų����� ����� �� �ֵ��� �����ִ� �޼����̴�.
			//                        .flush() : ������ ����ϴ� ������ �ϴµ�, true �� ���ԵǾ� �ִ�. 
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			// �����ڷκ��� ���� �޽��� ���� �� ����ϱ�
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
