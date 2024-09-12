package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeController {
	
	// �迭 - class ���ο� �ۼ�
	private Employee[] eArr = new Employee[5]; // �ۼ� �� import ���־�� �Ѵ�.
	
	public static final int CUT_LINE = 60; // static final �ڷ��� ������ = ����Һ��� ��; ��, ���
	//										  �� ��, �������� ���� �빮�ڷ� �ۼ��Ѵ�.
	
// �޼���
	// �⺻ ������
	public EmployeeController() {
		// 5���� ��ü �迭�� ������ ���� �������� ������ �ʱ�ȭ
		eArr[0] = new Employee("��浿", "�ڹ�", 100);
		eArr[1] = new Employee("�ڱ浿", "���", 50);
		eArr[2] = new Employee("�̱浿", "ȭ��", 85);
		eArr[3] = new Employee("���浿", "����", 60);
		eArr[4] = new Employee("ȫ�浿", "�ڹ�", 20);
	}
	
	// ��ü �迭�� �ִ� ������ ��ȯ
	public Employee[] printEmployee() {
		return eArr; 
	}
	
	// ��ü �迭�� ������ ��� ���� �� ��ȯ
	public int sumScore() {
		int sum = 0; // sum �ʱ�ȭ
		for(Employee e : eArr) {
			sum += e.getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] avgArr = new double[2]; // �ڷ���[] ���ο� ������ = new �ڷ���[���ϴ� ��];
		avgArr[0] = sumScore();          // ���ο� ����[0] �� sumScore(); �� ��´�.
		avgArr[1] = avgArr[0] / eArr.length; // ���ο� ����[1] �� sumScore(); / eArr �� �ִ� ����;
											 // �� ���� ���� / �� �л� ��
		return avgArr; // avgArr ���� ��ȯ�ϰڴ�.
	}

}
