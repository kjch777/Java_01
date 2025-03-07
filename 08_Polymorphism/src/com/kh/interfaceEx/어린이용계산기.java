package com.kh.interfaceEx;

// 계산기 기본 사용 메서드 implements 로 가져오기
// 계산기 220v 로 사용할 것
	// 인터페이스는 인터페이스로 만들어진 모든~~ 파일을 제한 없이 가져올 수 있다.
	// 여러 파일을 가지고 올 때는 , 를 써서 인터페이스 파일명을 작성해주면 된다.
public class 어린이용계산기 implements 계산기, 기계 {
	
	/*	기계.java 인터페이스에서 가져온 전원켜기와 전원끄기	*/
	@Override
	public void 전원켜기() {
		System.out.println("전원을 켭니다.");
	}
	
	@Override
	public void 전원끄기() {
		System.out.println("전원을 끕니다.");
	}
	
	/*	계산기.java 인터페이스에서 가져온 합 차 곱 몫 나머지	*/
	@Override
	public int 합(int a, int b) {
		return a + b;
	}
	
	@Override
	public int 차(int a, int b) {
		return a - b;
	}
	
	@Override
	public int 곱(int a, int b) {
		return a * b;
	}
	
	@Override
	public double 몫(int a, int b) {
		return a / b;
	}
	
	@Override
	public int 나머지(int a, int b) {
		return a % b;
	}
	
}
