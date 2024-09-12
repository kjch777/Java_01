package com.kh.oop.basic;

public class 리모컨 {
	// 필드
	public boolean powerOn; // 전원 상태
	public int volume; // 소리 크기
	
	
	// 공간(초기) 생성자
	public 리모컨() {
		
	}
	
	
	// 필수 생성자
	public 리모컨(int vol) {
		this.volume = vol;
	}
	
	
	// 메서드
	public void 상태() {
		System.out.println("음량 : " + volume + " 입니다.");
	}
	
	
	// 최종 출력 할 메인 메서드를 만들어서
	// 리모컨 음량을 200 으로 만들고, 음량이 200 이 맞는지 확인하기
	public static void main(String[] args) {
		리모컨 rmc = new 리모컨(); // 리모컨 객체 생성
		rmc.powerOn = true;
		rmc.volume = 100;
		System.out.println("리모컨의 전원은 " + rmc.powerOn + " 이고, " 
						   + "현재 음량은 " + rmc.volume + " 입니다.");
	
		// 리모컨 음량을 200 으로 만들고 음량이 200 이 맞는지 확인하기
		리모컨 rmc2 = new 리모컨(200); // 리모컨 음량이 필수이기 때문에 소괄호 ( ) 안에 200 을 넣어준다.
		rmc2.상태();
	}
	
}
