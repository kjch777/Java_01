package com.kh.QueueEx;

import java.util.*;

/*
 Queue(큐) : 먼저 추가된 항목이 먼저 제거된다.
 	First In - First Out : 추가된 순서대로 제거된다.
 			데이터가 줄을 서있는 것과 유사하며, 가장 먼저 들어간 항목이 가장 앞에 위치한다.
 			대기열이나 이벤트를 처리할 때 사용한다.
 			
 	메서드
 		.offer() : 큐에 공간이 충분한 경우 값이 추가되고, 추가되면 true 를 반환한다.
 				   추가되지 못하면 예외 처리가 된다.
 				   .add() 를 사용할 수도 있지만, .offer() 와 마찬가지로 공간이 없다면 예외 처리가 된다.
 		 .poll() : 값을 제거하고 반환한다. 만약, 비어있는 경우 null 을 반환한다.
 	   .remove() : .poll() 과 동일한 기능을 수행하지만, 비어있는 경우 예외 처리가 된다.
 	     .peek() : 맨 앞에 있는 값을 반환하지만, 제거하지는 않는다.
 	  .element() : .peek() 처럼 맨 앞에 있는 값을 반환하지만, 제거하지는 않는다. 단, 비어있는 경우 예외 처리가 된다.  
 */
public class QueueEx {
	public static void main(String[] args) {
		
		// Queue 는 인터페이스이기 때문에, Queue = Queue 형식으로 사용할 수 없다.
		// 따라서 주로 Queue = LinkedList 형식으로 사용한다.
		Queue<Integer> 큐 = new LinkedList<>();
		
		// 큐에 데이터 추가하기
		큐.offer(1);
		큐.offer(2);
		큐.offer(3);
		
		// 큐에서, 맨 앞에 있는 데이터를 확인 후 제거하기
		int 맨앞 = 큐.poll(); // 가장 먼저 추가된 값 1 을 확인 후 제거하는 코드
		System.out.println(맨앞);
		
		// 큐 맨 앞 데이터 확인
		int 데이터확인 = 큐.peek(); // 1 제거 후, 가장 앞에 있는 값인 2 를 확인하는 코드
		System.out.println(데이터확인);
		
		boolean 비었나 = 큐.isEmpty();
		System.out.println("비었나? : " + 비었나);
	}
}
