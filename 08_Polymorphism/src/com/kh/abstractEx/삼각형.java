package com.kh.abstractEx;

// 도형에다 작성한 메서드를 사용하겠다. : extends 도형

// 도형 클래스는 아직 완성되지 않은 설계도

public class 삼각형 extends 도형 {

// 필드
	private double 밑변;
	private double 높이;
	
// 메서드
	// 필수 생성자
	// 도형에 있는 필드를 작성해주지 않아서 에러가 뜬 것이다.
	// 도형에서 String 색깔을 작성해줬다면, 삼각형에서도 String 색깔과 super(색깔)을 작성해줘야 한다.
	public 삼각형(String 색깔, double 밑변, double 높이) {
		super(색깔);
		this.밑변 = 밑변;
		this.높이 = 높이;
	}
	
	@Override
	public double 도형넓이() {
		return 0.5 * 밑변 * 높이;
	}
	/*
	 Math : 수학
	  	sqrt : 제곱근을 계산하는 메서드
	  	       제곱근 : 어떤 수를 곱해서 얻은 결과가, 원래의 수가 되도록 하는 수 
	  	 pow : 주어진 값을 거듭 제곱하는 메서드 
	  	     거듭 제곱 : 똑같은 수나 식을 반복해서 곱하는 것 
	 */
	@Override
	public double 도형둘레() {
		double 빗변 = Math.sqrt(Math.pow(밑변, 2) + Math.pow(높이, 2));
		return 밑변 + 높이 + 빗변;
	}
	
}
