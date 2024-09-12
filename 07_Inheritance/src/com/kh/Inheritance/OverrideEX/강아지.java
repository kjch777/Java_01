package com.kh.Inheritance.OverrideEX;

// 강아지가 동물에서 소리를 상속 받게 하기
//					예약어
public class 강아지 extends 동물{
// 자식 class 이름  extends 부모 class 이름
//           ▲ 새로 짓기
	
	/*
	 super(이름)
	 동물 class 에서 동물 class 의 생성자를 호출하는 역할을 한다.
	 super() : java 에서 자식 class 의 생성자는, 반드시 상위 class 의 생성자를 호출해야 한다.
	  		   호출할 때 super() 를 사용해서 호출하며, 상위 class 의 생성자를 호출할 수 있다.
	 */
	// 필수 생성자
	public 강아지(String 이름) {
		super(이름); // this 말고 super
	}
	
	/*
	 @Override : 부모 class 에서 부모가 가진 method 를 다시 작성 하거나, 수정해서 정의내릴 때 사용한다.
	  			 필수로 작성해야 하는 것은 아니지만, 
	  			 작성 해줌으로써 부모 class 에서 가지고 와서 수정했다는 개발자적 표시를 해주는 것이다.
	 */

	// 강아지 소리
	@Override // 개발자간의 약속
	// 해당 method 상단에 표기
	public void 소리() {
		System.out.println(이름 + "이(가) 댕댕 짖습니다.");
	}
	
}
