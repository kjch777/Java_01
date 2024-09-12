package com.kh.oop.basic;

public class Animal { // class 명 == 파일명
	
	
	// 필드
	public String name;
	public int age;
	
	
	// 초기 생성자
	public Animal() {
		
	}
	
	
	// 필수 생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	// 이름만 필수인 생성자 만들어보기
	public Animal(String name) {
		this.name = name;
	}
	
	
	// 나이만 필수인 생성자 만들어보기
	public Animal(int age) {
		this.age = age;
	}
	
	// 출력 메서드
	public void info() {
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}
	
	
	// 메인 메서드
	// 생성자는 메서드에 포함된다. 따라서 메서드가 더 큰 개념이다.
	public static void main (String[] args) {
		// 초기 생성자
		Animal dog = new Animal(); // 소괄호 ( ) 안에 아무것도 없기 때문에, 초기 생성자에서 불러온게 된다.
		dog.name = "댕댕이";
		dog.age = 5;
		dog.info();
		
		System.out.println("==========");
		
		// 필수 생성자
		Animal cat = new Animal("고양이", 3); // 소괄호 ( ) 안에 조건을 넣었기 때문에, 필수 생성자에서 불러온게 된다.
		cat.info();
		
		System.out.println("==========");
		
		// 돼지	 소 만들어보기
		System.out.println("===== 돼지 =====");
		Animal pig = new Animal("돼지"); // int 기본값은 0
		pig.info();
		
		System.out.println("===== 소 =====");
		Animal cow = new Animal(7); // String 기본값은 null
		cow.info();
	}

}
