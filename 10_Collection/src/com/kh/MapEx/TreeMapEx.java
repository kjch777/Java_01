package com.kh.MapEx;

import java.util.TreeMap;

/*
 TreeMap 이진검색트리 : 데이터 검색, 삽입, 삭제, 연산을 빠르게 수행해준다.
 키 - 값 (key - value) 의 형태로 저장하는 자료 구조
 키를 기준으로 정렬하여 저장한다. (정렬 순서 : 0 ▶ 9, A ▶ Z, a ▶ z, ㄱ ▶ ㅎ) 
 
 					  메서드
 					  
 	   .put(key, value) : TreeMap 에 키 - 밸류 추가
 	          .get(key) : 지정된 키에 있는 밸류 값을 전달
 	  .containsKey(key) : 키가 포함되어 있는지 확인
 	.containsKey(value) : 밸류가 포함되어 있는지 확인
 	       .remove(key) : 지정된 키와 값을 삭제
 	            .size() : (저장되어 있는)키-값 쌍의 갯수 반환
 	         .isEmpty() : 비어있는지 확인
 	           .clear() : 모두 제거
 */
public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		// .put() 사용하여 값 추가
		// tm.put(1, "One");
		
		// 값을 한 번에 추가하고 싶다면
		Integer[] keys = {1, 2, 3};
		String[] values = {"One", "Two", "Three"};
		
		// 반복문 사용
		for(int i = 0; i < keys.length; i++) {
			tm.put(keys[i], values[i]);
		}
		
		// Map 또한 키 중복이 되지 않기 때문에, 밸류가 다를 경우, 맨 아래에 작성한 밸류가 자동으로 덮어씌워진다.
		
		System.out.println(tm);
		
		// .get() 메서드를 사용하여 값 가져오기
		System.out.println(tm.get(2));
		
		// .remove() 메서드를 사용하여 키-밸류 제거
		tm.remove(3);
		System.out.println(tm);
		
		// .containsKey() 메서드를 사용하여 키가 있는지 확인해보기
		System.out.println(tm.containsKey(1));
		
		// .size() 메서드를 사용하여 갯수 확인해보기
		System.out.println(tm.size());
		
		// .isEmpty() 메서드를 사용하여 비어있는지 확인하기
		System.out.println(tm.isEmpty());
		
		// .clear() 메서드를 사용하여 모든 값 제거하기
		tm.clear();
		System.out.println(tm);
		
	}
}
