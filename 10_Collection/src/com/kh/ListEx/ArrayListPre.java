package com.kh.ListEx;

import java.util.ArrayList;

public class ArrayListPre {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();

		// .add == 값 추가
		a.add("사과");
		a.add("바나나");
		a.add("오렌지");

		// 출력
		System.out.println(a);

		// 겟 .get(1); 을 사용하여 1에 들어있는 값 반환하기
		String 겟 = a.get(1);
		System.out.println(겟);

		// .set(1, "포도"); 를 사용하여 바나나를 포도로 변경하기
		a.set(1, "포도"); // 값을 입력할 땐 .set
		System.out.println(a.get(1)); // 값을 출력할 땐 .get

		// .size() 사용하여 크기 반환하기
		System.out.println(a.size());

		// .isEmpty() 사용하여 리스트가 비어있는지 확인하기
		System.out.println(a.isEmpty());

		// .remove(2); 사용하여 지정된 자리 제거하기
		a.remove(2);
		System.out.println(a);

		// .remove("사과"); 사용하여 사과 제거하기
		a.remove("사과");
		System.out.println(a);

		// .clear(); 사용하여 모두 제거하기
		a.clear();
		System.out.println(a);

		// .isEmpty() 사용하여 리스트가 비어있는지 확인하기
		System.out.println(a.isEmpty());

	}

}
