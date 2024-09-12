package com.kh.interfaceEx;

// 계산기와 기계 인터페이스를 불러와서 재사용 및 완성시킨다.
public class 중학생용계산기 implements 계산기, 기계 {
	
	// 기계 인터페이스 값 모두 가져와서 완성하기
	@Override
	public void 전원켜기() {
		System.out.println("전원을 켭니다.");
	}
	
	@Override
	public void 전원끄기() {
		System.out.println("전원을 끕니다.");
	}
	
	// 계산기 인터페이스 값 모두 가져와서 완성하기
	@Override
	public int 합(int a, int b) {
		return a+b;
	}
	
	@Override
	public int 차(int a, int b) {
		return a-b;
	}
	
	@Override
	public int 곱(int a, int b) {
		return a*b;
	}
	
	@Override
	public double 몫(int a, int b) {
		return a/b;
	}
	
	@Override
	public int 나머지(int a, int b) {
		return a%b;
	}

}
