package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {

// 필드	
	private EmployeeController eem = new EmployeeController();

// 메서드	
	// 정보, 성적, 결과 출력하는 기본 생성자
	public EmployeeMenu() {
		System.out.println("학생 이름 \t\t 과목 \t\t 점수");
		System.out.println("========================");
		
		for(Employee employee : eem.printEmployee()) {
			System.out.println(employee.inform());
		}
		System.out.println("==========");
		System.out.println("총점 : " + eem.sumScore()); // ssm.avgScore()[0] == ssm.sumScore()
		System.out.printf("평균 : %.2f \n" , eem.avgScore()[1]);
		System.out.println("합격 여부 : " + (eem.avgScore()[1] >= EmployeeController.CUT_LINE));
	}

}
