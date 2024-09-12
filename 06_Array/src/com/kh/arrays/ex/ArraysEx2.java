package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {

// method
	// 기본 생성자
	public ArraysEx2() {
		
	}
	
	// 출력 void
	public void method1() {
		
		// 숫자 배열 생성
		int[] num = {6, 4, 2, 3, 5, 7, 9};
		
		// 숫자 정렬
		Arrays.sort(num);
		
		// 정렬 된 숫자 출력
		System.out.println(Arrays.toString(num));
		System.out.println("====================");
		
		// num 배열 abc 로 복사
		int abc[] = Arrays.copyOf(num, num.length);
		
		// 제대로 복사 됐는지 출력
		System.out.println(Arrays.toString(abc));
		System.out.println("====================");
		
		// num 과 abc 가 같은지 비교
		boolean same = Arrays.equals(num, abc);
		System.out.println("num 과 abc 가 같나요? : " + same);
		System.out.println("====================");
		
		int[] full = new int[3];
		String str = Arrays.toString(full);
		System.out.println("처음 값은 : " + str + " 입니다.");
		System.out.println("====================");
		
		// 숫자 6만 나오게 만들기
		Arrays.fill(full, 6);
		
		// 출력해보기
		System.out.println(Arrays.toString(full));
	}
	
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();

	}

}
