package com.kh.operatorPre;

import java.util.Scanner;

// 패키지 : 내가 만든 클래스가 들어있는 폴더 위치

public class OperatorPre {
	// 클래스 : 실행하고자 하는 코드를 작성하는 공간
	
	public static void main(String[] args) {
		// 메인 메서드 : 최종으로 실행하는 메서드
		// 기본 출력 메서드
		// 작성한 메서드 중에서, 실행이나 출력하고자 하는 메서드를 작성
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice44();
		practice5();
	}
	
	public static void practice1() {
		// 최종으로 출력하는 메서드는 아니지만,
		// 상황에 따라 최종 메서드에서 호출하여 사용할 수 있는 메서드 중 하나
		// static : 메모리에서 고정
		// 모든 사람이 사탕을 골고루 나눠갖기
		// 스캐너를 이용해서 키보드로 입력한 내용을 컴퓨터에 출력
		// System.in : 키보드로 입력 받을 수 있게 해주는 출력 시스템
		// Scanner : 키보드로 입력한 내용을 컴퓨터로 출력
		// Scanner 는 기본으로 갖춰져 있기는 하지만 라이브러리에서 가져와야 하기 때문에
		// import 를 이용해서 가지고 와야 한다.
		Scanner sc = new Scanner(System.in);
		// Scanner 를 불러온 다음에 바로 sc 로 스캐너 기능을 불러와도 되지만
		// Syste.out.print 를 이용해서 어떤 행동을 진행하고 있는지 확인하는 작업을 진행할 것
		System.out.print("인원 수를 입력 하세요 : ");
		// 인원 수 입력 받기
		int people = sc.nextInt();
		System.out.print("사탕 개수를 입력 하세요 : ");
		// 사탕 개수 입력 받기
		int candies = sc.nextInt();
		
		int getCandies = candies / people;
		// 1인당 나눠줄 사탕 개수 계산
		int reMain = candies % people;
		// 나눠주고 남은 사탕 개수 계산
		
		System.out.println("참여 인원 : " + people);
		System.out.println("사탕의 총 개수 : " + candies);
		System.out.println("동일하게 나눠가진 사탕 개수 : " + getCandies);
		System.out.println("남은 사탕 개수 : " + reMain);
		// 실행 : ctrl + F11
	}
	
