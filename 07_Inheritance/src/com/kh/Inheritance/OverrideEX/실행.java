package com.kh.Inheritance.OverrideEX;
/*
 동물 
  ▼ 강아지 
  ▼ 고양이
*/
public class 실행 {

	// main method : 최종 출력 및 실행할 코드를 작성하는 공간
	public static void main(String[] args) {
		
		강아지 강아지1번 = new 강아지("댕댕");
		
		강아지1번.소리();
		
		고양이 고양이1번 = new 고양이("고영희");
		
		고양이1번.소리();
		
		소 소1번 = new 소("한우");
		
		소1번.소리();
		
		토끼 토끼1번 = new 토끼("귀쟁이");
		
		토끼1번.소리();

	}

}
