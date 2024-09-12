package com.kh.example.practice4.model.vo;

public class Student {
	
	// 필드
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	// setter getter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	// 초기화 블럭이란, 중괄호 { } 안에 필드값 = 0 으로 지정하는 것을 말한다..?
	// 메서드 - 생성자 - 기본
	public Student() {
		
	}
	
	
	// 메서드 - void - 출력
	public void information() { // 출력 순서는 여기서 정해진다!
		System.out.println("===== 학생 정보 조회 =====\n");
		System.out.println("학년 : " + grade);
		System.out.println(" 반 : " + classroom); // + 뒤는 필드에서 가져온다.
		System.out.println("이름 : " + name);
		System.out.println(" 키 : " + height);
		System.out.println("성별 : " + gender);
	}

}
