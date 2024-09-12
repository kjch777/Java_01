package com.kh.SocketEx;

import java.io.*;
import java.net.*;

// ��ȭ ������
public class ClientEx {
	public static void main(String[] args) {
		
            // localhost = 127.0.01 : �� ��ǻ�� �ּ�		
		try { //            ���� �ϰ��� �ϴ� ��ǻ�� �ּ�, ������ ��Ʈ ��ȣ
			Socket c = new Socket("localhost", 12340);
			
			// �����ڿ� ��ȭ�� �ϱ� ���� ����� ��Ʈ�� �����ϱ�
			// 1.   ������.getInputStream() : �����ڰ� �ۼ��� ������(��ȭ) �� �о���� ���� �Է� ��Ʈ���� ���� ������ ������ ��
			// 2. new InputStreamReader() : ���� ������ ���� ������ �ܾ��(��ȭ) �� �ϳ��ϳ� ��ȯ�� �� ����Ѵ�.
			// 3.        BufferedReader() : �ܾ��(��ȭ) �� �� ���� �������� ���� �� �ֵ��� �����ִ� �޼����̴�.
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			// �ۼ��� ������ ������ �� �� �ְ� �������� ������ �ϰ�, ������ ���� �� �ְ� �����ִ� �ڵ带 �ۼ��� ���̴�.
			// 1. ������.getOutputStream(), true : �����ڰ� �ۼ��� ������ �������� ���� ������ ��
			//                            true �� ����Ͽ�, �������� �����ٴ� �ڵ带 �ۼ��� ���̴�.
			
			// 2.                  PrintWriter : �ؽ�Ʈ�� ����� ��, ������ ���� �Ų����� ����� �� �ֵ��� �����ִ� �޼����̴�.
			//                        .flush() : ������ ����ϴ� ������ �ϴµ�, true �� ���ԵǾ� �ִ�. 
			PrintWriter out = new PrintWriter(c.getOutputStream(), true);
			
			// �����ڷ� �޽��� �����ϱ�
			out.println("Hi, jeans!");
			
			// �����ڷκ��� ���� �޽��� ���� �� ����ϱ�
			String m; // = in.readLine();
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
			}
			
			// �ݰ�, ���� �� ���� ����, ��������, ������ ������ �� ������ ���ư��� ������ �ڵ� �ۼ��ϱ�
			in.close();
			out.close();
			c.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
