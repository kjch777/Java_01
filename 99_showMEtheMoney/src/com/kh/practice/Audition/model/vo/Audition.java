package com.kh.practice.Audition.model.vo;

public class Audition {
	
// �ʵ�
	private String name;
	private String value;
	private int score;
	private boolean passed;
	
// �޼���
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

	// �⺻ ������
	public Audition() {
		
	}
	
	// �ʼ� ������
	public Audition(String name, String value, int score) {
		this.name = name;
		this.value = value;
		this.score = score;
	}
	
	// ��ȯ �޼���
	public String inform() { // ���ο� return "��ȯ�ϰ� ���� ����";
		return "�̸� : " + name + " || �о� : " + value + " || ���� : " + score;
	}

}
