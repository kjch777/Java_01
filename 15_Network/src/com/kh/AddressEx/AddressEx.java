package com.kh.AddressEx;

import java.net.*;

/*
 IP �ּ� : ��ǻ�Ϳ���, ��Ʈ��ũ ���� Ư�� ��ġ�� Ȯ���ϴ� ���� ����ϴ� �����̴�.
 		 ���� �⺻ �ּ�(localhost) : 192.168.0.1(���� �� �ּҰ��� ����)
 		   
 		   �� �� �ּ� : 192.168.0.7
 		 localHost : 127.0.0.1
 		 �� ��ǻ���� ���� �ּҸ� �˰� �ʹٸ�, ���̹� �˻�â�� IP �ּ� Ȯ�� �� �˻��ϸ� �ȴ�.
 
 port : ��Ʈ��ũ���� �����͸� �ְ� ���� �� �ִ� ����̴�.
 		Ÿ���� ��ǻ�ͳ� ������, �Ǵ� Ư�� ��ġ�� �� �� �ִ� ��ȣ��, ��ȣ�� ���� 2�ڸ��� 4�ڸ��� ����Ѵ�.
 		
 InetAddress : �ڹٿ���, IP �ּҸ� ��Ÿ���� ���� ����Ѵ�.
               ȣ��Ʈ(�� ����) �̸��� IP �ּ� ���� ��ȯ, ȣ��Ʈ�� ���� ���� �˻� ���� �����ϰ� ���ش�.
               
 �޼��� 
 	.getByName(String host) : host �̸��� ���� ������ ��ȯ�� �� ����Ѵ�.
 	         .getHostName() : host �̸��� ������ �� ����Ѵ�. 
 	      .getHostAddress() : IP �ּҸ� ������ �� ����Ѵ�.
 
 	ȣ��Ʈ �̸� : www.daum.net
	IP   �ּ� : 121.53.105.193
	
	����� �˾ƺ��� ���� ����� �ۼ��� ȣ��Ʈ �̸��� �ٲ��� ������, IP �ּҴ� �Ź� �ٲ� �� �ִ�.
	�̴�, ��¥ IP �ּҸ� ��ȣ�ϱ� ���� �Ź� �ٸ� �ӽ� IP �ּҸ� �����ִ� ���̱� �����̴�.
 */
public class AddressEx {
	
	// ���� ��� �� ������ �ڵ带 �ۼ��ϴ� ���� main method
	public static void main(String[] args) {
		
		// 1. naver �� ���� �˾ƺ���
		try { // ������ �߻��� ���� ������, �ϴ� �õ�(try) �� �� �ڵ带 �ۼ�
			InetAddress �ּ� = InetAddress.getByName("www.naver.com");
			System.out.println("ȣ��Ʈ �̸� : " + �ּ�.getHostName());
			System.out.println("IP   �ּ� : " + �ּ�.getHostAddress());
		} catch (UnknownHostException e) { // �õ����� �� ������ �߻��ϸ� ����� �ڵ�
			
			e.printStackTrace();
		}
		
		// 2. daum �� ���� �˾ƺ���
		try {
			InetAddress �ּ�2 = InetAddress.getByName("www.daum.net");
			System.out.println("ȣ��Ʈ �̸� : " + �ּ�2.getHostName());
			System.out.println("IP   �ּ� : " + �ּ�2.getHostAddress());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		
		// 3. IP �ּҷ� daum �˻��ϱ�
		try {
			InetAddress ����IP = InetAddress.getByName("211.249.220.24");
			System.out.println("ȣ��Ʈ �̸� : " + ����IP.getHostName());
			System.out.println("IP   �ּ� : " + ����IP.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
