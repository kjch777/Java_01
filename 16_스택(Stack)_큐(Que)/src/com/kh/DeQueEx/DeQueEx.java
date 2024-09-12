package com.kh.DeQueEx;

import java.util.*;

/*
 Deque(덱) : 양쪽 끝에서 삽입과 삭제가 모두 가능하다.
 			스택 + 큐 의 기능을 모두 제공하고, 양방향으로 데이터를 추가하거나 제거할 수 있다.
 	메서드
 		.addFirst() : 맨 앞에 값을 추가할 때 사용한다. 
 		 .addLast() : 맨 뒤에 값을 추가할 때 사용한다.
     .removeFirst() : 맨 앞의 값을 제거할 때 사용한다.
      .removeLast() : 맨 뒤의 값을 제거할 때 사용한다.
        .getFirst() : 맨 앞의 값이 무엇인지 확인할 때 사용한다. (제거하지는 않는다.)
         .getLast() : 맨 뒤의 값이 무엇인지 확인할 때 사용한다. (제거하지는 않는다.)
 
 Deque 도 인터페이스이기 때문에, ArrayDeque 로 된 객체를 사용하여 공간을 생성한다.
 */
public class DeQueEx {
	public static void main(String[] args) {
		// Deque 생성하기
		Deque<Integer> 덱 = new ArrayDeque<>();
		
		// 맨 앞에 값 추가하기
		덱.addFirst(1);
		덱.addFirst(2);
		덱.addFirst(3);
		System.out.println("addFirst 로 값 추가 결과 : " + 덱);
		
		// 맨 뒤에 값 추가하기
		덱.addLast(4); // .add() 는 .addLast() 와 비슷하다.
		덱.addLast(5);
		덱.addLast(6);
		System.out.println("addLast 로 값 추가 결과 : " + 덱);
		
		// 맨 앞의 값 제거하기
		덱.removeFirst();
		System.out.println("removeFirst 로 값 제거 결과 : " + 덱);
		
		// 맨 뒤의 값 제거하기
		덱.removeLast();
		System.out.println("removeLast 로 값 제거 결과 : " + 덱);
		
		// 맨 앞의 값 확인하기
		int 맨앞값 = 덱.getFirst();
		System.out.println("맨 앞 값 : " + 맨앞값);
		
		// 맨 뒤의 값 확인하기
		int 맨뒷값 = 덱.getLast();
		System.out.println("맨 뒷 값 : " + 맨뒷값);
	}
}
