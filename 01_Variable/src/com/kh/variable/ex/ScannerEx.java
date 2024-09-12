package com.kh.variable.ex;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		/*
		 Scanner 클래스
		 
		 사용자로부터 키보드 입력을 받기 위해 Java에서 제공하는 클래스
		 
		 기본으로 구성되어 있는 것은 아니기 때문에 (기본 구성이면 소문자로 시작)
		 상단 패키지 이름 밑에 import java.util 패키지 표기를 해준 후 사용할 수 있음
		 import 정확한 표기법 : import java.util.Scanner;
		 import 는 가져온다, 포함한다는 의미
		 
		 Scanner.next() : 공백 불가, 단어(String) 1개 입력 가능
		 Scanner.nextLine() : 공백을 포함할수 있고, 문자열 1개 입력 가능
		 Scanner.nextInt() : int형 정수 1개 입력
		 Scanner.nextLong() : long형 정수 1개 입력
		 Scanner.nextDouble() : 실수 1개 입력
		 
		 이외에도 Scanner 클래스 안에는 여러가지 기능이 존재
		 스캐너는 불러온 다음 close를 사용해서 공간을 닫아준다 라는 표시를 해주는걸 권장함 (필수는 아님)
		 * */ 

		// Scanner 사용 해보기
		// 1. 클래스 위에 import 구문이 생겨야 함
		// 2. Scanner 객체 사용
		Scanner sc = new Scanner(System.in);
		// 3. System.in 을 사용해서 키보드로 입력하는 값을 받을 수 있도록 함
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt(); // 다음에 입력된 정수를 가져와 num1 에 대입
		
		System.out.print("정수 입력 2 : ");
		int num2 = sc.nextInt(); // 다음에 입력된 정수를 가져와 num2 에 대입
		
		// 실수 입력 nextDouble 을 사용해서 num3 값에 실수 입력 만들기
		System.out.print("실수 입력 : ");
		double num3 = sc.nextDouble();
		// next 를 사용해서 단어 입력 2개 하기 : 변수명 word1 word2
		System.out.print("단어 2개 입력 : ");
		String word1 = sc.next();
		// Scanner 를 이용해서 입력을 진행할 경우
		// System.out.print 를 이용해서 제대로 값이 입력됐는지
		// 문제는 없는지 확인 출력을 해주는 습관을 들이는 것이 좋다
		String word2 = sc.next();
		
		//***********************************************
		// next() / nextInt() / nextDouble() 등을 작성한 이후
		// nextLine() 을 작성해야하는 상황이 오면
		// nextLine() 을 미리 한번 작성하고 사용
		
		sc.nextLine(); // next() 뒤에 남아있는 버퍼값을 Line 안에 넣어줌
		// 그런데, 버퍼값은 우리가 눈으로 보거나 저장을 해야할 이유가 없기 때문에
		// 앞에 자료형이나 변수명을 사용해서 버퍼를 넣어 저장해야할 이유가 없다
		// 따라서, sc.nextLine() 을 호출하여 공백 즉 엔터를 제거한다
		
		
		System.out.print("문장 입력 : ");
		String str = sc.nextLine();
		
		
		// 4. System.out 을 사용해서 키보드로 작성된 내용 출력하기
		System.out.println("정수 1의 값 : " + num1);
		System.out.println("정수 2의 값 : " + num2);
		System.out.println("실수 값 : " + num3);
		System.out.println("단어 2개 : " + word1 + ", " + word2);
		System.out.println("추가된 문장 : " + str);
		// 5. Scanner close 를 사용해서 닫아주기
		sc.close(); 
		// Scanner 사용을 다 했다면, 더 이상 공간을 차지하지 않게 하기 위해
	    // Scanner 를 종료하는 close 를 사용해서 닫아준다
		
		
	}

}

