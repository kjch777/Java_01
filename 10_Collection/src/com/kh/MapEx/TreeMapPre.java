package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {

	public static void main(String[] args) {
		TreeMap<String, String> 과일들 = new TreeMap<>();
		
		
		String[] 키들 = {"apple", "banana", "orange", "grape", "watermelon"};
		String[] 밸류들 = {"사과", "바나나", "오렌지", "포도", "수박"};
		
		for(int i = 0; i < 키들.length; i++) {
			과일들.put(키들[i], 밸류들[i]);
		}
		
		// 전체 출력
		System.out.println("과일들 키=밸류 전체 목록 : " + 과일들);
		
		// .get() 메서드 사용
		System.out.println("banana 는 " + 과일들.get("banana"));
		
		// .size() 메서드 사용
		System.out.println("과일들이 몇개 있습니까? : " + 과일들.size() + " 개 있습니다.");
		
		// .isEmpty() 메서드 사용
		System.out.println("과일들이 한개도 없습니까? : " + 과일들.isEmpty());
		
		// .containsKey() 메서드 사용
		System.out.println("grape 키가 존재합니까? : " + 과일들.containsKey("grape"));
		
		// .containsValue() 메서드 사용
		System.out.println("포도 밸류가 존재합니까? : " + 과일들.containsValue("포도"));
		
		// .keySet() 메서드 사용
		System.out.println("과일들 키 전체 출력 : " + 과일들.keySet());
		
		// .values() 메서드 사용
		System.out.println("과일들 밸류 전체 출력 : " + 과일들.values());
		
		// .firstKey() 메서드 사용
		System.out.println("과일들의 첫번째 키 출력 : " + 과일들.firstKey());
		
		// .lastKey() 메서드 사용
		System.out.println("과일들의 마지막 키 출력 : " + 과일들.lastKey());
		
		// .clear() 메서드 사용
		과일들.clear();
		System.out.println("과일들이 한개도 없습니까? : " + 과일들.isEmpty());
		
	}

}
