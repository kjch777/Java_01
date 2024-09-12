package com.kh.oop.method;

public class Animal {
	
	// 필드
	public String name;
	public int age;
	
	// method - 기본 생성자
	public Animal() {
		
	}
	
	// method - 필수 생성자
	public Animal(String name1, int age1) {
		this.name = name1;
		this.age = age1;
	}
	
	// return method - 이름
	public String getName() {
		return name;
	}
	
	// return method - 나이
	public int getAge() {
		return age;
	}
	
	// void method - 출력 메서드
	public void info() {
		System.out.println("동물 이름 : " + name);
		System.out.println("동물 나이 : " + age);
	}
	
	// main method
	public static void main(String[] args) {
		
		Animal dog = new Animal("댕댕이", 4); // 객체 생성
		dog.info();
		
		System.out.println("\n===============\n");
		
		Animal cat = new Animal("나비", 2); // 객체 생성
		cat.info();

	}

}
