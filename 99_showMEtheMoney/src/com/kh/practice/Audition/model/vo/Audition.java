package com.kh.practice.Audition.model.vo;

public class Audition {
	
// 필드
	private String name;
	private String value;
	private int score;
	private boolean passed;
	
// 메서드
	// getter
	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public int getScore() {
		return score;
	}

	public boolean isPassed() {
		return passed;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	// 기본 생성자
	public Audition() {
		
	}
	
	// 필수 생성자
	public Audition(String name, String value, int score) {
		this.name = name;
		this.value = value;
		this.score = score;
	}
	
	// 반환 메서드
	public String inform() { // 내부에 return "반환하고 싶은 내용";
		return "이름 : " + name + " || 분야 : " + value + " || 점수 : " + score;
	}

}
