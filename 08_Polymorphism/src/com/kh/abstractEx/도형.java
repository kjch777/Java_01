package com.kh.abstractEx;
/*
 abstract class (추상 클래스)
 추상 메서드를 포함하고 있는 클래스이고, 미완성 클래스이기 때문에,
 컴퓨터에 추상 클래스로 만든 파일의 자체 공간을 만드는 것은 불가능하다. 
 
 사용 예제
 [접근 제어자] : public		protected	default		private
 
 [접근 제어자] abstract class 파일명 {
 	// 필드 & 메서드 (메서드는 필수는 아님)
 	[접근 제어자] abstract 자료형 변수명();
 }
 */
public abstract class 도형 { // 추상 클래스
// 추상 : 같은 것을 본 뜬 것

// 필드
	private String 색깔;

// 메서드
	// Setter
	public void set색깔(String 색깔) {
		this.색깔 = 색깔;
	}
	
	// Getter
	public String get색깔() {
		return 색깔;
	}
	
	// 필수 생성자
	public 도형(String 색깔) {
		this.색깔 = 색깔;
	}
	
	// abstract 가 적혀있으면, 나중에 설계도로 완성할 파일에서 필수로 불러와 완성해야 하는 메서드들이다.
	// abstract 메서드는 미완성 메서드이기 때문에,
	// 자식 클래스에서 미완성된 부모 클래스를 완성해주기 위하여, 
	// 자식이 부모를 불러올 때 자식에서 필수로 불러온 다음 메서드 모양을 완성해야 한다.
	public abstract double 도형넓이();

	public abstract double 도형둘레();
	
	public void 출력정보() {
		System.out.println("이 도형은 넓이가 " + 도형넓이() + " 이고, 둘레가 " + 도형둘레() + " 입니다.");
	}
}
