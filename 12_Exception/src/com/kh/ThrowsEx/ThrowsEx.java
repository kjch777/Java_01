package com.kh.ThrowsEx;
/*
 클래스 이름(=파일명) 위치에 한번에 작성해서, try catch 문을 작성할 수고를 덜어준다. 
 try - catch 문을 작성하거나, throws 를 사용하여 예외 처리를 해주면 된다.
 */
public class ThrowsEx {

	public ThrowsEx() {
		// Static void 로 만들기 싫다면, 기본 생성자로..?
	}
	
	public void 메서드() throws Exception{
		System.out.println("예외가 발생했습니다.");
	}
	
	public static void main(String[] args) throws Exception {
		ThrowsEx 쓰로우즈예시 = new ThrowsEx();
		쓰로우즈예시.메서드();
	}
	
}
