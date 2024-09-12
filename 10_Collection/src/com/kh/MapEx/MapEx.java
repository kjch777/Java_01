package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

/*
     ┌ HashMap(대표적) : 검색 속도가 빠르다.(가장 많이 사용한다.) 
 Map ├       TreeMap : 정렬된 데이터가 필요할 때 사용한다.
     └ LinkedHashMap : 순서를 유지하면서 저장하기 때문에, 순서가 중요한 경우에 사용한다.
 
 Map : 특정 키를 입력하면, 해당하는 값을 얻을 수 있는 Collection 객체 
 	   키 == key   (열쇠)
 	   값 == value (가치)
 	   key : value 값으로 구성되어 있다.
 	   
 메서드
 	    .put(key, value) : 지정된 키와, 지정된 값의 쌍을 추가할 때 사용한다.
 	     	   .get(key) : 지정된 키에 저장된 값을 보여줄 때 사용한다.
       .containsKey(key) : 지정된 키가 존재하는지 확인할 때 사용한다.
   .containsValue(value) : 지정된 값이 존재하는지 확인할 때 사용한다.
            .remove(key) : 지정된 키와, 키에 저장된 값을 제거할 때 사용한다.
               .keySet() : 키를 포함하는 집합을 반환할 때 사용한다.
               .values() : 모든 값들을 포함하는 컬렉션을 반환할 때 사용한다.
             .entrySet() : 모든 키-쌍을 포함하는 집합을 반환할 때 사용한다.
 */
public class MapEx {
	public static void main(String[] args) {
		// Map 생성
		Map<String, Integer> 학생들 = new HashMap<>();
		
		// .put(); 을 사용하여 값 추가하기
		//  .추가하기(key, value);
		학생들.put("철수", 90);
		학생들.put("영희", 85);
		학생들.put("민수", 88);
		
		// 전체보기
		System.out.println(학생들);
		
		// .get(); 을 사용하여 조회하기
		System.out.println("철수의 성적 : " + 학생들.get("철수"));
		
		// .remove(); 를 사용하여 삭제하기
		학생들.remove("영희");
		
		// 삭제됐는지 전체보기를 통해서 확인하기
		System.out.println("전체 학생 목록 : " + 학생들);
		
		// 키는 유일해야 한다. 키의 값은 절대 중복이 있을 수 없다. 
		// 따라서 중복 값이 생성된다면, 맨 마지막에 생성된 값으로 자동으로 덮어씌워진다.
		학생들.put("철수", 80);
		System.out.println("철수의 성적 : " + 학생들.get("철수"));
		
		// 학생들 성적 출력하기
		// for - each 문으로 학생들 에 들어있는 key 를 모두 불러오고, 배열해주는 .keySet() 사용해보기
		for(String 이름 : 학생들.keySet()) { // 학생들.keySet() 안에는 {"철수", "민수"} 가 있는 것이다.
			
			// 각 학생의 성적 조회하기
			int 성적 = 학생들.get(이름);
			System.out.println(이름 + " 의 성적은 " + 성적 + " 점 입니다.");
		}
	}
}
