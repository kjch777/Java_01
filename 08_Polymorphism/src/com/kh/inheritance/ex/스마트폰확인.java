package com.kh.inheritance.ex;

public class 스마트폰확인 {
	
	public static void main(String[] args) {
		
		// 스마트폰 중에서 아이폰 확인하기
		스마트폰 s1 = new 아이폰();
		
		// 아이폰 s1 = new 아이폰();
		
		// 스마트폰 그릇에 아이폰을 가지고 오면
		// 부모의 기능은 가져올 수 있지만, 자식의 기능은 가져올 수 없다.
		s1.set화면("레티나 디스플레이");
		
		System.out.println("s1의 화면은 " + s1.get화면() + " 입니다.");
		
		s1.set통신사("KT");
		
		System.out.println("s1의 통신사는 " + s1.get통신사() + " 입니다.");
		
		s1.set성능("최신");
		
		System.out.println("s1의 성능은 " + s1.get성능() + " 입니다.");
		
		// 부모의 기능을 상속받은 자식을 호출하면
		// 모두 사용 가능 하다.
		아이폰 s2 = new 아이폰();
		s2.set화면("OLED");
		s2.set통신사("SKT");
		s2.set성능("초고속");
		s2.setIOS(1);
		System.out.println(s2.toString());
		
		System.out.println("===============");
		
		스마트폰 s3 = new 갤럭시();
		s3.set화면("아몰레드");
		s3.set통신사("LGT");
		s3.set성능("평균 이하");
		
		// 무조건 갤럭시에 있는 s3.안드로이드 를 가지고 와서 써야할 때
		// 다운캐스팅 : 강제 형변환을 한 뒤에 불러와야 한다.
		갤럭시 s4 = (갤럭시) s3;
		s4.set안드로이드(4); // s3 을 s4 에 담아서 사용할 수 있도록 해준 것
		
		System.out.println(s4.toString());
		
	}

}
