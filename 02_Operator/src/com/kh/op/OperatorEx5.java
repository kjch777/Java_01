package com.kh.op;

public class OperatorEx5 {

	public static void main(String[] args) {
		/*
		 
		 비교 연산자 
		 
		 == : 서로 같으면 true
		 	예를 들어 
		 	       5 == 5 : true
		 		   3 == 5 : false
		 		   5 == 3 : false
		 		   
		 != : 서로 다르면 true
		  	예를 들어
		  		   5 != 5 : false
		  		   3 != 5 : true
		  		   5 != 3 : true
		 
		 
		 관계형 연산자(비교 연산자에 속함)
		 
		    왼쪽과 오른쪽의 값이 초과나 미만일 때 사용하는 표현
		 왼쪽 > 오른쪽 : 왼쪽의 값이 오른쪽의 값보다 크면 true 
		 왼쪽 < 오른쪽 : 왼쪽의 값이 오른쪽의 값보다 작으면 true
		  
		    왼쪽과 오른쪽의 값이 이상이나 이하일 때 사용하는 표현
		 왼쪽 >= 오른쪽 : 왼쪽의 값이 오른쪽의 값보다 크거나 같으면 true 
		 왼쪽 <= 오른쪽 : 왼쪽의 값이 오른쪽의 값보다 작거나 같으면 true
		  
		  
		 논리 연산자
		 
		 && : 앞 뒤 2개 항의 조건이 모두 true 일 때만 전체 표현이 true
		 	예를 들어
		 		   (5 == 5) && (5 == 5) : true
		 		   (5 != 3) && (3 == 3) : true
		 		   (5 == 5) && (5 == 3) : false
		 		   (3 == 5) && (5 == 5) : false
		 		   
		 || : 앞 뒤 2개 항의 조건 중에 하나라도 true 일 때는 전체 표현이 true
		 	예를 들어
		 		   (5 == 5) || (5 == 5) : true
		 		   (5 == 5) || (5 == 3) : true
		 		   (5 == 3) || (3 == 3) : true
		 		   (5 == 3) || (3 == 5) : false
		 		   
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		boolean result1 = (num1 == num2); // num1 과 num2 가 같다면 true
		boolean result2 = (num1 != num2); // num1 과 num2 가 다르다면 true
		boolean result3 = (num1 < num2); // num1 이 num2 보다 작다면 true
		
		System.out.println("결과값1 : " + result1);
		System.out.println("결과값2 : " + result2);
		System.out.println("결과값3 : " + result3);
		
	}

}
