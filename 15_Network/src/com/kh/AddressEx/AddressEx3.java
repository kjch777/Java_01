package com.kh.AddressEx;

import java.net.*;

public class AddressEx3 {
	public static void main(String[] args) {
		try {
			// .getByName() 은 영어 주소와 숫자 주소를 전부 가져온다.
			InetAddress 주소이름 = InetAddress.getByName("www.google.com");
			System.out.println("getByName 으로 구글을 가져온 결과 : " + 주소이름);
			
			// .getLocalHost 도 영어 주소와 내 컴퓨터의 숫자 주소를 전부 가져온다.
			InetAddress 내집주소 = InetAddress.getLocalHost();
			System.out.println("내 집 주소 : " + 내집주소);
			
			// 멀티 캐스트로 주소 여부 확인하기
			// 멀티 캐스트란, 한 컴퓨터에서 2개 이상의 컴퓨터로 동시에 파일을 전송하는 방법이다.
			// byte[] 주소를 활용하여 객체 가져오기
			// 루프백 주소 : 현재 컴퓨터 주소 자체를 가리키며, 외부 연결을 하지 않고 내 컴퓨터를 사용할 때 쓴다.
			byte[] ipAddress = {127, 0, 0, 1}; // 이 숫자들은 이렇게 하기로 약속한 것이다.
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println(byAddress);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}
}
