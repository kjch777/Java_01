package com.kh.IteratorEx;
/*
 import 할 때, 동일한 폴더 위치에서 많은 파일을 가져올 때는,
 * 을 사용하여 모두 가져올 수 있다.
 * == 전체선택 
 */
import java.util.*; // .util 
//     java 폴더 안에 있는 util 폴더 안에 
//     존재하는 모든 파일을 가져오겠다는 코드

public class IteratorPre {

	public static void main(String[] args) {
		// 최종 출력 및 실행할 메인 메서드
		
	// ArrayList<자료형풀네임> 변수명 = new ArrayList<>(Arrays.asList(추가할 값들 , 로 구분해서 넣기))
		ArrayList<Integer> 숫자들 = new ArrayList<>(Arrays.asList(100, 10, 20, 30, 50));
		숫자들.add(70); // 또는 변수명.add(추가할 값);
		
		// Iterator 생성
   // Iterator<자료형풀네임> 변수명 = 변수명.iterator();
		Iterator<Integer> 반복 = 숫자들.iterator();
		
		//   변수명.hasNext() 로 다음 값이 있는지 먼저 확인 // 값이 true false 로 나온다.
		while(반복.hasNext()) {
			
	   // 자료형 변수명 = 변수명.next() 로 다음 값 가져오기
			int 숫자 = 반복.next();
			System.out.println(숫자); // 출력
		}

	}

}
