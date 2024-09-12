package com.kh.SetEx;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {

	public static void main(String[] args) {
		
		// String[] 과일바구니 = new String[] {"키위", "복숭아", "참외", "수박"};
		
		// String 키위 복숭아 참외 수박 딸기 // 웬만한건 소괄호 ( ) 안에 넣으면 되는 것 같다.
		TreeSet<String> 과일들 = new TreeSet<>(Set.of("키위", "복숭아", "참외", "수박"));
		
		// 과일들.addAll(Arrays.asList(과일바구니));
		과일들.add("딸기");
		System.out.println("과일들 전체 목록 : " + 과일들);
		
		// 복숭아 제거
		과일들.remove("복숭아"); // index 값이 없기 때문에, 위치 좌표(숫자)를 통한 삭제는 불가능하다.
		System.out.println("과일들 전체 목록 : " + 과일들);
		
		// 수박이 포함되어 있는지 확인하기 // 확인하려면 출력해보면 된다.
		System.out.println("수박 있어? : " + 과일들.contains("수박"));
		
		// 과일들이 비어있는지 확인하기 // 확인하려면 출력해보면 된다.
		System.out.println("비어 있어? : " + 과일들.isEmpty());
		
		// 과일들 갯수 확인하기 // 확인하려면 출력해보면 된다.
		System.out.println("몇개 있어? : " + 과일들.size());
		
		// 가장 작은 값 확인하기 // 확인하려면 출력해보면 된다.
		System.out.println("가장 작은 값 : " + 과일들.first());
		// 가장 작은 값 == 출력시 가장 앞에 있는 값
		
		// 가장 큰 값 확인하기 // 확인하려면 출력해보면 된다.
		System.out.println("가장 큰 값 : " + 과일들.last());
		// 가장 큰 값 == 출력시 가장 뒤에 있는 값
		
		// 모든 값 제거하기
		과일들.clear();
		
		// 모든 값이 제거됐는지 확인하기 // 확인하려면 출력해보면 된다.
		System.out.println("비어 있어? : " + 과일들.isEmpty());
	}
}
