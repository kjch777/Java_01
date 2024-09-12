package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// ���� 1�� ���� ������ ���� ������ Employee ��ü ����
		Employee emp1 = new Employee();
		// ��Ű���� �ٸ� �� import �ۼ��ؼ� �ҷ�����
		
		emp1.empNo = 100;
		emp1.empName = "ȫ�浿";
		emp1.dept = "������";
		emp1.job = "����";
		emp1.age = 25;
		emp1.gender = '��';
		emp1.salary = 2500000;
		emp1.bonusPoint = 0.05;
		emp1.phone = "010-7777-8888";
		emp1.address = "����� ������";
		
		System.out.println("===== ����1 ======");
		System.out.println("���� ��ȣ : " + emp1.empNo);
		System.out.println("���� �̸� : " + emp1.empName);
		System.out.println("���� �μ� : " + emp1.dept);
		System.out.println("���� ���� : " + emp1.job);
		System.out.println("���� ���� : " + emp1.age);
		
		// ���� 2�� ��ȣ, �̸��� �ʼ��� �־��.
		// ��ü ������ ��, �ʼ� �����ڷ� �ۼ��ϱ�
		Employee emp2 = new Employee(2, "���׶��");
		System.out.println("===== ����2 =====");
		System.out.println("���� ��ȣ : " + emp2.empNo);
		System.out.println("���� �̸� : " + emp2.empName);
		
		// ���� 3�� ��� �ʼ� �ۼ��ؼ� ����غ���.
		Employee emp3 = new Employee(3, "����׸�", "�ѹ���", "�븮", 30, '��', 2_500_000, 
									 0.07, "010-1234-5678", "����� ��õ��");
		System.out.println("===== ����3 =====");
		System.out.println("���� ��ȣ : " + emp3.empNo);
		System.out.println("���� �̸� : " + emp3.empName);
		System.out.println("���� �μ� : " + emp3.dept);
		System.out.println("���� ���� : " + emp3.job);
		System.out.println("���� ���� : " + emp3.age);
		System.out.println("���� ���� : " + emp3.gender);
		System.out.println("���� ���� : " + emp3.salary);
		System.out.println("�μ� Ƽ�� : " + emp3.bonusPoint);
		System.out.println("��ȭ ��ȣ : " + emp3.phone);
		System.out.println("���� �ּ� : " + emp3.address);

	}

}
