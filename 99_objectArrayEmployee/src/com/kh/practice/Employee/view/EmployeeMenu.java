package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {

// �ʵ�	
	private EmployeeController eem = new EmployeeController();

// �޼���	
	// ����, ����, ��� ����ϴ� �⺻ ������
	public EmployeeMenu() {
		System.out.println("�л� �̸� \t\t ���� \t\t ����");
		System.out.println("========================");
		
		for(Employee employee : eem.printEmployee()) {
			System.out.println(employee.inform());
		}
		System.out.println("==========");
		System.out.println("���� : " + eem.sumScore()); // ssm.avgScore()[0] == ssm.sumScore()
		System.out.printf("��� : %.2f \n" , eem.avgScore()[1]);
		System.out.println("�հ� ���� : " + (eem.avgScore()[1] >= EmployeeController.CUT_LINE));
	}

}
