package com.kh.StackEx;

import java.util.*;

/*
 Stack(스택) : 데이터를 저장하는 자료 구조이다.
 	         LIFO : Last In - First Out 즉, 마지막에 추가된 항목이 먼저 제거된다는 뜻이다.
 	         뒤로 가기 기능이나, 실행 취소 기능을 코딩할 때 많이 사용한다.
 	         
 	메서드
 		 .pop() : 맨 위 값을 제거하고 반환(보여준다)
 		.peek() : 스택이나 큐에서, 맨 위 또는 맨 앞에 있는 데이터를 반환(보여준다) 하지만, 제거하지는 않는다.
 		.push() : 스택에서 값을 추가할 때는 .push() 또는 .add() 를 사용한다.
 				  스택에서는 주로 .push() 를 사용한다.
 				  .add() 는 주로 리스트나 컬렉션에서 사용한다.
 				  Stack 클래스가 Vector 를 상속받아 만들어진 클래스이기 때문에, .add() 도 사용 가능하다.
 	 .isEmpty() : 값이 비어있는지 확인할 때 사용한다.
 		.size() : 크기를 확인할 때 사용한다.
 */
public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> 스택 = new Stack<>();
		스택.add(1);
		스택.add(2);
		스택.add(3);
		
		// 스택에서 맨 위에 있는 데이터를 확인하고, 지우기
		int 맨위 = 스택.pop(); // .pop() : 맨 위에 있는 데이터를 제거하고, 그 값을 반환(출력)할 때 사용한다.
		System.out.println(맨위);
		
		int 숫자확인 = 스택.peek(); // .peek() : 스택에서, 맨 위에 어떤 값이 있는지 확인할 때 사용한다.
		System.out.println(숫자확인);
		
		// .isEmpty() : 스택이 비어있는지 확인할 때 사용한다.
		boolean 비었나 = 스택.isEmpty();
		System.out.println(비었나);
		
		System.out.println("======== 스택 2 ========");
		
		Stack<Integer> 스택2 = new Stack<>();
		스택2.push(1);
		스택2.push(2);
		스택2.push(3);
		스택2.push(4);
		스택2.pop();
		System.out.println("가장 마지막에 추가되고 사라진 4를 제외한 스택 2의 값 : " + 스택2);
		
		int 맨윗값 = 스택2.peek();
		System.out.println("스택 2의 맨 윗 값은 : " + 맨윗값);
		
		boolean 값존재유무 = 스택2.isEmpty();
		System.out.println("스택 2가 비어있나요? : " + 값존재유무);
		
		int 크기 = 스택2.size();
		System.out.println("스택 2의 크기는? : " + 크기);
	}
}
