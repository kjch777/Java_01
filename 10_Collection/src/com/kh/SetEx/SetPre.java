package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	
// 메서드
	// 메인 
	public static void main(String[] args) {
		// main + Ctrl + Space
		
		HashSet<String> set = new HashSet<>();
		
		// .add(); 로 값 추가 // 꽃게랑 3번 추가 // 중복 값은 자동으로 덮어쓰기 된다.
		set.add("새우깡");
		set.add("고래밥");
		set.add("꽃게랑");
		set.add("꽃게랑");
		set.add("꽃게랑");
		set.add("맛동산");
		set.add("오징어땅콩");
		set.add("알새우칩");
		
		System.out.println(set); 
		
		// .size() 로 크기 확인 // 확인은 출력을 해야 가능하다.
		System.out.println(set.size());
		
		// .contains() 로 맛동산이 존재하는지 확인 // 확인은 출력을 해야 가능하다.
		System.out.println(set.contains("맛동산")); // 값이 true 또는 false 로 나온다.
		
		// .remove(); 로 고래밥 제거
		set.remove("고래밥");
		System.out.println(set);
		
		// .isEmpty() 로 데이터가 모두 제거 되었는지 확인 // 확인은 출력을 해야 가능하다.
		System.out.println(set.isEmpty()); // 값이 true 또는 false 로 나온다.
		
	}
	
}
