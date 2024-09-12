package com.kh.CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 Collections 인터페이스 : 파일들을 연결시켜 주는 존재 
 					  List, Set 의 부모 class
 					  순차적으로 회전하면서 코드를 조회하거나, 코드 안에 작성한 내용을 순회하고,
 					  추가, 삭제, 검색 등의 기본 작업을 제공한다.
 					 
 .sort() : 리스트를 기본 정렬 순서에 따라 정렬할 때 사용한다.
 		1.  숫자 : 오름차순 정렬 // 작은 값에서 큰 값의 순서로 정렬
 		2. 문자열 : 문자의 사전 순서에 따라 정렬
 		3. 내가 파일을 만들면서 정한 기준에 따라 정렬 : compareTo() 메서드를 사용하여, 정렬 기준을 작성할 수 있다.
 		
     min, max : 최소값, 최대값
 binarySearch : 이진 탐색(2개의 갈래로 나아간다는 뜻)을 사용하여 리스트에서 지정된 요소를 찾을 때 사용한다.
 				이진 탐색 : 정렬된 배열이나 리스트에서, 특정한 값의 위치를 찾는 알고리즘
 						배열 또는 리스트를 반으로 나눠, 탐색 범위를 좁혀가면서 값을 찾아내는 것이다.
 						또는 이분(2개로 나눈다는 뜻) 탐색이라고도 한다.
 						
 .addAll() : 내가 추가하고자 하는 모든 값을 추가할 때 사용한다.
 */
public class CollectionEx {

	public static void main(String[] args) {
		// 정렬
		ArrayList<Integer> 숫자들 = new ArrayList<>();
		숫자들.add(3);
		숫자들.add(5);
		숫자들.add(4);
		숫자들.add(1);
		숫자들.add(2);
		System.out.println(숫자들 + "\n");
		
		// 컬렉션을 사용해서 오름차순으로 정렬하기
		Collections.sort(숫자들);
		System.out.println(숫자들);
		
		// ArrayList 에서 .add() 로 하나씩 추가하는 것이 아니라, 추가하고 싶은 값을 한번에 전부 추가하기
		//                                      ( ) 안에 Arrays.asList() 를 작성해주면, 넣고 싶은만큼 추가가 가능하다.
		ArrayList<String> 색상들 = new ArrayList<>(Arrays.asList("black", "white"));
		System.out.println(색상들);
		
	}
	
}
