package com.kh.InOut;
/*
 클래스 안에 이름이 다른 클래스를 선언해보기 
 */
public class InnerClassOutClass {

// 필드
	private int 숫자 = 10;
	
// 메서드
	// 기본 생성자
	public InnerClassOutClass() {
		// Ctrl + Space
	}
	
	// 내부 클래스 만들기
	class InnerClass{
		void 밖에서보여주기() {
			System.out.println("숫자보기 : " + 숫자);
		}
	}
	
	// 최종 출력 및 실행
	public static void main(String[] args) {
		InnerClassOutClass 인아웃 = new InnerClassOutClass();
		InnerClassOutClass.InnerClass 인 = 인아웃.new InnerClass();
		인.밖에서보여주기();
	}
}
