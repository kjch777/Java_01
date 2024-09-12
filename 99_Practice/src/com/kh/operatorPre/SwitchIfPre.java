package com.kh.operatorPre;
	/*
	표기법
	코드를 작성할때 개발자 간, 코드를 보기 편하게 하기 위하여 작성하는 표기법이 있다.

		스네이크 케이스(snake_case)
		변수명에 언더바 _ 가 들어있는 표현방식을, 뱀처럼 생겼다고 하여 붙여진 이름
		one_two_three	gender_code
	
		파스칼 케이스(PascalCase)
		첫단어의 첫글자와 다음단어의 중간글자를 대문자로 사용하는 표현방식
		OneTwoThree		GenderCode
	
		카멜 케이스(camelCase)
		첫번째 단어의 첫글자는 소문자, 다음 단어의 첫글자는 대문자로 시작하는 표현방식
		oneTwoThree		genderCode
	
		케밥 케이스(kebab-case)
		단어 사이에 대시 - 를 사용하여 변수명을 작성하는 표현방식
		one-two-three	gender-code
	
	Window ▶ Preferences ▶ General ▶ Editors ▶ Text Editors ▶ Spelling ▶
	Encoding: ▶ Other: ▶ UTF-8 ◀ 한글
	Window ▶ Preferences ▶ General ▶ Content Types ▶
	Text ▶ ...
	Window ▶ Preferences ▶ General ▶ Workspace ▶ ...
	*/
import java.util.Scanner;

public class SwitchIfPre {

	public static void main(String[] args) {
		
		//practice8();
		//castingPractice1();
		//castingPractice3();
		//controlPractice1();
		//controlPractice10();
		//controlPractice5();
		//controlPractice6();
		controlPractice8();
	}
	
	public static void practice8() {
		// 주민번호를 이용하여 남자인지 여자인지 구분해서 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String idNumber = sc.next();
		
		char genderCode = idNumber.charAt(7);
		// 주민번호 뒷자리의 첫번째 숫자를 가지고 와서 성별을 판별
		// 00년생00월생00일생-1000000
		// charAt(7번째 자리의 값을 가지고 오기)
		// charAt 은 문자, 숫자 상관없이 전부 자릿수만 센다.
		// 주민-번호 - 포함해서 7번째 자리
		// - 제외하고 숫자만 입력한다면 6번째 자리에 있는 값을 가지고 와야 한다.
		String gender; // 나중에 남자인지 여자인지 확인결과를 보여줄때 사용
		
		if((genderCode == '1') || (genderCode == '3')) {
			gender = "남자"; // 만약 1이나 3이 들어온다면 남자
						    // " " 큰 따옴표는 String 에 사용하고, 
							// ' ' 작은 따옴표는 char 에 사용한다.
		} else if((genderCode == '2')||(genderCode == '4')) {
			gender = "여자"; // 만약 2나 4가 들어온다면 여자
		} else {
			System.out.println("올바른 주민번호가 아닙니다.");
			// gender 를 여기에도 입력하거나
			return;
			// else 에서 돌려보내는 return 을 사용한다.
		}
		System.out.println("입력한 주민번호는 " + gender + " 입니다.");
		// 남자인지 여자인지에 대한 결과 출력
	}

	
	public static void castingPractice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		int unicode = inputChar; // char 2byte
		// 유니코드로 출력			 // int 4byte

