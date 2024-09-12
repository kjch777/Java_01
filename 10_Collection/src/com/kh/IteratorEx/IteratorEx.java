package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator; // 대부분의 경우 .util 을 고르면 된다.

/*
 Collection(List, Set, Map)을 반복하는 데에 사용하는 것들 ▼
 
	  Enumeration : 더이상 사용되지 않는다. Vector의 경우처럼 오래된 버전 클래스에서만 사용된다.
	 
	     Iterator : 반복하는 데에 사용한다.(순차적으로 회진한다.)
	 			    읽기만 가능하고, 추가하거나 삭제할 수 없다.
	 
	 ListIterator : Iterator의 업그레이드 버전이다.
	 			    List(Vector, ArrayList, LinkedList) Collection에서만 사용한다.
	 			    양방향으로 순차적 회진할 수 있다.
	 			    양방향으로 순회 == 앞뒤로 이동 가능
	 			    추가하거나 삭제할 수 있다.
	 			    
 Iterator 하위에 존재하는 메서드들
 	.hasNext() : 다음이 있는지 없는지 확인할 때 사용한다.
 	 			 만약 존재한다면 true // 존재하지 않는다면 false
 	 			
 	   .next() : 다음 것을 가지고 올 때 사용한다.
 	   			 .hasNext() 를 사용해서 다음이 있는지 없는지를 먼저 확인하고,
 	   			 .next() 를 사용하는 것이 안전하다.(그렇지 않으면 exception 에러 날 수 있음)
 */
public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<String> 과일들 = new ArrayList<>();
		과일들.add("사과");
		과일들.add("블루베리");
		과일들.add("패션후르츠");
		과일들.add("망고");
		
		// Iterator 생성
		Iterator<String> 반복 = 과일들.iterator();
		
		// .hasNext() 로 다음 값이 있는지 먼저 확인 // 값이 true false 로 나온다.
		while(반복.hasNext()) {
			
			// .next() 로 다음 값 가져오기
			String 과일 = 반복.next();
			System.out.println(과일);
		}
	}
}
