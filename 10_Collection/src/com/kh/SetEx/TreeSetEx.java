package com.kh.SetEx;

import java.util.*;

/*
 TreeSet : 중복을 허용하지 않고, 값을 자동으로 정렬하는 구조이다.
 		   검색 트리의 형태로 데이터를 저장하며, 자동으로 정렬된 상태를 유지한다.
 		   자동으로 0 ▶ 9, A ▶ Z, a ▶ z, ㄱ ▶ ㅎ 순서로 정렬해준다.
 	    
 	     .add() : 추가
 	  .remove() : 제거
 	.contains() : 지정된 값이 있는지 확인할 때 사용한다.
 	 .isEmpty() : TreeSet 이 비어있는지 확인할 때 사용한다.
 	    .size() : 갯수 확인
 	   .first() : 가장 작은 데이터를 반환할 때 사용한다.
 	    .last() : 가장 큰 데이터를 반환할 때 사용한다.
 	   .clear() : 모든 값을 제거할 때 사용한다.
 */
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(); // Set 은 중복 값 존재가 불가능한, 호주머니 같은 존재이다.
		                                       // 호주머니 같다는건, 안에 순서대로 구분이 되어 있지 않다는 의미이다.
		
		// 추가
		ts.add(5);
		ts.add(2);
		ts.add(1);
		
		System.out.println("TreeSet 모두 보기 : " + ts);
		
		// 제거
		ts.remove(2);
		System.out.println("TreeSet 모두 보기 : " + ts); 
		// 단축키 : 코드 줄 이동 == Alt + 화살표 위/아래
		// 단축키 : 코드 줄 삭제 == Ctrl + D
		
		// 값이 포함되어 있는지 확인하기
		System.out.println(ts.contains(5)); // 반환타입 : boolean // 있으면 true
		// 반환타입 == 출력타입
		
		// 비어있는지 확인하기
		System.out.println(ts.isEmpty()); // 반환타입 : boolean // 비어있으면 true
		// 반환타입 == 출력타입
		
		// 데이터 갯수 확인하기
		System.out.println(ts.size());
		
		// 가장 작은 값 확인하기
		System.out.println(ts.first());
		
		// 가장 큰 값 확인하기
		System.out.println(ts.last());
		
		// 모든 값 제거
		ts.clear();
		System.out.println("모두 보기 : " + ts);
	}
}
