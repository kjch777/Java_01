package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {

// 메서드
	// 기본 생성자
	public MapPre() {
		// Ctrl + Space
	}
	
	// 출력 void
	public void practice1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "에그마요");
		map.put(3, "로티세리 바베큐");
		map.put(2, "스파이시 쉬림프");
		System.out.println(map);
	}
	
	public void practice2() {
		//                                   <이 안에는 자료형을 안 넣어줘도 상관 없다.>
		Map<String, String> map = new HashMap<String, String>();
		
		// .put() 사용하기
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데 타워", "서울시 송파구"); // 띄어쓰기 주의
		
		// 전체 출력
		System.out.println("전체 목록 : " + map);
		
		// .get() 사용해서 출력하기
		System.out.println("롯데 타워 소재지는 " + map.get("롯데 타워") + " 입니다.");
		
		// .remove() 사용해서 등산 삭제하기
		map.remove("등산");
		
		// for - each 문 .keySet() 을 사용하여 전체 목록 출력하기
		
		// (자료형 새로운변수명 : 모집단.keySet()) 
		for(String 남은키   : map.keySet()) {
			String 임시 = map.get(남은키);
			System.out.println(임시 + " 에 위치한 남은 key 는 " + 남은키 + " 입니다.");
		}
	}
	
	public void practice3() {
		// 특정 값이 존재하는지 확인해보기
		
		// <과일명,   가격>
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("체리", 300);
		
		// 200원짜리 과일이 존재하는지 확인해보기
		System.out.println("200원짜리 과일이 있어? : " + map.containsValue(200));
		// containsKey 와 containsValue 모두 boolean 처럼 true false 로 값이 출력된다.
		
		// 체리가 존재하는지 확인해보기
		System.out.println("체리가 있어? : " + map.containsKey("체리"));
		// containsKey 와 containsValue 모두 boolean 처럼 true false 로 값이 출력된다.
		
		// 크기 조회해보기
		System.out.println("현재 map 의 크기 : " + map.size());
	}
	
	public void practice4() {
		Map<Integer, String> map = new HashMap<>();
		
		// .put() 사용해보기
		map.put(2, "에그마요");
		map.put(1, "로티세리 바베큐");
		map.put(4, "스테이크 앤 치즈");
		map.put(3, "스파이시 쉬림프");
		System.out.println(map); // 자동 정렬 된다.
		
		// .get() 사용해보기
		System.out.println("3번 메뉴는 " + map.get(3) + " 입니다.");
		
		// .size() 사용해보기
		System.out.println("전체 크기는 " + map.size() + " 입니다.");
		
		// .remove() 사용해보기
		map.remove(4);
		System.out.println(map); // 자동 정렬 된다.
		
		// .isEmpty() 사용해보기
		System.out.println("map이 비었습니까? : " + map.isEmpty());
		
		// for - each 문 과 .keySet() 사용해보기
		for(int 키 : map.keySet()) {
			String 가치 = map.get(키);
			System.out.println(키 + "번 메뉴는 " + 가치 + " 입니다.");
		}
		
		// 키 - 값을 한번에 가져오는 방법
		//  Map.Entry<key,     value>    : 가져올변수명.entrySet()
		for(Map.Entry<Integer, String> t : map.entrySet()) {
			System.out.println(t.getKey() + " - " + t.getValue());
		}
		
		// .clear() 사용해보기
		map.clear();
		
		
	}
	
	// 최종 메인
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		// mp.practice1();
		// mp.practice2();
		// mp.practice3();
		mp.practice4();
	}
	
}
