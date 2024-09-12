package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

// 사용자의 입장에서 바라보는 화면 

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
// 메서드
	// 기본 생성자
	public StudentMenu() {
		
	}
	
	// 출력 void - 학생 정보와 성적, 결과
	public void printStudentMenu() {
		System.out.println("학생 이름 \t\t 과목 \t\t 점수");
		System.out.println("===============");
		
		// for - each 문
		// String 을 썼다면 학생의 이름, 과목, 점수 중에 하나만 가져올 수 있다.
		// Student 는 이름, 과목, 점수 모두 가져올 수 있다.
		//   [   ,   ,   ]
		for(Student student : ssm.printStudent()) {
			System.out.println(student.inform());
		}
		System.out.println("==========");
		System.out.println("총점 : " + ssm.sumScore()); // ssm.avgScore()[0] == ssm.sumScore()
		System.out.printf("평균 : %.2f \n" , ssm.avgScore()[1]);
		System.out.println("합격 여부 : " + (ssm.avgScore()[1] >= StudentController.CUT_LINE));
		
		ssm.printPass();
		
		/*
		
		 		boolean 을 쓴 적이 없는데 왜 true false 로 값이 출력되는가?
		 					학생들의 평균 >= 합격 커트라인
		 			ssm.avgScore()[1] >= StudentController.CUT_LINE
		 				   80					    60
		 값이 같거나, 크거나, 작다는 것을 표현하는 부등호들은 true인지 false인지 구분만 하기 위해 존재하기 때문이다.  
		 
		 */
	}
	
}
