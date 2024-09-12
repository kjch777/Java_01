package com.kh.practice.Employee.model.vo;

public class Employee {

// 필드 : class 내부에 작성
	private String name;
	private String subject;
	private int score;
	
// 메서드
	// getter
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// 기본 생성자
	public Employee() {
		
	}
	
	// 필수 생성자
	public Employee(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// 반환하는 메서드
	public String inform() {
		return "이름 : " + name + " || 과목 : " + subject + " || 점수 : " + score;
	}
	
}
