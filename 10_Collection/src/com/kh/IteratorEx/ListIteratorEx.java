package com.kh.IteratorEx;

import java.util.*; // .util.*;

/*
 					ListIterator
 									
 					.next() 는 순서대로 // 앞에서부터
			     .hasNext() : 다음 값이 존재하는지 true false 로 확인할 때 사용한다.
			        .next() : 다음 값 가져오기
			        
				.previous() 는 역순으로 // 뒤에서부터	        
			 .hasPrevious() : 이전 값이 존재하는지 true false 로 확인할 때 사용한다.
			    .previous() : 이전 값 가져오기
			    
			      값을 추가하거나 삭제할 때
			      
			         .add() : 추가
			      .remove() : 삭제
 */
public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList<String> 색상들 = new ArrayList<>(Arrays.asList("하양", "초록"));
		색상들.add("빨강");

		ListIterator<String> 반복하기 = 색상들.listIterator();

		System.out.println("앞에서부터 출력하기");
		while (반복하기.hasNext()) {
			String 색상 = 반복하기.next();
			System.out.println(색상); // 추가한 순서대로 출력된다.
		}

		System.out.println("=====");

		System.out.println("뒤에서부터 출력하기");
		while (반복하기.hasPrevious()) {
			String 색상 = 반복하기.previous();
			System.out.println(색상); // 추가한 순서의 역순으로 출력된다.
		}

		System.out.println(".add() 를 사용하여 추가하기");
		반복하기.add("파랑");
		// .add() 로 값을 추가하고 출력해보면, 추가한 순서대로 출력된다.
		System.out.println(색상들);

		// 먼저 .previous() 를 사용하여, 현재 위치를 파랑의 위치로 이동시키기
		반복하기.previous();
		반복하기.remove();
		System.out.println("삭제 됐는지 확인하기 ▶ " + 색상들);
		/*
		 System.out.println(색상들); 
		 
		 Exception in thread "main"
		 java.lang.IllegalStateException at
		 java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980) at
		 com.kh.IteratorEx.ListIteratorEx.main(ListIteratorEx.java:47)
		 
		 .add() 로 값을 추가하면서 앞으로 이동한 다음에는, 현재 위치가 자동으로 리스트의 끝에 자리하게 된다.
		 따라서, 더이상 다음이 없기 때문에 삭제할 수 없다.
		 
		 해결 방법
		 .next() 를 호출하여 현재 위치를 변경한 다음, .remove() 를 호출하거나,
		 .previous() 를 호출하여 현재 위치를 변경한 다음, .remove() 를 호출한다.
		 */

	}
}
