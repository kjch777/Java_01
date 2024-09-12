package com.kh.AddressEx;

import java.net.*;

/*
 IP 주소 : 컴퓨터에서, 네트워크 상의 특정 장치를 확인하는 데에 사용하는 숫자이다.
 		 가장 기본 주소(localhost) : 192.168.0.1(나의 집 주소같은 개념)
 		   
 		   내 집 주소 : 192.168.0.7
 		 localHost : 127.0.0.1
 		 내 컴퓨터의 실제 주소를 알고 싶다면, 네이버 검색창에 IP 주소 확인 을 검색하면 된다.
 
 port : 네트워크에서 데이터를 주고 받을 수 있는 장소이다.
 		타인의 컴퓨터나 도메인, 또는 특정 위치에 들어갈 수 있는 번호로, 번호는 보통 2자리나 4자리를 사용한다.
 		
 InetAddress : 자바에서, IP 주소를 나타내는 데에 사용한다.
               호스트(집 주인) 이름과 IP 주소 간의 변환, 호스트에 대한 정보 검색 등을 가능하게 해준다.
               
 메서드 
 	.getByName(String host) : host 이름에 대한 정보를 반환할 때 사용한다.
 	         .getHostName() : host 이름을 가져올 때 사용한다. 
 	      .getHostAddress() : IP 주소를 가져올 때 사용한다.
 
 	호스트 이름 : www.daum.net
	IP   주소 : 121.53.105.193
	
	사람이 알아보기 쉽게 영어로 작성된 호스트 이름은 바뀌지 않지만, IP 주소는 매번 바뀔 수 있다.
	이는, 진짜 IP 주소를 보호하기 위해 매번 다른 임시 IP 주소를 보여주는 것이기 때문이다.
 */
public class AddressEx {
	
	// 최종 출력 및 실행할 코드를 작성하는 공간 main method
	public static void main(String[] args) {
		
		// 1. naver 에 대해 알아보기
		try { // 에러가 발생할 수도 있지만, 일단 시도(try) 해 볼 코드를 작성
			InetAddress 주소 = InetAddress.getByName("www.naver.com");
			System.out.println("호스트 이름 : " + 주소.getHostName());
			System.out.println("IP   주소 : " + 주소.getHostAddress());
		} catch (UnknownHostException e) { // 시도했을 때 에러가 발생하면 출력할 코드
			
			e.printStackTrace();
		}
		
		// 2. daum 에 대해 알아보기
		try {
			InetAddress 주소2 = InetAddress.getByName("www.daum.net");
			System.out.println("호스트 이름 : " + 주소2.getHostName());
			System.out.println("IP   주소 : " + 주소2.getHostAddress());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		
		// 3. IP 주소로 daum 검색하기
		try {
			InetAddress 다음IP = InetAddress.getByName("211.249.220.24");
			System.out.println("호스트 이름 : " + 다음IP.getHostName());
			System.out.println("IP   주소 : " + 다음IP.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
