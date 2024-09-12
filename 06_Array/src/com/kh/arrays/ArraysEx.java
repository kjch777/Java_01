package com.kh.arrays;

import java.util.Arrays;

/*
 Arrays란?
 	배열과 관련된 다양한 작업을 쉽게 처리할 수 있도록 도와주는 기능의 모음이다.
 	정렬, 복사, 비교 등을 할 수 있다.
 
 		method
 			  .sort(); : 배열을 정렬해준다.
 			.copyOf(); : 배열을 복사해서 똑같은 배열을 만들어준다.
 			.equals(); : 두 배열이 똑같은지 비교해준다.
 			  .fill(); : 배열을 모두 지정된 값으로 채워준다.
 		  .toString(); : 배열을 문자열로 변경해서 보여준다. 
 		                 사람이 이해할 수 있는 결과 값을 출력하려면 이걸 꼭 써야하는 것 같다.
 		    .asList(); : 배열을 리스트로 변환하여 추가하는 것으로, 배열을 수정하지 않고 배열의 내용을 감싸서 보여준다.
 		    			 
 		    			 예를 들어
			 		     String[] 배열 = {"사과", "바나나"}; 를 List 계열에 추가할 때,
			 		     
			 		     ArrayList<String> 리스트 = Arrays.asList(배열);
			 		     ArrayList<String> 리스트 = Arrays.asList("사과", "바나나");
 */
public class ArraysEx {
	
	// main method
	public static void main(String[] args) {
	
		// 숫자 배열 생성
		//	   index 0  1  2  3  4		length 값은 5
		int[] num = {5, 8, 2, 4, 3};
		
		// 정렬
		Arrays.sort(num);
		
		// 정렬됐는지 출력해보기
		System.out.println(num); // 배열이 위치한 주소값을 출력
		System.out.println(Arrays.toString(num)); // 배열을 오름차순으로 정렬한 것을, 문자열로 변경해서 출력
		
		// 배열 복사
		// 배열을 복사할 때는, 배열이 들어갈 변수명을 먼저 생성 해주어야 한다.
		// int 배열이면 int 배열을 생성 해주어야 한다.
		int[] abc = Arrays.copyOf(num, 			num.length);
		//              복사 붙여넣기 복사 될 변수		복사 할 범위
		
		// num 변수가 abc 변수로 잘 복사 됐는지 확인
		System.out.println("num 이 복사 된 abc : " + Arrays.toString(abc));
		
		// 두 배열이 똑같이 생겼는지 확인해보기
		boolean same = Arrays.equals(num, abc); // 소괄호 ( ) 안의 순서는 상관 없다.
		System.out.println("num 과 abc 는 똑같나요? : " + same);
		
		// 0 ~ 4 의 자리까지 모두 똑같은 값으로 지정하고 출력해보기
		int[] sameNumbers = new int[5];
		Arrays.fill(sameNumbers, 3);
		System.out.println("숫자 3 으로 모두 채우기 : " + Arrays.toString(sameNumbers));
		
	}
	
}
