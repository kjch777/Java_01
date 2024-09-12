package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void Greeting() {
		System.out.println("안녕하세요.");
		// Greeting : 안녕하세요 인사를 출력하는 메서드
	}
	
	public void Greeting2() {
		System.out.println("반갑습니다.");
		// Greeting2 : 반갑습니다 인사를 출력하는 메서드
	}
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력하세요.");
			return;
		} 
		
		for(int i = 1; i<=num; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // 마무리로 줄바꿈까지 하려면 이렇게 작성하면 된다.
	}
	
	public void practice2() {
		// 1 미만의 숫자가 입력 됐다면,
		// 1 이상의 숫자를 입력 해주세요 가 출력되면서
		// 사용자가 값을 다시 입력 하도록 만들기
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("숫자를 입력 하세요 : ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력 하세요");
			} else {
				break;
			}
		}

		// 1 부터 입력한 수 까지의 숫자들을 전부 출력하고 싶다면
		System.out.println("1부터 " + num + " 까지의 숫자들입니다.");
		int i =1;
		while(i <= num) {
			System.out.print(i + " ");
			i++; // ++ 는 = 으로 값을 지정하지 않았을 땐 앞에 넣든 뒤에 넣든 상관 없다.
		}
		System.out.println();
	}

	public void practice3() {
		// 사용자로부터 한 개의 숫자를 입력 받아
		// 1 부터 입력 받은 숫자까지의 모든 숫자를 거꾸로 출력 해보기
		// 단, 입력 받을 숫자는 1 보다 크거나 같아야 한다.
		Scanner sc = new Scanner(System.in);
		int num; // 이렇게만 지정해두는 것도 가능
		System.out.println("======= practice 3 시작 =======");
		
		while(true) {
			System.out.print("숫자를 입력 하세요 : ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력 하세요");
			} else {
				break;
			}
		}
		
		System.out.println(num + " 부터 " + "1 까지의 숫자들을 거꾸로 출력 합니다. ");
		
		while(num >= 1) {
			System.out.print(num + " ");
			num--; // 키보드로 입력 받은 숫자로부터 -1 을 하면서 1이 될 때까지 출력
		}
		
		System.out.println();
		
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int num; // practice4 안 이라면 어디서든 num 을 알 수 있도록, practice4 안 최상단에 적어둔 것.
		do { // do-while : 조건이 참이 아니어도, 최초 1회는 무조건 실행 한다.
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			// 1 미만의 숫자가 입력되면
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력하세요.");
				// do 로 인해 조건에 관계없이 무조건 1회는 실행되기 때문에,
				// return 이나 break 를 굳이 작성해주지 않아도 될 경우가 많다.
			}
		} while (num > 1);
		// 만약 숫자가 1 보다 커서 아래로 내려온다면
		// num 부터 1 까지 거꾸로 출력하는 for 문 작성하기
		for(int i = num; i >= 1; i--) { // int i = num; 가능
			System.out.print(i + " ");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력 하세요 : ");
		int num = sc.nextInt();
		
		int result = 0;
		
		// 정수가 들어왔을때, 1부터 입력된 수까지 더해서 총합 구하기
		for(int i = 1; i <= num; i++) {
			result += i;
			// result += i; : result = result + i : 0 = 1
			
			// 더해지는 숫자 전부 출력하기
			if(i < num) {
				System.out.print(i + " + ");
			} else { // i >= num
				System.out.print(i + " = ");
			}
		}
		System.out.print(result);
	}

	public void practice7() {
		/*
		 사용자로부터 2개의 값을 입력받아, 그 사이의 숫자 출력하기
		 만약 1 미만의 숫자가 입력됐다면, 1 이상의 숫자를 입력하세요 출력하기
		 사용자가 다시 값을 입력하게 해서 출력하기 
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째 숫자를 입력하세요 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자를 입력하세요 : ");
			int num2 = sc.nextInt();
			
			// 만약 첫번째 숫자와 두번째 숫자 모두 1 보다 크거나 같을 경우
			if((num1 >= 1) && (num2 >= 1)) {
				// 2개의 수를 비교해서 최소값, 최대값 구하기
				int min = Math.min(num1, num2); 
				// Math(수학)파일에서 최소값을 찾는 min 을 사용하여, 컴퓨터가 알아서 비교하고 최소값을 구하게 하기
				int max = Math.max(num2, num1); // 소괄호 ( ) 안의 숫자 순서는 바뀌어도 상관없다.
				// Math.random 보다 Random 에 있는 랜덤 기능이 더 포괄적이지만, 둘 다 사용하는 데에는 큰 차이가 없다.
				
				for(int i = min; i <= min; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력하세요.");
			}
			
		}
		
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		char sign; // String 을 사용해도 무방하다.
		
		while(true) {
			System.out.println("(프로그램 종료를 원할 경우 x 를 입력 하세요)");
			System.out.print("연산 기호를 입력 하세요 (+ - * / %) : ");
			sign = sc.next().charAt(0);
			if(sign == 'x') { 
				// .equals 는 문자열을 비교할 때 사용하기 때문에, String 에만 사용한다.
				// char 를 사용한 경우에는 == != 사용
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 정수 1과 정수 2를 입력 받아서 계산하기
			System.out.print("정수 1 : ");
			num1 = sc.nextInt();
			System.out.print("정수 2 : ");
			num2 = sc.nextInt();
			// 정수 1과 정수 2 에 대한 계산 결과 출력
			int 결과; // 변수명 지정할 때는 한글을 사용해도 무관하다.
			if(sign == '+') {
				결과 = num1 + num2;
			} else if (sign == '-') {
				결과 = num1 - num2;
			} else if (sign == '*') {
				결과 = num1 * num2;
			} else if (sign == '/') {
				//몫 은 0 으로 나눌 수 없기 때문에, 정수 2 는 0 이 될 수 없다.
				if(num2 == 0) {
					System.out.println("0 으로 나눌 수 없습니다.");
				}
				결과 = num1 / num2;
				
			} else if (sign == '%') {
				// 나머지는 0 으로 나눌 수 없기 때문에 정수 2 는 0 이 될 수 없다.
				if(num2 == 0) {
					System.out.println("0 으로 나눌 수 없습니다.");
				}
				결과 = num1 % num2;
				
			} else {
				System.out.println("잘못된 입력 입니다.");
				continue;
			}
			System.out.println(num1 + " " + sign + " " + num2 + " = " + 결과);

		}
		
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 보통		세로 : i		가로 : j
		for(int i = 1; i <= num; i++) {
			// 1 줄에 1 개	2 줄에 2 개	3 줄에 3 개 ... num 줄에 num 개
			for(int star = 1; star <= i; star++) {
				System.out.print("* ");
			}
			// 줄바꿈을 해줄 Enter 가 없으면 가로로만 출력되기 때문에
			System.out.println(); // 을 넣어준다.
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i >= 1; i++) { // ; 은 for 문 소괄호 ( ) 안에서 2개만 사용 가능 
			for(int star = num; star <= i; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int size = sc.nextInt();
		
		// line 은 세로 줄의 번호를 나타냄
		for(int line = 0; line < size; line++) {
			// blank 는 공백을 출력하기 위한 for 문
			// line 번째 줄에서는 line 개의 공백을 출력하겠다.
			for(int blank = 0; blank < line; blank++) {
				System.out.print("  ");
			}
			// star 는 별을 출력하기 위한 for 문
			// line 번째 줄에서는 size - line 개의 별을 출력
			// 두번째 줄부터 size - line
			for(int star = size; star > line; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
