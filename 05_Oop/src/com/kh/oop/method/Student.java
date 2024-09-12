package com.kh.oop.method;

public class Student {
	
	// 필드
	// private은 같은 class 안 에서는 자유롭게 사용할 수 있다.
	private String name;
	private int age;
	private int grade;
	
	// 메서드 - 기본 생성자
	public Student() {
		
	}
	
	// 메서드 - 필수 생성자 : 필수 생성자 내부에는 this.
	public Student(String name1, int age1, int grade1) {
		this.name = name1;
		this.age = age1;
		this.grade = grade1;
	}
	
	// return 메서드
	public String getName() {
		return name; // return 메서드 내부에서는 변수명 까지만 선언한다.
	}
	// return 메서드 이름에는 자료형과 변수명을 적는다.
	public int getage() {
		return age;
	}
	// return 메서드 소괄호 ( ) 안에는 아무것도 적지 않는다.
	public int getGrade() {
		return grade;
	}
	
	// void method : 출력 메서드
	public void info() {
		System.out.println("===============\n");
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("학생의 학년 : " + grade + "\n");
	}

	// main method
	public static void main(String[] args) {
		Student sd1 = new Student("김철수", 15, 2); // 객체 생성 
		Student sd2 = new Student("박광자", 17, 1); // 객체 생성
		sd1.info();
		sd2.info();

	}

}
