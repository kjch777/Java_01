package com.kh.StackEx;

import java.util.*;

public class StackPre {
	public static void main(String[] args) {
		Stack<Integer> 스택 = new Stack<>();
		스택.push(10);
		스택.push(30);
		스택.push(40);
		스택.push(50);
		스택.push(20);
		System.out.println("스택의 현재 값 목록 : " + 스택);
		
		System.out.println("지운 값 : " + 스택.pop());

		System.out.println("맨 윗 값 : " + 스택.peek());
		
		System.out.println("비어있는지 확인 : " + 스택.isEmpty());
		
		System.out.println("스택의 현재 크기 : " + 스택.size());
	}
}
