package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEX {
	/*
	 while 문을 사용하여
	 4번을 입력하면 프로그램을 종료하는 코드 작성해보기 
	 */
	public static void main(String[] args) {
		/*
		 public 은 어디서든 접근 가능 하다는 뜻 (전체공개)
		 protected 는 같은 폴더 안에서만 접근 가능
		 default 도 같은 폴더 안에서 접근 가능 하지만, protected 보다는 제한적으로 접근 가능
		 private 은 한 class 안에서만 접근 가능, 작성한 공간 안에서만 접근 가능
		 주로 public 과 private 을 사용 한다. 
		 */ 
		
		// void 는 반환하는 것 없이 바로 출력 될 때 사용
		// 나중에는 static 없이 사용 
		
		//method1();
		//kh카페();
		//getMoney();
		//allNumber();
		//tree();
		//method2();
		//getCoffee();
		//iLovePork();

	}
	
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램 목록입니다.");
		
		while(true) {
			System.out.println("1. 게임하기 / 2. 수영하기 / 3. 잠자기 / 4. 프로그램 종료"
							  + "\n원하는 번호를 입력하세요 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.println("게임을 실행합니다.");
				return;
			case 2 : 
				System.out.println("수영을 시작합니다.");
				return;
			case 3 : 
				System.out.println("잠을 자겠습니다.");
				return;
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못된 번호입니다. 다시 입력해 주세요.");
				break;
			}
		
		}
	}

	public static void kh카페() { // 메서드 명에 한글을 사용해도 실행이 된다!
		Scanner sc = new Scanner(System.in);
		System.out.println("kh 카페에 오신 것을 환영합니다 ^^!");
		
			while(true) {
				System.out.println("원하시는 메뉴를 입력해주세요~\n"
								  + "1 아메리카노 / 2 카페라떼 / 3 녹차 / 4 흑당버블티 / 5 주문취소 : ");
				String menu = sc.next();
				
				switch(menu) {
				case "1" : case "아메리카노" :
					System.out.println("아메리카노 주문 되었습니다."
									  + " 주문 추가 하시려면");
					break;
				case "2" : case "카페라떼" :
					System.out.println("카페라떼 주문 되었습니다."
									  + " 주문 추가 하시려면");
					break;
				case "3" : case "녹차" :
					System.out.println("녹차 주문 되었습니다."
									  + " 주문 추가 하시려면");
					break;
				case "4" : case "흑당버블티" :
					System.out.println("흑당버블티 주문 되었습니다."
									  + " 주문 추가 하시려면");
					break;
				case "5" : case "주문취소" :
					System.out.println("주문이 취소 되었습니다. 안녕히 가세요 ~ ");
					return;
				default :
					System.out.println("번호를 잘못 입력했습니다. 다시 입력해 주세요.");
				}
		
			}
		
	}

	public static void getMoney() {
		// 커피 10 잔		커피값 300원
		int coffee = 10;
		int money = 300;
		
		// 만약 가진돈 이 0원이 아니라면, 커피를 계속 구매하고
		// 커피가 다 소진되면, 판매를 중지한다.
		
		while(money > 0) {
			System.out.println("커피를 드릴게요");
			// 커피는 총 10잔		1잔 제공했다면 -1
			coffee--;
			System.out.println("남은 커피는 총 " + coffee + " 잔 입니다.");
			// 커피가 모두 소진됐다면 판매를 중지
			if(coffee == 0) {
				System.out.println("커피가 다 소진됐습니다. 판매를 중지합니다.");
				return;
			}
		}
		
	}

	public static void allNumber() { // 1 ~ 5 출력하기
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++; // num = num + 1;
		}
	}

	public static void tree() {
		int hit = 0;
		while(hit < 10) {
			hit++;
			System.out.println("나무를 " + hit + " 번 찍었습니다!");
			if(hit == 10) {
				System.out.println("나무가 넘어갑니다!");
			}
		}
	}

	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0 보다 큰 정수를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 정수를 입력해 주세요 : ");
			// num = sc.nextInt(); 하다 말았다...
		} else {
			System.out.println("1 부터 " + num + " 까지의 정수를 모두 출력합니다.");
			int ber = 1;
			while(ber <= num) {
				System.out.println(ber);
				ber++;
			}
		}
	}
	
	public static void getCoffee() {
		// 커피값 100원	돈이 없으면 커피를 못 사는 코드
		Scanner sc = new Scanner(System.in);
		int coffeePrice = 100;
		System.out.println("카페에 오신 것을 환영합니다!");
		System.out.print("현재 가지고 있는 금액을 입력해 주세요 : ");
		int money = sc.nextInt();
		
		while(money < coffeePrice) {
			System.out.println("잔액이 부족합니다. 다시 확인해 주세요.");
			System.out.print("현재 가지고 있는 금액을 다시 입력해 주세요 : ");
			money = sc.nextInt(); 
		}
		
		int change = money - coffeePrice;
		System.out.println("커피를 구매했습니다. 거스름돈은 " + change + " 원 입니다.");
		
	}

	public static void iLovePork() {
		// 돈이 10_000 원 이상 없을 경우, 탕수육을 시키지 못하는 코드
		Scanner sc = new Scanner(System.in);
		int porkPrice = 10_000;
		System.out.print("가지고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		while(money < porkPrice) {
			System.out.print("잔액이 부족합니다.\n다시 입력해 주세요 : ");
			money = sc.nextInt();
		}
		int change = money - porkPrice;
		System.out.println("주문이 완료됐습니다.\n거스름돈은 " + change + " 원 입니다.");
	}

}