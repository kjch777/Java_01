package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {

	public static void main(String[] args) {
		//takeAtaxi();
		//howScore();
		//whatDaySc();
		whatDayIf();

	}

	public static void takeAtaxi() {
		// if 문을 사용하여 
		// 입력한 돈이 3_000원 이상일 경우에만 
		// 택시를 탈 것인지 물어보기
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 가지고 있는 돈의 액수를 입력하세요 : ");
		int money = sc.nextInt();
		
		if (money >= 3_000) {
			System.out.println("택시를 탈까요? (예/아니오)");
			String answer = sc.next();
			
			switch (answer) { // answer 값에 따라 처리
			case "예" :
				System.out.println("택시를 탔습니다.");
				break;
			case "아니오" :
				System.out.println("택시를 타지 않았습니다.");
				break;
			default : 
				System.out.println("잘못된 입력입니다.");
			}
		} else {
			System.out.println("3000원 미만입니다. 잔액이 부족합니다.");
		}
		
		
	}
	
	public static void howScore() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt(); // 키보드로 점수 입력
		String grade;
		
		if ((score>0) && (score>=60)) {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else {
				grade = "D";
			}
			System.out.println(grade + " 학점입니다.");
		} else {
			grade = "F";
			System.out.println(grade + " 학점입니다.");
			System.out.print("재수강 하시겠습니까? (yes/no) : ");
			String reScore = sc.next();
			
			switch (reScore) {
			case "YES" : case "yes" : 
				System.out.println("재수강 신청이 완료 되었습니다.");
				break;
			case "NO" : case "no" :
				System.out.println("재수강 신청을 하지 않았습니다.");
				break;
				default : 
					System.out.println("잘못된 입력입니다.");
			}
		}
		
		
		
	}

	public static void whatDaySc() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요일을 입력하세요 : ");
		char day = sc.next().charAt(0);
		
		switch (day) {
		case '월' : case '수' : case '금' :
			System.out.println("헬스");
			break;
		case '화' : case '목' :
			System.out.println("공부");
			break;
		case '토' : case '일' : 
			System.out.print("주말입니다. 집에만 있을건가요? (예/아니오) : ");
			String answer = sc.next();
			switch (answer) {
			case "예" :
				System.out.println("알겠습니다. 푹 쉬세요!");
				break;
			case "아니오" : 
				System.out.println("어떤 활동을 하고 싶은가요? (1 ~ 4중 택1) : ");
				int act = sc.nextInt();
				switch (act) {
				case 1 : 
					System.out.println("등산");
					break;
				case 2 : 
					System.out.println("독서");
					break;
				case 3 : 
					System.out.println("수영");
					break;
				default :
					System.out.print("잘못된 입력입니다.");
					return;
				}
			
			}
			break; // 위치가 굉장히 중요함.
			default :
			System.out.print("잘못된 입력입니다.");
			return;
		}
	
	}
	
	public static void whatDayIf() {
		
		// 한 메서드 안에서 switch 와 default 의 갯수는 
		// 서로 반드시 같지는 않아도 되는거 같은데...???
		// 한 switch 문 안에서, case 와 break 의 갯수는 서로 같아야 한다.
		// default 에는 반드시 return 을 써주어야 하나?
		
		Scanner sc = new Scanner(System.in);
		System.out.print("요일을 입력하세요 : ");
		char day = sc.next().charAt(0);
		String result;
		
		switch(day) {
		case '월' : case '수' : case '금' :
			System.out.println("헬스");
			break;
		case '화' : case '목' : 
			System.out.println("공부");
			break;
		case '토' : case '일' : 
			System.out.print("주말입니다. 집에만 있을건가요? (예/아니오) : ");
			String answer = sc.next();
			if (answer.equals("예")) {
				System.out.println("푹 쉬세요!");
			} else if (answer.equals("아니오")) {
				System.out.println("뭐 할 거에요?");
				System.out.print("(1. 등산 / 2. 독서 / 3. 수영) : ");
				int act = sc.nextInt();
				switch (act) {
				case 1 : 
					result = "등산";
					break;
				case 2 :
					result = "독서";
					break;
				case 3 :
					result = "수영";
					break;
				default : 
					System.out.println("잘못된 입력입니다.");
					return;
				}
				System.out.println(result + "할 예정이에요.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			break;
		}
		
		
	}

}
