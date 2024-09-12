package com.kh.hw.person.model.vo;

public class Student extends Person {

// 필드
	// 학년과 전공
	private int grade;
	private String major;
	
// 메서드
	// Setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// Getter
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	
	// 기본 생성자 constructor
	public Student() {
		// Ctrl + Space
	}
	
	// 필수 생성자 : Alt + Shift + S ▶ O
	public Student(String name, int age, double height, double weight, int grade, String major) { // 부모 클래스 - 필드의 자료형과 변수명을 입력 해주어야 한다.
		super(name, age, height, weight); // 부모 클래스 - 필드의 변수명을 입력 해주어야 한다.
		this.grade = grade;
		this.major = major;
	}
	
	// @Override toString
	@Override
	public String toString () {
		return "학생 [ 이름 = " + getName() + " , 나이 = " + getAge() + " , 키 = " + getHeight() + " , 몸무게 = " + getWeight() + " , 학년 = " + grade + " , 전공 = " + major + " ]";
	}
	
}
