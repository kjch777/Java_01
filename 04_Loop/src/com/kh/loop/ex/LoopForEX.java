package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEX {
	
	// LoopForEX 에서 출력하길 원한다면,
	// public static void guguDan 으로 static 을 추가해준 다음,
	// public static void main(String[] args){
	// 				   guguDan();
	// }
	
	// static 을 추가하지 않고 출력하길 원한다면,
	// 출력용 클래스를 만들어서 출력하면 된다.
	
	public void guguDan() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 프로그램을 실행합니다.");
		// 사용자가 0 을 입력하기 전까지 구구단을 반복해서 출력하도록 만들기
		// 반복하기 위해 while 문 사용
		while(true) { // 여러줄을 한번에 들여쓰기 하려면 드래그 후 Tab
			System.out.println("종료를 원하면 0 을 입력하세요");
			System.out.print("숫자를 입력하세요 : ");
			int dan = sc.nextInt();
			
			// 만약 숫자 0 이 입력되면 프로그램 종료시키기
			if (dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " X " + i + " = " + (dan * i));
			}
		}
	}
	
	public void guguDan2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 거꾸로 출력하는 프로그램 입니다.");
		
		while(true) {
			System.out.println("종료하려면 0 을 입력하세요.");
			System.out.print("원하는 숫자를 입력하세요 : ");
			int dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // for while switch 에서는 단독으로 사용이 가능하지만,
					   // if 에서는 단독으로 사용이 불가능하다.
			}
			// if 1 ~ 9 까지만 입력이 가능하도록 조건을 걸고 싶으면
			if (dan < 1 || dan > 9) {
				System.out.println("1 부터 9 까지의 숫자만 입력 해주세요.");
				continue; // continue 는 자주 사용되지는 않는다.
			}
			System.out.println("거꾸로 출력 시작합니다.");			
			for(int i = 9; i > 0; i--) {
				System.out.println(dan + " X " + i + " = " + (dan*i));
			}
		}
	}

	public void guguDan3() {
		// 구구단을 1단부터 9단까지 모두 출력
		
		for(int dan=1; dan<=9; dan++) {
			System.out.println("===== " + dan + "단" + " =====");
			for(int num=1; num<=9; num++) {
				System.out.println(dan + " X " + num + " = " + (dan*num));
			}
		}
		
	}
	
	public void guguDan4() {
		for(int dan=2; dan<=9; dan++) {
			System.out.println("===== " + dan + " 단" + " =====");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " X " + i + " = " + (dan*i));
			}
		}
	}

	public void randomNumber() {
		// Random 을 불러와, 내가 지정한 범위 안의 숫자를 랜덤으로 출력하기
		Random 랜덤 = new Random(); // 로또 번호 생성 하는 코드로도 사용 가능
		
		int 랜덤숫자 = 랜덤.nextInt(5); 
		// nextInt ( ) 소괄호 안에 숫자를 넣어서 범위 지정 가능
		// 내가 생각한 범위 숫자에서 -1 을 한 숫자를 넣어주어야 한다.
		// 컴퓨터는 양수인 정수를 셀 때 0 부터 시작하기 때문이다.
		// 범위를 따로 지정해놓지 않으면 -2^ ~ 2^
		System.out.println("랜덤숫자 : " + 랜덤숫자);
	}

	public void randomFor() {
		Random 랜덤 = new Random();
		
		for(int 횟수=1; 횟수 <=3; 횟수++) {
			int 랜덤숫자 = 랜덤.nextInt(10)+1;
			// 그냥 10 을 작성하면 0 ~ 9 
			// 소괄호 바깥에 +1 을 작성하면 1 ~ 10
			System.out.println("랜덤 숫자 " + 횟수 + " : " + 랜덤숫자);
		}
		
	}

	public void randomFor2() {
		// for 문 사용해서, 1 ~ 45 까지의 숫자 중 6개의 숫자를 랜덤으로 출력
		Random rd = new Random();
		
		for(int 회차=1; 회차<=6; 회차++) {
			int rdN = rd.nextInt(45)+1;
			System.out.println("랜덤 숫자 " + 회차 + " : " + rdN);
		}
	}
	
	public void oddNum() { // 홀수 == odd
		for(int o = 1; o <= 10; o++) {
			if(o % 2 != 0) {
				System.out.println(o);
			}
		}
	}

	public void evenNum() { // 짝수 == even
		
		for(int even = 1; even <= 10; even++) {
			if(even % 2 == 0) {
				System.out.println(even);
			}
		} 
		
	}

	public void squareStar() {
		int star = 5;
		for(int i=0; i<star; i++) { // 한줄 출력 0 1 2
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println(); // 가로 한줄로 * 을 출력한 다음, 줄바꿈
		}
	}

	public void fiveStar() {
		int star = 5;
		
		for (int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void numberGame() {
		// 숫자 맞추기 게임
		Scanner sc = new Scanner(System.in);
		// 랜덤으로 만들어진 숫자가 무엇인지 키보드로 입력하여 맞추는 게임
		
		// 랜덤으로 숫자 만들기
		Random rand = new Random();
		
		while(true) {
			int randNum = rand.nextInt(3)+1;
			for(int try1 = 1; try1 < 3; try1++) {
				System.out.println(try1 + " 번째 시도입니다.");
				System.out.print("숫자를 맞춰보세요 : ");
				int guess = sc.nextInt(); // 사용자가 입력한 숫자 받아오기
				
				if(guess == randNum) {
					System.out.println("축하합니다! 숫자를 맞췄습니다!");
					break;
				} else if (guess < randNum){
					System.out.println("틀렸습니다. 숫자가 너무 작습니다.");
				} else {
					System.out.println("틀렸습니다. 숫자가 너무 큽니다.");
				}
				
			}
			System.out.println("정답은 " + randNum + " 이었습니다.");
			System.out.print("게임을 다시 시작하겠습니까? (1번 다시 시작 / 2번 종료) : ");
			int playAgain = sc.nextInt();
			if(playAgain == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			} else if(playAgain != 2)
			
		}
	
	}
	
}
