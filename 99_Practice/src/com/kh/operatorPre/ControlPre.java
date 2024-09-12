package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {

	public static void main(String[] args) {
		
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		practice5();

	}
	
	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수인 정수를 입력하세요 : ");
		int num = sc.nextInt(); // 키보드로 숫자 입력하기
		
		if(num > 0) { // 입력한 숫자가 양수일 경우에만 중괄호 {} 안에 있는 코드 실행
			if((num % 2 == 0) && (num > 0)) { // 숫자가 짝수일 경우에만 출력
				System.out.println("짝수입니다.");
			} else { // 숫자가 홀수일 경우에만 출력
				System.out.println("홀수입니다.");
			} 
			
		} else { // 입력한 숫자가 음수일 경우에만 출력
			System.out.println("음수입니다. 양수만 입력하세요!");
		}
				
	}

	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int ko = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int en = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int ma = sc.nextInt();
		
		int tS = ko + en + ma;
		double aS = (double) tS / 3.0;
		
		if((ko >= 40) && (en >= 40) && (ma >= 40) && (aS >= 60)) {
			
			System.out.println("국어 점수 : " + ko + " 점");
			System.out.println("영어 점수 : " + en + " 점");
			System.out.println("수학 점수 : " + ma + " 점");
			System.out.println("점수 총합 : " + tS + " 점");
			System.out.printf("평균 점수 : %.2f 점\n" , aS);
			
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}

	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력하세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.printf("BMI 지수 : %.2f\n" , BMI);
		
		if(BMI > 0) {
			
			if(BMI < 18.5) {
				System.out.println("저체중 입니다.");
			} else if(BMI < 23) {
				System.out.println("정상체중 입니다.");
			} else if(BMI < 25) {
				System.out.println("과체중 입니다.");
			} else if(BMI < 30) {
				System.out.println("고도비만 입니다.");
			} 
		
		} else {
			System.out.println("잘못된 입력입니다.");
			}
		
	}
	
	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수를 입력하세요 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 고사 점수를 입력하세요 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수를 입력하세요 : ");
		double asm = sc.nextDouble();
		System.out.print("출석 횟수를 입력하세요 : ");
		int atd = sc.nextInt();
		
		double midScr = mid * 0.2; // 100점 만점에 20%
		double finScr = fin * 0.3; // 100점 만점에 30%
		double asmScr = asm * 0.3; // 100점 만점에 30%
		double atdPer = (double) atd / (20 * 100);
		// /20*100 == * 0.2 와 같다.
		// atd / 20 == 출석한 횟수를 전체 강의 횟수(20)로 나눠서 출석 비율을 계산
		// double 소수점 밑에 있는 수까지 가져오기 위하여
		// 실수로 된 값에 100 을 곱해서 백분율로 변환
		double atdScr = atdPer * 0.2; // 100점 만점 0.2
		// * 0.2 == /20*100 과 같다.
		double totScr = midScr + finScr + asmScr + atdScr;
		
		if((totScr >= 70) && (atdPer >= 70)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println("========== 결과 ===========");
		System.out.println("중간고사 점수(20점 만점) : " + midScr);
		System.out.println("기말고사 점수(30점 만점) : " + finScr);
		System.out.println("과	제 점수(30점 만점) : " + asmScr);
		System.out.println("출	석 횟수(20점 만점) : " + atdScr);
		System.out.println("총		점		수 : " + totScr);
		
	}
	
	public static void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일 수를 알고 싶은 달의 숫자를 입력 하세요 : ");
		int month = sc.nextInt(); // 키보드로 입력한 달(숫자)
		int daysMonth; // 해당하는 달의 일수
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			daysMonth = 31;
			break;
		case 2 :
			daysMonth = 28;
			break;
		case 4 : case 6 : case 9 : case 11 :  
			daysMonth = 30;
			break; // break 를 써서 빠져 나와도 switch 문 바깥의 코드는 실행된다.
		default :
			//daysMonth = 0;
			System.out.println(month + " 월은 잘못 입력된 달입니다.");
			return; // return 을 써서 빠져 나오면 return 밑에 작성된 코드는 실행되지 않는다.
		}
		
		System.out.println(month + " 월은 " + daysMonth + " 일까지 있습니다.");
		
	}

}
