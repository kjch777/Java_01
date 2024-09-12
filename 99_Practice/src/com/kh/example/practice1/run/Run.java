package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	// 메인 메서드 : 최종적으로 실행하거나 출력하는 메서드
	public static void main(String[] args) {
		// 다른 class 를 불러오려면 == 객체를 생성하려면
		Member 멤버 = new Member(); 
// class명 새로운 변수명 = new class명 (); 을 작성한 후, import 해준 다음,
		멤버.changeName("동그라미"); // 이름 변경 가능
		
		멤버.printName();
// 새로운 변수명 . 불러올 메서드 이름 (); 을 작성해준다. 
	}

}

// 안에 어떠한 값도 들어있지 않을땐 null 이 출력된다.