		System.out.println("입력한 문자 '" + inputChar + "' 의 유니코드는 '" + unicode + "' 입니다.");
		// 유니코드는 전 세계의 모든 글자나 문자를 컴퓨터에서 일관되게 표현해주기 위한 방식
		// 글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
		
	}

	
	public static void castingPractice3() {
		// 주어진 코드에서 빈 칸을 채우고, 출력 결과가 나오도록 만들기
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f; // 기본값이 double 이기 때문에, float 로 변경해주는 f 를 숫자 뒤에 붙여준다.
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // 나누기를 해서 몫이 2가 나오게
		System.out.println((int) dNum); // 실수 double 로 되어 있는 것을 정수 int 로 변경
		// double 8byte		int 4byte
		// double 이 더 크므로, 강제 형변환을 하겠다는 표시 (int) 를 작성한다.
		System.out.println(iNum2 * dNum); // 10.0
		// 작은 값과 큰 값이 만나면, 자동으로 큰 값으로 변경되기 때문에, (double) 은 필수가 아니다.
		System.out.println((double) iNum1); // 10.0
		System.out.println((double) iNum1 / iNum2); // 2.5; 정수형 ▶ 실수형
		System.out.println(dNum); // 2.5
		System.out.println((int) fNum); // 3 실수형 ▶ 정수형
		System.out.println((int) (iNum1 / fNum)); // 나누기를 해서 몫이 3이 나오게
		// int 와 float 은 같은 크기의 byte 이므로,
		// 앞에 () 를 작성하여 정수형인지 실수형인지 표기해 주어야 한다.
		System.out.println((double) iNum1 / fNum); // 3.3333333
		// float 은 소수점 이하 6자리 까지만 보여준다.
		System.out.println((double) iNum1 / fNum); // 3.33333333333333335
		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println(ch  + iNum1); // 75
		// 'A' 값은 (int)ch 를 사용해서 65 라는걸 알 수 있다.
		// 큰 byte 형과 작은 byte 형이 만나면, 자동으로 큰 byte 형에 담겨진다.
		// 65 + (int iNum1 = 10) = 75
		System.out.println((char) (ch + iNum1)); // 'K'
		// (char) 를 사용하면 숫자를 문자로 치환하여 출력할 수 있다. 
	}

	
	public static void controlPractice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("원하시는 메뉴의 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt(); 
		
		switch (menuNumber) {
		case 1 : 
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2 : 
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3 : 
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4 : 
			System.out.println("삭제 메뉴 입니다.");
			break;
		case 7 : 
			System.out.println("프로그램을 종료합니다.");
			break;
		default : 
			System.out.println("잘못된 메뉴 번호입니다.");
		}
	}

	
	public static void controlPractice10() {
		// System.out.print 에서 출력할 내용이 길어져서
		// 줄바꿈으로 글을 작성하고 싶다면 : \n
		// 키보드 입력하는 위치를 현재 줄의 처음으로 이동시키고 싶다면 : \r
		// System.out.print();
		// + 는 ); 을 붙여서 끝내지 않는 한, 줄을 바꿔도 계속 이어서 작성할 수 있다.
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 매뉴얼 보기\n"
						  + "2. 짝수/홀수\n"
						  + "3. 합격/불합격\n"
						  + "4. 계절\n"
						  + "5. 로그인\n"
						  + "6. 권한 확인\n"
						  + "7. BMI\n"
						  + "8. 계산기\n"
						  + "9. P/F");
		System.out.println("실행하고 싶은 기능의 숫자를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		
		switch (menuNumber) {
		case 1 : 
			System.out.println("1. 매뉴얼 보기");
			break;
		case 2 : 
			System.out.println("2. 짝수/홀수");
			break;
		case 3 : 
			System.out.println("3. 합격/불합격");
			break;
		case 4 : 
			System.out.println("4. 계절");
			break;
		case 5 : 
			System.out.println("5. 로그인");
			break;
		case 6 : 
			System.out.println("6. 권한 확인");
			break;
		case 7 : 
			System.out.println("7. BMI");
			break;
		case 8 : 
			System.out.println("8. 계산기");
			break;
		case 9 : 
			System.out.println("9. P/F");
			break;
		default : 
			System.out.println("잘못된 입력입니다.");
		} 
		
	}

	public static void controlPractice5() {
		// ! 는 특정 조건을 부정하는 데에 사용한다.
		// inputId.equals(userId) :  inputId 와 userId 가 서로 같을 때 참
		// !inputId.equals(userId) : 맨 앞에 ! 가 붙으면
		//                           inputId 와 userId 가 서로 다를 때 참
		
		Scanner sc = new Scanner(System.in);
		String userId = "myId";
		String userPw = "myPassword12";
		
		System.out.print("아이디를 입력하세요 : ");
		String inputId = sc.next(); // next 는 띄어쓰기 전까지만 인식
		System.out.print("비밀번호를 입력하세요 : ");
		String inputPw = sc.next(); // nextLine 은 띄어쓰기 써도 전부 인식
		
		if((inputId.equals(userId)) && (inputPw.equals(userPw))) {
			System.out.println("로그인 되었습니다.");
		} else if (!inputId.equals(userId)) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (!inputPw.equals(userPw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		
	}

	public static void controlPractice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자의 등급을 입력하세요\n"
						  + "관리자\n"
						  + "회원\n"
						  + "비회원\n"
						  + "등급 입력 : ");
		String userRole = sc.next(); // Role : 권한이나 규칙을 설정할때 주로 쓰는 변수명
		System.out.println("해당 사용자의 등급 권한 : ");
		
		switch(userRole) {
		case "관리자" : 
			System.out.println("- 회원 관리 \n" 
							 + "- 게시글 관리 \n"
							 + "- 게시글 작성 \n"
							 + "- 게시글 조회 \n"
							 + "- 댓글 작성 \n");
			break;
		case "회원" : 
			System.out.println("- 게시글 작성 \n"
							 + " - 게시글 조회 \n"
							 + "- 댓글 작성 \n");
			break;
		case "비회원" : 
			System.out.println("- 게시글 조회");
			break;
		default : 
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	public static void controlPractice8() {
		/*
		 키보드로 2개의 정수와 연산 기호를 입력하여, 
		 연산 기호에 맞춰 연산 결과 출력하기 
		 (2개의 정수 모두 양수일때만 작동하며, 
		 음수나 지정하지 않은 연산 기호를 입력하였을 경우
		 "잘못 입력했습니다." 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("양수인 첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("연산 기호 +, -, *, /, % 중 하나를 입력하세요 : ");
		char sign = sc.next().charAt(0);
		System.out.print("양수인 두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		double result;
		if((num1 > 0) && (num2 > 0)) {
			switch(sign) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' : // / % 는 0 으로 나눌 수 없기 때문에, 
				       // if 문으로 값이 0 이 될 경우를 위한 처리를 따로 해주어야 한다. 
					   // 하지만 나는 처음부터 if 로 묶어놨기 때문에 상관없는 것 같다...
				result = num1 / num2;
				break;
			case '%' : 
				result = num1 % num2;
				break;
			default : 
				System.out.println("잘못된 입력입니다.");
				return;
			}
			System.out.println("\n첫번째 수 : " + num1 + " " +
							   sign + " 두번째 수 : " + 
							   num2 + "\n의 결과값은 " +
							   num1 + sign + num2 + 
							   " = " + result + " 입니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

}
