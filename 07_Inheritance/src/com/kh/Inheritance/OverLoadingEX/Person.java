package com.kh.Inheritance.OverLoadingEX;

public class Person {

// 필드 : 변수명을 작성해주는 것
	private String name;
	private int age;
	
// 메서드 : 특정 행동을 하기 위해 묶는 코드
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 생성자 - 기본 : 오버로딩(메서드 이름은 똑같은데, 안에 있는 매개변수가 다를 때 사용한다.)
	public Person() {
		
	}
	
	// 생성자 - 필수 : 오버로딩(메서드 이름은 똑같은데, String name 이 필수로 들어가길 원하는 경우)
	public Person(String name) {
		this.name = name;
	}
	
	// 생성자 - 필수 : 오버로딩(메서드 이름은 똑같은데, String name 과 int age 가 필수로 들어가길 원하는 경우)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// void - 출력
	public void displayInfo() {
		System.out.println("이름 : " + name + " , 나이 : " + age);
	}
	
}
