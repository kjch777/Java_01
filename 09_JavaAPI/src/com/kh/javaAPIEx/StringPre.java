package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		
		// substring 메서드를 사용하여, 문자열의 일부(Today)를 추출하라.
		String 문제1 = "Today is a beautiful day.";
		String 서브스트링1 = 문제1.substring(0, 5); // 시작 숫자는 시작 문자, 끝 숫자는 끝 문자 + 1
		System.out.println(서브스트링1);
		
		// toUpperCase 메서드를 사용하여, 모두 대문자로 변환하라.
		String 문제2 = "Programming is fun and challenging.";
		String 투어퍼케이스 = 문제2.toUpperCase();
		System.out.println(투어퍼케이스);
		
		// toLowerCase 메서드를 사용하여, 모두 소문자로 변환하라.
		String 문제3 = "Learning new things is exciting.";
		String 투로어케이스 = 문제3.toLowerCase();
		System.out.println(투로어케이스);
		
		// split 을 사용하여, 문자열을 " " 로 구분하라.
		String 문제4 = "A good medicine tastes bitter.";
		String[] 문제4배열 = 문제4.split(" ");
		
			// for - each 문
			for(String 문제4_1 : 문제4배열) {
				System.out.println(문제4_1);
			}
		
		// replace 를 사용하여, more 를 less 로 대체하라.
		String 문제5 = "The more, the better.";
		String 리플레이스 = 문제5.replace("more", "less");
		System.out.println(리플레이스);
		
		// charAt 을 사용하여, 6번째 문자를 가져와라.
		String 문제6 = "Walls have ears.";
		char 차앳 = 문제6.charAt(6); // .charAt(); 을 쓰려면, char 를 써야 한다.
		System.out.println(차앳);
		
		// substring 메서드를 사용하여, his 부터 끝까지 추출하라.
		String 문제7 = "Every dog has his day.";
		String 서브스트링2 = 문제7.substring(14);
		System.out.println(서브스트링2);

	}

}
