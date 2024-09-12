package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 내 집 주소 알아보기
 InetAddress 의 메서드
  			.getLocalHost() : 현재, 내 컴퓨터에 지정된 IP 주소를 가져올 때 사용한다.
 
 내 IP 주소 : 192.168.0.7
 
 컴퓨터가 동일한 라인에서 1대만 존재할 때는 기본 주소로 192.168.0.1 == 마지막이 1로 시작하는 숫자를 부여받지만,
 여러 사람이 함께 동일한 장소, 동일한 컴퓨터 라인, 동일한 네트워크를 나눠서 받게 될 경우에는 1부터 번호를 부여받게 된다.
 
 localHost == 192.168.0.7 의 경우, 내 집에 있는 호수를 작성한 것과 같다.
 
 127.0.0.1 은, 내 집 주소를 숫자로 작성한 것과 같다. 
 */
public class AddressEx2 {
	public static void main(String[] args) {
		try {
			InetAddress 로컬호스트 = InetAddress.getLocalHost();
			System.out.println("내 IP 주소 : " + 로컬호스트.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
