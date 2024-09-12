package com.kh.javaAPIEx;
/*
 String : 문자열을 나타내는 클래스
  		  문자열을 생성하고, 조작하는데 사용한다.
  		  
 String str = new String(); - String 에서, 이 방식은 이제 더이상 사용하지 않는다.
 String str = "";
 
 코딩 테스트나, 문자를 자르고 변경할 때 사용하는 메서드 ▼
 
 substring // 전부 소문자 == 내가 시작하고 싶은 숫자부터, 끝내고 싶은 숫자까지 지정해서 변경할 수 있다. 
 substring(시작하는 숫자, 끝나는 숫자) = 인덱스 값
 substring(시작하는 숫자)          = 시작 숫자부터 끝나는 숫자까지 모두 변경하거나 사용한다는 뜻
 
 toUpperCase() = 원하는 문자열을 모두 대문자로 변환할 때 사용한다.
 toLowerCase() = 원하는 문자열을 모두 소문자로 변환할 때 사용한다.
        trim() = 원하는 문자열의 앞 뒤 공백을 모두 제거하고 리턴해줄 때 사용한다.
       split() = 문자열을 특정 구분자 기준으로 분할하고, 문자열 배열로 반환
     replace() = 문자열에서, 특정 문자열을 새로운 문자열로 대체
      charAt() = 문자열에서, 주어진 인덱스에 해당하는 문자 하나를 반환
 */
public class StringEx {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + ", " + str2 + ".";
		System.out.println(str3);
		
		// Garbage Collection
		// 코딩에서 사용하고, 더이상 사용되지 않을 것을 자동으로 없애는 것
		String phone = "010";
		phone += "-1234-5378"; // 이렇게 하면 위에 "010"; 은 이제 없어진다.
		System.out.println(phone);
		
		/*              
		                0 1 2 3 4 5 6 7 8 9 10		// 5 는 띄어쓰기
		 String 문자열 = "H e l l o   W o r l  d"; 
		 */
		String 문자열 = "Hello World";
		
		// 1. substring() // 전부 소문자
		String 서브스트링 = 문자열.substring(6);
		System.out.println(서브스트링);
		String 서브스트링1 = 문자열.substring(6, 8); // 6 부터 7 까지만 보여준다는 의미
		System.out.println(서브스트링1);
		
		// 2. toUpperCase()
		String 대문자 = 문자열.toUpperCase();
		System.out.println("대문자 맞아? : " + 대문자);
		
		// 3. toLowerCase()
		String 소문자 = 문자열.toLowerCase();
		System.out.println("소문자 맞아? : " + 소문자);
		
		// 4. trim() == 문자열의 앞과 뒤의 공백은 제거되지만, 문자열 사이의 공백은 제거되지 않는다.
		String 공백생성 = "     Hello     World     ";
		String 공백제거 = 공백생성.trim();
		System.out.println("공백 없어졌어? : " + 공백제거);
		
		// 5. split == 문자열을 특정 구분자 기준으로 분할하고, 문자열 배열로 반환 
		String 과일들 = "apple,banana,grape";
		String[] 과일배열 = 과일들.split(",");
		
		// for - each 문
		for(String 과일 : 과일배열) {
			System.out.println(과일);
		}
		
		// 6. replace == 특정 문자열을 새로운 문자열로 대체 
		String 헬로월드 = "Hello, World!";
		String 변경 = 헬로월드.replace("Hello", "Hi");
		System.out.println(변경);
		
		// 7. charAt == 문자열에서, 주어진 인덱스에 해당하는 문자 하나를 반환
		String 하이월드 = "Hi, World!";
		char ch = 하이월드.charAt(8);
		System.out.println(ch);
		
	}
	
}
