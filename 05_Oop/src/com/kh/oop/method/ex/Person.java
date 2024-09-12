package com.kh.oop.method.ex;

public class Person {
	
	// 필드
	private String name; // private은 같은 class 안 에서는 자유롭게 사용할 수 있다.
	private 	int age; // private은 같은 class 안 에서는 자유롭게 사용할 수 있다.
	
	// Person 사람을 담을 생성자
	public Person() {
		
	}
	
	
	// 필드 대신 값을 저장하고 내보내는 setter getter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 메인 메서드
	// 단축키 main 작성 후 Ctrl Space 
	public static void main(String[] args) {
		Person person1 = new Person();
		
		// setter를 활용해서 속성 값 설정
		person1.setName("홍길동");
		person1.setAge(20);
		
		// getter를 활용해서 속성 값 읽기
		System.out.println("이름 : " + person1.getName());
		System.out.println("나이 : " + person1.getAge());
	}
}
