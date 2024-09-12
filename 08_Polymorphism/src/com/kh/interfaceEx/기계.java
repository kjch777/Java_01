package com.kh.interfaceEx;
/*
 interface : class 간의 접점을 만드는 용도 
 	필드에 작성하는 모든 변수가 자동으로
 		public static final 로 작성이 된다.
 	굳이 앞에 public static final 을 붙이지 않아도 알아서 붙는다.
 	
 	메서드에 작성하는 모든 메서드 앞에
 		    public abstract 가 알아서 자동으로 붙어서 작성된다.
 		    
 Q : interface 는 왜 public static final 과 public abstract 가 붙는가?
 A : interface 는 자바에서, 다른 클래스에서 구현할 메서드의 명세를 정의하는 역할을 한다.
 	 interface 에 작성되는 필드와 메서드는, 다른 클래스에서 구현될 것을 기대하는 것
 	 
 	 interface 에서 작성된 값은 절대불변의 고정된 상수이다.
 */

public interface 기계 {

// 필드
	// (public static final) 이 자동으로 생성되어 있다.
	// public static final int 볼트 = 220; 인거나 다름없다.
						   int 볼트 = 220;
						   
	// interface 는 추상 메서드만 작성이 가능하다.
		   public abstract void 전원켜기();
		   
		// public abstract 가 자동으로 생성되어 있는 상태이다.   
		// public abstract void 전원끄기(); 와 똑같다.
						   void 전원끄기();
}
