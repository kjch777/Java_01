package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {

// method
	// 기본 생성자
	public ArrayListEx2() {
		
	}
	
	public void method1() {
		
		ArrayList<String> list = new ArrayList<>();
		//									  <> 여기 괄호 안은 생략해도 된다.
		
		// .add 를 사용하여 딸기 바나나 사과 를 추가
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		// .get 을 사용하여 각 index 자리에 값 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		// 					   .get() 소괄호 안에는 숫자값 위치 좌표를 넣는다.
		System.out.println(list.get(2));
		
		// .set 을 사용하여 바나나를 키위로 수정
		list.set(	  1, 	   			      "키위");
		//	 set(숫자값 위치 좌표,	새로 바꾸고 싶은 값, 즉, 숫자가 아니어도 된다.);
		
		// .size 를 사용하여 크기 확인, 즉, 출력문에 사용한다.
		System.out.println("바구니 크기 : " + list.size());
		// 			   크기를 확인하려는 것이기 때문에, .size() 소괄호 안에는 아무것도 넣지 않는다.
		
		// .remove 를 사용하여 키위 삭제
		list.remove(1);
		//  .remove() 소괄호 안에는 지우고 싶은 값 또는 숫자로 된 위치 좌표를 넣는다.
		
		// .isEmpty() 를 사용하여 비어있는지 확인, 즉, 출력문에 사용한다.
		System.out.println("바구니 비었어? : " + list.isEmpty());
  // 비어있는지 확인하려는 것이기 때문에, .isEmpty() 소괄호 안에는 아무것도 넣지 않는다.
		
		// 앞으로 사용할 for 문
		//   자료형 내가 만들 변수명 : 반복 할 변수명
		for(String 	fruit      :   list) {
			System.out.println(fruit);
		}
		
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		
		// .add 로 사자 호랑이 고양이 강아지 추가
		animal.add("사자");
		animal.add("호랑이"); // .add(추가하고 싶은 값을 입력, 숫자가 아니어도 된다.)
		animal.add("고양이"); // Ctrl + alt + ▼ : 한줄 복사해서 밑에 붙여넣는 단축키
		animal.add("강아지");
		
		// .size() 로 동물이 몇 마리 있는지 확인
		System.out.println("동물 몇 마리야? : " + animal.size() + " 마리야.");
		//											.size(입력X)
		
		// .get 으로 동물 확인
		System.out.println("animal.get(0)에는 " + animal.get(0) + " 가 있어.");
		System.out.println("animal.get(1)에는 " + animal.get(1) + " 가 있어.");
		System.out.println("animal.get(2)에는 " + animal.get(2) + " 가 있어.");
		System.out.println("animal.get(3)에는 " + animal.get(3) + " 가 있어.");
		//											   .get(숫자값 위치 좌표)
		
		// .set 으로 고양이 ▶ 토끼로 변경
		animal.set(2, "토끼");
		
		// .remove 로 강아지 삭제
		animal.remove(3);
		//    .remove(숫자 위치 좌표가 아닌 값 자체를 써도 된다.)
		
		// for 문으로 바뀐 변수명의 get 값 출력
		for(String zoo : animal) {
			System.out.println(zoo);
		}
		
		// .clear 로 모두 삭제
		animal.clear(); // 모두 삭제니까 소괄호 ( ) 안을 비워 둔다.
		
		// .isEmpty() 로 모두 삭제 됐는지 확인
		System.out.println("삭제 됐어? : " + animal.isEmpty());
		
	}
	
	public void method3() {
		ArrayList<String> pizza = new ArrayList<>(); // ArrayList 생성
		
		System.out.println("===== 피자 메뉴 =====");
		
		// .add 로 추가
		pizza.add("포테이토");
		pizza.add("고르곤졸라");
		pizza.add("페퍼로니");
		
		// 한꺼번에 출력하기
		System.out.println("모든 메뉴 보기 : " + pizza);
		
		// .get 으로 출력
		System.out.println("1번 피자 : " + pizza.get(0));
		System.out.println("2번 피자 : " + pizza.get(1));
		System.out.println("3번 피자 : " + pizza.get(2));
		
		// .set 으로 페퍼로니 ▶ 파인애플 변경
		pizza.set(2, "파인애플");
		System.out.println("3번 피자는 " + pizza.get(2) + " 피자로 변경 되었습니다!");
		
		// .remove 로 파인애플 삭제
		pizza.remove(2);
		// 또는 pizza.remove("파인애플");
		
		// for 문으로 출력
		for(String closed : pizza) {
			System.out.println(closed);
		}
		
		System.out.println("망했어요...");
		
		// .clear 로 메뉴 모두 삭제
		pizza.clear();
		
		System.out.println("정말 망했나요?.. : " + pizza.isEmpty());			
		
	}
	
	// main : 최종 출력 및 실행할 코드를 작성하는 공간
	public static void main(String[] args) {
		
		ArrayListEx2 al = new ArrayListEx2();
		// al.method1();
		// al.method2();
		al.method3();
		
	}

}