	public static void practice2() {
		//키보드로 정보 입력하기 + 남 여 확인
		
		Scanner sc = new Scanner(System.in);
		// Scanner 를 활용하여 키보드 입력하는 창 만들기
		System.out.println("학생 관리 프로그램");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		// 이름 입력 하기
		System.out.print("학년(숫자만 입력 하세요) : ");
		int grade = sc.nextInt();
		// 학년 입력 하기
		System.out.print("반(숫자만 입력 하세요) : ");
		int classNum = sc.nextInt();
		// 반 입력 하기
		System.out.print("번호(숫자만 입력 하세요) : ");
		int num = sc.nextInt();
		// 번호 입력 하기
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		//어떤 글자가 들어오든 관계 없이 맨 앞에 있는 글자만
		// 필요하기 때문에 0으로 작성
		// String gender = sc.next();
		// 성별 입력 하기 (나중엔 String → char 를 써볼 것)
		// Scanner 로 char 값을 입력하고자 할 때는
		// charAt 을 사용해서 문자열 위치를 읽어오는 작업을 진행해야 한다.
		// 시스템으로 예를 들면 System → out → print()
		// Scanner → next → charAt(숫자만 적어야 함)
		//		    내가 보고자 하는 글자에 대응하는 숫자
		// T(0) 	A(1)	 B(2)	 L(3)	 E(4) = 총 5글자
		// 만약 맨 앞글자를 보고 싶다면
		// charAt(0) : 0은 맨 앞글자에 대응 즉 T
		// charAt(1) : 두번째 글자 A
		// charAt(2) : 세번째 글자 B
		// charAt(3) : 네번째 글자 L
		// charAt(4) : 다섯번째 글자 E
		// TABLE의 경우 총 5글자이기 때문에 
		// charAt 괄호 안에는 0 ~ 4까지의 수만 작성할 수 있다.
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		// 성적 입력 하기 (나중엔 소수점 둘째 자리 까지만 할 것)
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("성별 : " + gender);
		//System.out.println("성적 : " + score);
		System.out.printf("성적 : %.2f" , score);
		// printf 를 쓸 때는 + 가 아니라 , 만 써야 한다.
		// printf 로 %f 를 출력할 때는 
		// 소수점 자리를 지정해줘도 되고 지정해주지 않아도 된다.
		// 다만, 만약 소수점 자리를 지정해서 출력하길 원한다면
		// % . 출력을 원하는 소수점 자리 값 f
		// 예를 들어 소수점 4번째 자리까지 출력하길 원한다면 %.4f
		// 소수점 5번째 자리까지 출력하길 원한다면 %.5f
		// 소수점 2번째 자리까지 출력하길 원한다면 %.2f
		// 성별에 따라 출력 문자열 설정
		// 삼항 연산자 출력 문자열 설정
		// System.out.print("줄바꿈 없이 가로로 출력")

		// println("출력이 다 끝난 다음에 줄바꿈 실행")
		// printf("서식이 지정된 문자열을 출력할 때 사용")
		// %d : 10진수 정수(음수, 0, 양수) 
		// %f : 실수(소수점 수)
		// %s : 문자열 출력
		// %c : 문자 1개 출력 
		// %b : true 인지 false 인지 출력
		// %x : 16진수 정수 
		// %o : 8진수 정수 등등
	}

	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력 하세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력 하세요 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수를 입력 하세요 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		// 입력한 점수로 합계 계산
		// 점수 총합 = 국어점수 + 영어점수 + 수학점수
		double average = (double) total / 3.0;
		// 점수 총합 나누기 3을 해서 평균 점수 계산하기
		// 점수가 무조건 정수만 나온다는 보장이 없기 때문에
		// 실수가 나온다고 가정하고 int 대신 double 을 사용한다.
		// 앞 double average 는 64bit
		// 뒤 total 값은 int 32bit 이기 때문에
		// 괄호 double 을 작성하여 형변환에 사용한 것
		System.out.println("국어 점수 : " + korean);
		System.out.println("영어 점수 : " + english);
		System.out.println("수학 점수 : " + math);
		System.out.println("총 점수 : " + total);
		System.out.println("평균 점수 : " + average);
		
	}
	
	public static void practice4() {
		// 키보드로 입력한 2개의 수가 서로 같으면
		// true, 그렇지 않으면 false 로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		boolean result = num1 == num2 ;
		// 참 거짓을 담는 변수 result = true or false;
		// = : equal 이라고 읽는다.
		
		// == true : == 양쪽에 있는 값이 서로 같으면 true
		// 3 == 5 : false 라고 표현
		// 5 == 5 : true 라고 표현
		// != : 양쪽에 있는 값이 다르지만 다른게 맞아! 그렇다면 true
		// 3 != 5 : true 라고 표현
		// 3 != 3 : false 라고 표현
		// true false 를 표현 할 때 
		// 출력 값을 true false 로 표현하기 위해서는
		// boolean 을 사용해서 표현 함
		
		System.out.println("비교 결과 : " + result);
	}

	public static void practice44(){
		// Scanner 이용해서 num1 num2 값 받기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt(); // 정수로 num1 값을 받음
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt(); // 정수로 num2 값을 받음
		
		boolean result = num1 != num2 ; // 숫자 2개가 서로 다르면 true
		System.out.println("첫번째 수 : " + num1);
		System.out.println("두번째 수 : " + num2);
		System.out.println("비교 결과 : " + result);
	}

	public static void practice5() {
		// 입력한 수가 모두 같으면 true, 아니면 false
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		boolean and = (num1 == num2) && (num2 == num3);
		//         num1 과 num2 가 같을 때 && num2 와 num3 가 같을 때
		//                             true
		// && ampersand 또는 and 라고 읽는다.
		//  구분1  &&  구분2  = 
		// (true) && (true) = true
		// (true) && (false) = false
		// (false) && (true) = false
		// (false) && (false) = false
		boolean isOR = (num1 == num2) || (num2 == num3);
		// || vertical bar 또는 or 라고 읽는다.
		// | 는 Shift 키와 \ 키를 누르면 나온다.
		//   구분1 || 구분2 = 
		// (true) || (false) = true
		// (false) || (true) = true
		// (true) || (true) = true
		// (false) || (false) = false
		System.out.println("첫번째 수 : " + num1 + ", 두번째 수 : " + num2 + ", 세번째 수 : " + num3);
		System.out.println("and 결과 : " + and);
		System.out.println("isOR 결과 : " + isOR);
		
	}
}