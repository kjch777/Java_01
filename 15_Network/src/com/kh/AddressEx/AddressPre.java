package com.kh.AddressEx;

import java.net.*;

public class AddressPre {
	public static void main(String[] args) {
		/*
		 try {
			InetAddress 구글 = InetAddress.getByName("www.google.com");
			System.out.println("호스트 이름 : " + 구글.getHostName());
			System.out.println("IP   주소 : " + 구글.getHostAddress());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		*/
		
		// 내 컴퓨터 이름, 자리 번호 확인하기
		try {
			InetAddress mine = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 정보 : " + mine);
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		
		// www.facebook.com
		try {
			InetAddress 페이스북 = InetAddress.getByName("www.facebook.com");
			System.out.println("호스트 이름 : " + 페이스북.getHostName());
			System.out.println("호스트 주소 : " + 페이스북.getHostAddress());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
				
		// www.instagram.com
		try {
			InetAddress 인스타그램 = InetAddress.getByName("www.instagram.com");
			System.out.println("호스트 이름 : " + 인스타그램.getHostName());
			System.out.println("호스트 주소 : " + 인스타그램.getHostAddress());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		
	}
}
