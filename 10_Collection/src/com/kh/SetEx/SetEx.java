package com.kh.SetEx;

import java.util.HashSet; // 항상 .util 이 기본이다.

/*
 set(집합, 주머니)
  	 순서를 유지하지 않는다.
  	 중복 데이터 저장을 해주지 않는다. (같은 값이 들어오면 자동으로 덮어쓰기 된다.)
  	 
  	 ┌ LinkedHashSet : 순서를 유지하는 set
 set ├   HashSet (대표적) : 처리 속도가 빠른 set
     └       TreeSet : 자동 정렬되는 set
     
		 HashSet 사용 예제
		 		 사용 조건 1 : 객체에 equals() 가 오버로딩 되어 있어야 한다. 
		 		 사용 조건 2 : 객체에 hashCode() 가 오버로딩 되어 있어야 한다.
		 		 
		 Set<자료형> 셋 = new HashSet<>();
		 HashSet<자료형> 해시셋 = new HashSet<>();
     
 */
public class SetEx {

	public static void main(String[] args) {
		
		// 중복을 허용하지 않고, 각 값을 저장하는 것을 생성하기 때문에,
		// 데이터 중복 확인에 많이 사용한다.
		HashSet<String> set = new HashSet<>();
		
		// 데이터를 추가할 때는 .add()
		set.add("로맨스");
		set.add("호러");
		set.add("액션");
		set.add("스릴러");
		
		// 출력할 때는 .add() 로 추가한 값이 랜덤한 순서로 나온다.
		System.out.println(set);
		
		// 데이터를 확인할 때는 .get()
		// System.out.println(set.get(1));
		// set 은 자리가 랜덤하고, 특정하게 자리 번호로 배정된 자리가 없기 때문에 에러가 난다.
		
		// 데이터를 제거할 때는 .remove()
		set.remove("로맨스");
		System.out.println(set);
		
		// 데이터의 크기를 확인할 때는 .size() // 확인은 출력을 해야 가능하다.
		System.out.println(set.size());
		
		// 데이터를 모두 제거할 때는 .clear()
		set.clear();
		System.out.println(set);
		
		// 특정 데이터가 존재하는지 확인할 때는 .contains() // 확인은 출력을 해야 가능하다.
		System.out.println(set.contains("스릴러")); // 값이 true 또는 false 로 나온다.
		
		// 데이터를 수정할 때는 .set()
		// set.set();
		// set 은 자리가 랜덤하고, 특정하게 자리 번호로 배정된 자리가 없기 때문에 에러가 난다.
	}

}
