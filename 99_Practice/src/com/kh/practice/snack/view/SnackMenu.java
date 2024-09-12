package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	// 고객이 메뉴를 직접 입력하고, 볼 수 있는 창 만들기
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	// 출력 void 메서드 : 값을 반환하지 않고, 출력만 하는 메서드
	public void menu() {
		System.out.println("먹고싶은 스낵을 입력하세요!");
		System.out.print("종류 : ");
		String kind = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print(" 맛 : ");
		String flavor = sc.next();
		System.out.print("갯수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.println("저장한 내용을 확인 하시겠습니까? (y / n)");
		String answer = sc.next();
		
		// 만약 y 를 눌렀다면, 저장한 내용 출력하기
		// .equalsIgnoreCase 를 사용하면, 대/소문자 차이를 무시하고 사용할 수 있다.
		if(answer.equalsIgnoreCase("y")) { 
			// 저장한 내용 출력
			System.out.println(scr.saveData(kind, name, flavor, numOf, price));
			// 저장한 내용이 잘 들어갔는지 출력해서 확인 
			System.out.println(scr.confirmData());
		} else if(answer.equals("n")) {	
			System.out.println("종료합니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}
		
}


