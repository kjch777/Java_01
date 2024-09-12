
public class Variable {

	public static void main(String[] args) {
		// 정수 문자 문자열 실수 논리형
		// 정수 byte short int long
		// byte = 1byte
		
		byte 바이트 = 1;
		System.out.println(바이트);
		System.out.println("바이트");
		//파일을 저장할 때는 ctrl + s
		byte bt = 2;
		System.out.println(bt);
		short 쇼트 = 3;
		System.out.println(쇼트);
		int 인트 = 1;
		System.out.println(인트);
		long 롱 = 5;
		System.out.println(롱);
		// byte 자료형 선언 선언이름은 bte bte 안에 숫자 2 넣고 출력하기
		// short 자료형 선언 선언이름은 shrt shrt 안에 숫자 2 넣고 출력하기
		// int 자료형 선언 선언이름은 nt nt 안에 숫자 2 넣고 출력하기
		// long 자료형 선언 선언이름은 lng lng 안에 숫자 2 넣고 출력하기
		
		byte bte = 2;
		System.out.println(bte);
		short shrt = 2;
		System.out.println(shrt);
		int nt = 2;
		System.out.println(nt);
		long lng =2;
		System.out.println(lng);
		
		/*문자에는 char 와 String 이 있다
		 *문자를 나타내는 char은 '' 작은 따옴표만 사용 가능
		 *"" 큰 따옴표는 String 문자열을 나타내는 표현이기 때문에 char에서 사용불가
		 * char myChar3 = 'AB';
		 * char myChar4 = 'ABC';
		 * char myChar5 = '가나다';
		 * 모두 문자가 하나가 아니기 때문에 출력 불가
		 * char 에는 하나의 문자만 담을수있기 때문에 A or B만 사용할수 있다
		 * */
		char myChar = 'A';
		System.out.println(myChar);
		
		//String을 사용하면 띄어쓰기, 문장 다 쓸수 있다
		//String을 사용해서 내 이름 출력하기
		
		String Str1 = "와 드디어 문자열이다";
		System.out.println(Str1);
		
		String name = "김종찬";
		System.out.print("당신의 이름은 " + name + " 입니다.");
		// 만약에 여러 글자나 내용을 한줄로 출력하고 싶다면 + 를 사용해서 붙일수있다.
		System.out.println("당 신 의 이 름 은 "+name+" 입 니 다 .");
		
		// 띄어쓰기를 넣고 싶을 경우 "" 큰 따옴표 내부에 띄어쓰기를 하면 된다.
		// 정수 + 문자 + 문자열 출력하기
		
		/* 안녕하세요. 저는요. 수원에 사는 ooo 입니다.
		 * 제 전화번호는 111-2222-3333 입니다.
		 * 제 주민번호는 비밀입니다.
		 * 제 혈액형은 A형입니다.
		 * */
		
		String greeting = "안녕하세요. ";
		String introduction = "저는 수원에 사는 ooo 입니다.";
		String number = "111-2222-3333";
		char dash = '-';
		String secret = "비밀";
		String bloodType = "A형";
		System.out.print(greeting);
		System.out.println(introduction);
		System.out.println("제 전화번호는 "+number+" 입니다.");
		System.out.println("제 혈액형은 "+bloodType+" 입니다.");
		System.out.println("오류 제거를 위한 " + dash + " 사용");
		
		System.out.println(greeting + introduction);
		System.out.println("제 전화번호는 "+number+" 입니다.");
		System.out.println("제 혈액형은 "+bloodType+" 입니다.");
		System.out.println("제 주민번호는 "+secret+" 입니다.");
		
		// 실수는 float, double 사용
		// 실수의 기본값은 double 형식
		// float = 4byte, double = 8byte
		// float에 실수를 담기 위해서는 f를 붙여줘야 함
		// 실수 뒤에 f를 붙일 때는 대소문자 구분없이 사용 가능
		float ff1 = 3.14F;
		float ff2 = 3.14f;
		System.out.println("ff1 은 " + ff1 + " 이다.");
		System.out.println("ff2 는 " + ff2 + " 이다.");
		// double은 float 보다 크기 때문에, 구태여 다른 수식을 붙이지 않아도 사용이 가능하다
		double dd1 = 3.14;
		System.out.println("double dd1 : " +dd1);
		// boolean 을 사용해서 true 인지 false 인지 표현 가능
		// 나중에 알고리즘이나 if, for, while 문에 자주 사용
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("오늘 날씨는 "+isTrue);
		System.out.println("내일 날씨는 "+isFalse+ "?");
		
		// 정수 문자 문자열 실수 논리형
		int num = 10;
		System.out.println("정수 num 의 값 = " + num);
		
		char ch = 'Z';
		System.out.println("문자 ch 의 값 = " + ch);
		
		String text = "Hello, World!";
		System.out.println("문자열은 text = "+text);
		
		double dbl = 3.14;
		System.out.println(dbl);
		
		boolean isTrue2 = true;
		System.out.println("isTrue2 = " + isTrue2);
		
		System.out.println(" num = " + num);
		// num 에 10 대신 20 을 넣고 싶다면?
		num = 20;
		// 지정값은 처음 1회만 사용한 후, 변수명에 다른 숫자나 값을 넣을 때는 지정값을 생략한다. 
		System.out.println("20으로 변경한 정수 num 의 값 : " + num);
		
		
		/*
		 * 철수는 19살이었다.
		 * 그런데 24년이 되면서, 20살이 되었다.
		 * */
		
		String name1 = "철수";
		String age = "19";
		System.out.println(name1 + "는 " + age + "살이었다.");
		age = "20"; // 선언을 하나 더 하느니 age 값을 변경하는게 효율적이다
		System.out.println("그런데 24년이 되면서, " + age + "살이 되었다.");
		
		
	}

}
