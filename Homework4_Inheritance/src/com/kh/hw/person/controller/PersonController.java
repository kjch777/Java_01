package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	// �л� �ڸ��� 3�ڸ� �����
	private Student[] students = new Student[3];
	
	private int studentIndex = 0;
	
	// ��� �� ����
	public int[] personCount() {
		int[] counts = new int[2]; // counts[0] = �л� �� �ڸ� counts[1] = ������ �� �ڸ�
		counts[0] = studentIndex;
		counts[1] = 0;
		return counts;
	}
	
	// �л��� ������ �Է��ϸ� ���� �����ϱ�
	// String name, int age, double height, double weight, int grade, String major
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
		// �л� �� �߰��ϱ�
		// �迭�� ���� ��, index ���� length ���� �ʰ��Ǹ� ���� ���ϰ� ����.
		if(studentIndex < students.length) {
		students[studentIndex++] = new Student(name, age, height, weight, grade, major);
		} else {
			System.out.println("�� �̻� �л��� �߰��� �� �����ϴ�.");
		}
	}
	
	// �л� ��� ����
	public Student[] printStudent() {
		return students;
	}
	
}
