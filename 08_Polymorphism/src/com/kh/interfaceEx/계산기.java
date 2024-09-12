package com.kh.interfaceEx;

// class 와 interface 는 다르다.
public interface 계산기 {

// 필드 public static final
	// final 의 경우, 절대불변의 고정된 상수이기 때문에, 영어일 때는 전부 대문자로 작성한다.
	double PI = 3.14;
	int 최소값 = -100_000_000;
	int 최대값 = 100_000_000;

// 메서드 합 차 곱 몫 나머지 를 사용해달라고 작성만 해뒀지, 계산식을 넣어주진 않았다.
	// 미완성이지만, 다른 곳에서 계산기를 불러올 때 필수로 불러와서 완성해줘야 하는 메서드를 작성한 것
	
	// 전달 받은 두 정수의 합
	public abstract int 합(int a, int b);

	// 전달 받은 두 정수의 차
	public abstract int 차(int a, int b);
	
	// 전달 받은 두 정수의 곱
	public abstract int 곱(int a, int b);
	
	// 전달 받은 두 정수의 나누기 몫
	public abstract double 몫(int a, int b);
	
	// 전달 받은 두 정수의 나누기 나머지
	public abstract int 나머지(int a, int b);
	
}
