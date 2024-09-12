package com.kh.arrayList;

import java.util.ArrayList;

/*
ArrayList란?
 	리스트는 배열과 비슷하지만, 길이가 제한되어 있지 않다는 점이 다르다.
 	길이 제한이 없고, 원하는 만큼 담을 수 있다.
 	
ArrayList는 이미 있는 기능의 이름이기 때문에, 이름을 지을 때 절대 사용해선 안 된다.

ArrayList<자료형> 변수명 = new ArrayList<자료형>();
				
				사용할 때 표기법 // 맨 앞 글자를 대문자로 바꿔서 사용한다.
							int    ▶ Integer
							String ▶ String 
							double ▶ Double
							char   ▶ Character
				
				.add 		: 추가
				.get 		: 반환
				.set 		: 수정
				.remove 	: 삭제
				.size 		: 갯수(크기) 확인
				.isEmpty 	: 비어있는지 확인
				.clear 		: 모두 삭제
				.IgnoreCase : for 문에서 대/소문자 구분없이 비교하고 싶을 때 사용한다.
				.length		: 최대 길이를 자동으로 대입하고 싶을 때 사용한다.
*/
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		// 자리가 비어있기 때문에
		System.out.println(num.isEmpty()); // true 가 출력된다.
		
		// 숫자 추가하기
		// index 란 자리위치를 뜻하고, 0 부터 시작한다.
		num.add(10); // index 0 에는 10 을 넣기
		System.out.println("추가됐는지 확인해보기 : " + num.get(0));
		
		// 이젠 자리가 비어있지 않기 때문에
		System.out.println(num.isEmpty()); // false 가 출력된다.
		
		// 크기 확인
		// ArrayList 에서 크기를 확인할 땐 size 를 사용하지, length 는 쓰지 않는다.
		System.out.println(num.size());
		
		// set : 수정할 때 사용한다.
		//   원래 위치      새로 바꾸고 싶은 값, 즉, 숫자가 아니어도 된다.
		//     key			   value
		num.set(0, 				20);
		System.out.println("수정 후 : " + num.get(0));
		
		// remove : 삭제할 때 사용한다.
		num.remove(0);
		
		// 바로 위에서 삭제했기 때문에 아무것도 없는 상태에서
		// System.out.println(num.get(0));
		System.out.println(num.isEmpty());
	}
			
}
