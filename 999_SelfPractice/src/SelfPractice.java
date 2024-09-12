import java.util.Scanner;

public class SelfPractice {
	
	public static void main(String[] args) {
	
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice44();
		//practice5();
		//practice6();
		//practice7();
		//practice8();
		//practice9();
		practice10();
		
	}
	
	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수는 총 몇명입니까? : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수는 총 몇개입니까? : ");
		int candies = sc.nextInt();
		System.out.println("그렇다면 1인당 동일하게 나눠가진 사탕의 개수는 몇개입니까? : ");
		int perPerson = candies / people;
		int remain = candies % people;
		System.out.println(perPerson + "개입니다.");
		System.out.println("그렇다면 남은 사탕의 개수는 몇개입니까?");
		System.out.println(remain + "개입니다.");
		
	}

	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만 입력하세요) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만 입력하세요) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만 입력하세요) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("성별 : " + gender);
		System.out.println("성적 : " + score);
	}
	
	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double average = (double) total / 3.0;
		
		System.out.println("국어 점수는" + korean + " 점 입니다.");
		System.out.println("영어 점수는" + english + " 점 입니다.");
		System.out.println("수학 점수는" + math + " 점 입니다.");
		System.out.println("총 점수는" + total + " 점 입니다.");
		System.out.printf("평균 점수는 %.2f 점 입니다.\n" , average);
		// printf 문 %.2f 는 따로 + 필요없이 " " 안에 같이 작성해도 된다.
	}

	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		boolean result = (num1 == num2);
		
		System.out.println("비교 결과 : " + result);
	}

	public static void practice44() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		boolean result = num1 != num2 ;
		System.out.println("첫번째 정수 : " + num1);
		System.out.println("두번째 정수 : " + num2);
		System.out.println("비교 결과 : " + result);
	}

	public static void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		boolean and = (num1 == num2) && (num2 == num3);
		boolean isOR = (num1 == num2) || (num2 == num3);
		
		System.out.println("첫번째 수 : " + num1 + " , 두번째 수 : " + num2 + ", 세번째 수 : " + num3);
		System.out.println("and 결과 : " + and);
		System.out.println("isOR 결과 : " + isOR);
		
	}

	public static void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if((num > 0) && (num % 2 == 0)) {
			System.out.println("짝수입니다.");
		}
		
		else if((num > 0) && (num % 2 == 1)) {
			System.out.println("홀수입니다.");
		}
		
		else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}

	public static void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		System.out.println("국어 점수 : " + korean);
		System.out.println("영어 점수 : " + english);
		System.out.println("수학 점수 : " + math);
		
		int sum = korean + english + math;
		System.out.println("합계 점수 : " + sum);
		double avr = (double) sum / 3.0;
		System.out.printf("평균 점수 : %.2f " , avr);
		
		if((korean >= 40) && (english >= 40) && (math >= 40) && (avr >= 60)) {
			System.out.println("\n축하합니다, 합격입니다!");
		}
		
		else {
			System.out.println("불합격입니다.");
		}
		
		
		
	}

	public static void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)을 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		String result;
		System.out.printf("BMI 지수 : %.2f\n" , BMI);
		// printf 문 다음에는 \n 이나 println 을 작성하여 줄바꿈을 해주어야 한다.
		
		if((BMI<18.5) && (BMI>0)) {
			result = "저체중";
		} else if((BMI>=18.5) && (BMI<23)) {
			result = "정상체중";
		} else if((BMI>=23) && (BMI<25)) {
			result = "과체중";
		} else if((BMI>=25) && (BMI<30)) {
			result = "비만";
		} else if(BMI>=30) {
			result = "고도비만";
		} else {
			result = "잘못된 입력";
		}
		System.out.println(result + " 입니다.");
		// String 을 사용하여 System.out.print 문을 대체하였을 경우,
		// 한 메소드 안에서 String 이후의 모든 System.out.print 문 전체에 대하여
		// 하나도 빠짐 없이 String 으로 생성한 변수를 사용해 주어야 한다. 
	}
	
	public static void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수를 입력하세요 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수를 입력하세요 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수를 입력하세요 : ");
		int asm = sc.nextInt();
		System.out.print("출석 일수를 입력하세요 : ");
		int att = sc.nextInt();
		
		System.out.println("========== 결과 ==========");
		
		double midScore = (double) mid * 0.2;
		System.out.printf(": %.2f점\n" , midScore);
	}

	public static void practice10() {
		/*
		 키보드로 2개의 정수와 연산 기호를 입력하여, 
		 연산 기호에 맞춰 연산 결과 출력하기 
		 (2개의 정수 모두 양수일때만 작동하며, 
		 음수나 지정하지 않은 연산 기호를 입력하였을 경우
		 "잘못 입력했습니다." 출력
		 */
		Scanner sc = new Scanner(System.in);
		double result;
		System.out.print("양수인 첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		if(num1 > 0) {
			System.out.print("연산 기호 +, -, *, /, % 중 하나를 입력하세요 : ");
			char sign = sc.next().charAt(0);{
				switch(sign) {
				case '+' : case '-' : case '*' : case '/' : case '%' :  
					System.out.println("양수인 두번째 정수를 입력하세요 : ");
					int num2 = sc.nextInt();
					break;
					switch() {}
				default : 
					System.out.println("잘못된 입력입니다.");
					return;
				}
			}
		} else {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		System.out.println("\n첫번째 수 : " + num1 + " " +
				   sign + " 두번째 수 : " + 
				   num2 + "\n의 결과값은 " +
				   num1 + sign + num2 + 
				   " = " + result + " 입니다.");
		
		/*double result;
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
			case '/' :
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
		}*/
	}
	
}