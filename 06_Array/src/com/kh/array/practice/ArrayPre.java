package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
// 메서드 
	// 생성자 - 기본
	public ArrayPre() {
		
	}
	
	// void - 출력
	public void practice1() {
		// 배열을 사용하여 전체 합 구하기
		// 배열을 사용할 땐, 제일 먼저 정수인지 실수인지 문자열인지 문자인지
		// 구분을 하고, [] 작성 한다.
		// int[] num = new int[5];
		
		//  index =  0  1  2  3  4		length = 5
		int[] num = {1, 2, 3, 4, 5};
		int result = 0; // 결과는 하나이기 때문에 [] 를 쓰지 않는다.
		
		// for - each 문 : 처음부터 끝까지 반복해서 무언가를 진행할 때 사용한다.
		// 		     {1, 2, 3, 4, 5}
		for(int 정수 :       num		) {
			// num 안에 있는 모든 정수가, 하나씩 int 정수 안으로 들어가게 한 것이다.
			
			// 정수들의 합
			result += 정수; // result = 1 + 2 + 3 + 4 + 5
		}
		System.out.println("정수들의 합 : " + result);
	}

	public void practice2() {
		// ArrayList 를 사용하여 물건 추가하기
		// 온라인 장바구니처럼 넣고 싶은 것을 제한 없이 넣을 수 있다.
		//						  new ArrayList<>(); 는 <> 안에 String 을 넣어도 되고, 넣지 않아도 상관 없다.
		ArrayList<String> goods = new ArrayList<>();
		
		// 무언가를 추가할 때는 .add를 사용한다.
		goods.add("컴퓨터");
		goods.add("냉장고");			
		goods.add("에어컨");
		goods.add("세탁기");
		
		// 한꺼번에 출력하는 첫번째 방법
		System.out.println(goods);
		
		// for - each 문을 사용 : 두번째 방법
		for(String g : goods) {
			System.out.print("[" + g + "]");
		}
		
	}
	
	public void practice3() {
		// 배열을 사용하여 최댓값 찾기
		//      index =  0  1  2  3  4		length = 5
		int[] numbers = {3, 7, 2, 9, 1};
		
		int max = numbers[0]; // numbers[0] == 3
		
		for(int num : numbers) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("최댓값 : " + max);
	}

	public void practice4() {
		// 찾았다 못 찾았다
		String[] fruits = {"사과", "바나나", "딸기", "오렌지"};
		
		String search = "키위";
		boolean found = false; // 아직은 찾았는지 못 찾았는지 모르기 때문에 false 로 둔다.
		
		// for - each 문을 사용하여 바나나 찾기
		for(String 		  f      : fruits) {
		//위에서 쓴 자료형 새로운 변수명 : 위에서 쓴 변수명
			
			// 만약 내가 찾는 과일이 맞다면 찾았다
			if(f.equals(search)) {
				found = true;
				break; // 과일을 찾았기 때문에, 찾는 if 문 탈출
			}
			
		}
		System.out.println(search + " 찾았어?" + (found ? " 찾았어!" : " 못 찾았어"));
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in); 			// 스캐너 기능 불러오기
		System.out.print("찾는 동물의 종을 입력하세요 : "); 	// 입력 해보라고 띄우기
		String search = sc.nextLine();						// 입력 받기
		
		String[] zoo = {"코끼리", "원숭이", "판다", "토끼", "공작"}; // zoo 안에 동물들 집어넣기
		boolean found = false;								 // 아직 찾았는지 못 찾았는지 모르기 때문에 false
		
		for(String z : zoo) {
			if(z.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search + " 찾았어?" + (found ? " 찾았어!" : " 못 찾았어"));
	}

}
