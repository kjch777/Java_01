package com.kh.interfaceEx;

// 클래스와 추상 클래스를 상속 받으려면 : extends(확장하다) 작성
//         인터페이스를 상속 받으려면 : implements(구현하다) 작성
// 추상 클래스 - 미완성된 값을 가지고 변경하고 확장하는 것이 목표
//  인터페이스 - 정해진 값을 가지고 클래스를 완성하는 것이 목표
public class 컴퓨터 implements 기계 {
	// 기계 인터페이스에 미완성(abstract)된 메서드를 컴퓨터로 가져와
	// 미완성된 모든 메서드를 완성시켜주면, 클래스에 표시된 에러가 사라진다.
	@Override
	public void 전원켜기() {
		System.out.println("컴퓨터의 전원 버튼을 눌러서 켠다.");
	}
	
	@Override
	public void 전원끄기() {
		System.out.println("컴퓨터의 전원 버튼을 눌러서 끈다.");
	}
	
}
