package com.kh.AddressEx;

import java.net.*;

public class AddressEx3 {
	public static void main(String[] args) {
		try {
			// .getByName() �� ���� �ּҿ� ���� �ּҸ� ���� �����´�.
			InetAddress �ּ��̸� = InetAddress.getByName("www.google.com");
			System.out.println("getByName ���� ������ ������ ��� : " + �ּ��̸�);
			
			// .getLocalHost �� ���� �ּҿ� �� ��ǻ���� ���� �ּҸ� ���� �����´�.
			InetAddress �����ּ� = InetAddress.getLocalHost();
			System.out.println("�� �� �ּ� : " + �����ּ�);
			
			// ��Ƽ ĳ��Ʈ�� �ּ� ���� Ȯ���ϱ�
			// ��Ƽ ĳ��Ʈ��, �� ��ǻ�Ϳ��� 2�� �̻��� ��ǻ�ͷ� ���ÿ� ������ �����ϴ� ����̴�.
			// byte[] �ּҸ� Ȱ���Ͽ� ��ü ��������
			// ������ �ּ� : ���� ��ǻ�� �ּ� ��ü�� ����Ű��, �ܺ� ������ ���� �ʰ� �� ��ǻ�͸� ����� �� ����.
			byte[] ipAddress = {127, 0, 0, 1}; // �� ���ڵ��� �̷��� �ϱ�� ����� ���̴�.
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println(byAddress);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}
}
