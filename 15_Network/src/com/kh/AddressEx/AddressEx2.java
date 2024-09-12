package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 �� �� �ּ� �˾ƺ���
 InetAddress �� �޼���
  			.getLocalHost() : ����, �� ��ǻ�Ϳ� ������ IP �ּҸ� ������ �� ����Ѵ�.
 
 �� IP �ּ� : 192.168.0.7
 
 ��ǻ�Ͱ� ������ ���ο��� 1�븸 ������ ���� �⺻ �ּҷ� 192.168.0.1 == �������� 1�� �����ϴ� ���ڸ� �ο�������,
 ���� ����� �Բ� ������ ���, ������ ��ǻ�� ����, ������ ��Ʈ��ũ�� ������ �ް� �� ��쿡�� 1���� ��ȣ�� �ο��ް� �ȴ�.
 
 localHost == 192.168.0.7 �� ���, �� ���� �ִ� ȣ���� �ۼ��� �Ͱ� ����.
 
 127.0.0.1 ��, �� �� �ּҸ� ���ڷ� �ۼ��� �Ͱ� ����. 
 */
public class AddressEx2 {
	public static void main(String[] args) {
		try {
			InetAddress ����ȣ��Ʈ = InetAddress.getLocalHost();
			System.out.println("�� IP �ּ� : " + ����ȣ��Ʈ.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
