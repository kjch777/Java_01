package com.kh.oop.basic;

// 국민
public class Nation {
	/* 속성값 
	 public 을 작성해두지 않으면
	 자동으로 default 가 붙는다.
	 ex) (default) String name;
	 default 로 설정하려면 default 작성하지 말것. 알아서 자동으로 붙는다. 
	 */ 
	public String name;
	public int age;
	public char gender;
	public String jumin;
	
	/* 메서드 기능 */
	public void speakKorean() {
		System.out.println("가나다라 한국어 가능");
	}
	
	public void welfare() {
		System.out.println("대한민국 복지 누리기 가능!");
	}
	
	public void 납세의의무() {
		// 만 19세 이상 성인만 세금을 내는 경우
		if(age >= 19) {
			System.out.println(name + " 님은 성인이므로, 세금 납부 대상자입니다.");
		} else {
			System.out.println(name + " 님은 미성년자로, 세금 납부 대상자가 아닙니다.");
		}
	}

}
