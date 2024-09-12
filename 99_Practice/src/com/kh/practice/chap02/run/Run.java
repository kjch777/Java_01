package com.kh.practice.chap02.run;

import java.util.Scanner;

import com.kh.practice.chap02.loop.LoopPractice;
// import : 가져오겠다는 뜻	▲ 폴더 위치	. 폴더 안에 있는 파일명;

public class Run {
	// ▼ 최종 실행하는 메인 메서드
	public static void main(String[] args) {
		// 기능 제공 클래스에서 최종 실행 할 메서드 이름만 작성
		// 메서드란, 특정 기능을 실행 할 수 있도록 기능을 작성한 공간이다.
		// static 은 생략 가능하다. 그럼 static 의 기능은 무엇이지...
			 Scanner sc = new Scanner(System.in);
		LoopPractice LP = new LoopPractice();
		// LoopPractice 에 있는 Greeting 을 가져와서 출력하려면,
		// Scanner 를 사용했던 것처럼 LoopPractice 를 new 로 가지고 와서
		// LoopPractice 밑에 있는 Greeting 을 소환해야 한다.
		
		//LP.Greeting();
		//LP.Greeting2();
		//LP.practice2();
		//LP.practice3();
		//LP.practice12();
		//LP.practice13();
		//LP.practice14();
		LP.practice15();
		
	}

}
