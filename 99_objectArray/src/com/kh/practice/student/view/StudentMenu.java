package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

// ������� ���忡�� �ٶ󺸴� ȭ�� 

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
// �޼���
	// �⺻ ������
	public StudentMenu() {
		
	}
	
	// ��� void - �л� ������ ����, ���
	public void printStudentMenu() {
		System.out.println("�л� �̸� \t\t ���� \t\t ����");
		System.out.println("===============");
		
		// for - each ��
		// String �� ��ٸ� �л��� �̸�, ����, ���� �߿� �ϳ��� ������ �� �ִ�.
		// Student �� �̸�, ����, ���� ��� ������ �� �ִ�.
		//   [   ,   ,   ]
		for(Student student : ssm.printStudent()) {
			System.out.println(student.inform());
		}
		System.out.println("==========");
		System.out.println("���� : " + ssm.sumScore()); // ssm.avgScore()[0] == ssm.sumScore()
		System.out.printf("��� : %.2f \n" , ssm.avgScore()[1]);
		System.out.println("�հ� ���� : " + (ssm.avgScore()[1] >= StudentController.CUT_LINE));
		
		ssm.printPass();
		
		/*
		
		 		boolean �� �� ���� ���µ� �� true false �� ���� ��µǴ°�?
		 					�л����� ��� >= �հ� ĿƮ����
		 			ssm.avgScore()[1] >= StudentController.CUT_LINE
		 				   80					    60
		 ���� ���ų�, ũ�ų�, �۴ٴ� ���� ǥ���ϴ� �ε�ȣ���� true���� false���� ���и� �ϱ� ���� �����ϱ� �����̴�.  
		 
		 */
	}
	
}
