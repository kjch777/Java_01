package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchPre {

	public static void main(String[] args) {
		
		//method1();
		//method2();
		//method3();
		//method4();
		method5();

	}
	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int day = sc.nextInt(); // 키보드로 입력 된 숫자 받아 오기
		
		switch(day) {
		case 1 : 
			System.out.println("월요일 입니다.");
			break;
		case 2 :
			System.out.println("화요일 입니다.");
			break;
		default : 
			System.out.println("아무 요일도 아닙니다.");
		}
		
	}

	public static void method2() {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("원하는 메뉴 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		
		switch (menuNumber) {
		case 1 :
			System.out.println("아메리카노 나왔습니다.");
			break;
		case 2 : 
			System.out.println("카페라떼 나왔습니다.");
			break;
		case 3 : 
			System.out.println("흑당버블티 나왔습니다.");
			break;
		default :
			System.out.println("잘못된 입력입니다. 다시 이용해 주세요.");
		}
		
	}

	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알고싶은 도시 이름을 입력하세요 : ");
		String city = sc.nextLine();
		
		switch (city) {
		case "서울" : // String 값을 입력할땐 문자 앞뒤로 "" 큰 따옴표를 입력해 주어야 한다.
					// 만약 char 를 썼다면 '' 작은 따옴표
			System.out.println("대한민국");
			break;
		case "뉴욕" : 
			System.out.println("미국");
			break;
		case "모스크바" : 
			System.out.println("러시아");
			break;
		case "런던" : 
			System.out.println("영국");
			break;
		case "시드니" : 
			System.out.println("호주");
			break;
		default : 
			System.out.println("아직 학습하지 못한 도시입니다.");
		}
		
	}

	public static void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 12까지의 숫자중 하나를 입력하세요 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 3 : case 4 : case 5 : 
			System.out.println(month + " 월은 봄입니다.");
			break;
		case 6 : case 7 : case 8 : 
			System.out.println(month + " 월은 여름입니다.");
			break;
		case 9 : case 10 : case 11 : 
			System.out.println(month + " 월은 가을입니다.");
			break;
		case 12 : case 1 : case 2 : 
			System.out.println(month + " 월은 겨울입니다.");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
		
	}

	public static void method5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A, B, C, D 중 해당하는 등급을 입력하세요 : ");
		char grade = sc.next().charAt(0);
		// charAt 을 호출해서 작성한 문자열 중에 () 안의 숫자에 해당하는 자릿수의 문자만 출력하겠다는 의미이다.
		switch (grade) {
		case 'A' : case 'a' :
			System.out.println("4.0");
			break;
		case 'B' : case 'b' :
			System.out.println("3.0");
			break;
		case 'C' : case 'c' :
			System.out.println("2.0");
			break;
		case 'D' : case 'd' :
			System.out.println("1.0");
			break;
		default :
			System.out.println("입력한 등급에 해당하는 정보가 없습니다.");
		}
	}

}
