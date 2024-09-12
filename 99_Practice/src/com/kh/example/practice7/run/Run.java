package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 직원 1에 대한 정보를 담을 변수명 Employee 객체 생성
		Employee emp1 = new Employee();
		// 패키지가 다를 땐 import 작성해서 불러오기
		
		emp1.empNo = 100;
		emp1.empName = "홍길동";
		emp1.dept = "영업부";
		emp1.job = "과장";
		emp1.age = 25;
		emp1.gender = '남';
		emp1.salary = 2500000;
		emp1.bonusPoint = 0.05;
		emp1.phone = "010-7777-8888";
		emp1.address = "서울시 강남구";
		
		System.out.println("===== 직원1 ======");
		System.out.println("직원 번호 : " + emp1.empNo);
		System.out.println("직원 이름 : " + emp1.empName);
		System.out.println("직원 부서 : " + emp1.dept);
		System.out.println("직원 직급 : " + emp1.job);
		System.out.println("직원 나이 : " + emp1.age);
		
		// 직원 2는 번호, 이름을 필수로 넣어보자.
		// 객체 생성한 후, 필수 생성자로 작성하기
		Employee emp2 = new Employee(2, "동그라미");
		System.out.println("===== 직원2 =====");
		System.out.println("직원 번호 : " + emp2.empNo);
		System.out.println("직원 이름 : " + emp2.empName);
		
		// 직원 3은 모두 필수 작성해서 출력해보자.
		Employee emp3 = new Employee(3, "세모네모", "총무부", "대리", 30, '여', 2_500_000, 
									 0.07, "010-1234-5678", "서울시 금천구");
		System.out.println("===== 직원3 =====");
		System.out.println("직원 번호 : " + emp3.empNo);
		System.out.println("직원 이름 : " + emp3.empName);
		System.out.println("직원 부서 : " + emp3.dept);
		System.out.println("직원 직급 : " + emp3.job);
		System.out.println("직원 나이 : " + emp3.age);
		System.out.println("직원 성별 : " + emp3.gender);
		System.out.println("직원 월급 : " + emp3.salary);
		System.out.println("인센 티브 : " + emp3.bonusPoint);
		System.out.println("전화 번호 : " + emp3.phone);
		System.out.println("직원 주소 : " + emp3.address);

	}

}
