package com.kh.practice.student.model.vo;

public class Student {

// 필드
	private String name;
	private String subject;
	private int score;
	private boolean passed; // 합격 여부 - boolean 은 최초값이 false

// 메서드
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}
	
	public boolean isPassed() {
		return passed;
	}

	// 기본 생성자
	public Student() {

	}

	// 필수 생성자
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;

	}

	// 자동정렬 단축키 : Ctrl + Shift + F
	// 반환하는 메서드
	public String inform() {
		return "이름 : " + name + ", 과목 : " + subject + ", 점수 : " + score;
	}
}
