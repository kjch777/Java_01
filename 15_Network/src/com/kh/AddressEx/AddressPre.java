package com.kh.AddressEx;

import java.net.*;

public class AddressPre {
	public static void main(String[] args) {
		/*
		 try {
			InetAddress ���� = InetAddress.getByName("www.google.com");
			System.out.println("ȣ��Ʈ �̸� : " + ����.getHostName());
			System.out.println("IP   �ּ� : " + ����.getHostAddress());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		*/
		
		// �� ��ǻ�� �̸�, �ڸ� ��ȣ Ȯ���ϱ�
		try {
			InetAddress mine = InetAddress.getLocalHost();
			System.out.println("�� ��ǻ�� ���� : " + mine);
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		
		// www.facebook.com
		try {
			InetAddress ���̽��� = InetAddress.getByName("www.facebook.com");
			System.out.println("ȣ��Ʈ �̸� : " + ���̽���.getHostName());
			System.out.println("ȣ��Ʈ �ּ� : " + ���̽���.getHostAddress());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
				
		// www.instagram.com
		try {
			InetAddress �ν�Ÿ�׷� = InetAddress.getByName("www.instagram.com");
			System.out.println("ȣ��Ʈ �̸� : " + �ν�Ÿ�׷�.getHostName());
			System.out.println("ȣ��Ʈ �ּ� : " + �ν�Ÿ�׷�.getHostAddress());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		
	}
}
