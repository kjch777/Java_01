package com.kh.example.practice7.model.vo;

public class Employee {
	
	// 필드
	public int empNo;
	public String empName, dept; // 같은 참조 자료형을 사용하면 , 를 붙여서 한 줄에 쓸 수 있다.
	public String job;
	public int age;
	public char gender;
	public int salary;
	public double bonusPoint;
	public String phone;
	public String address;
	
	
	// 초기 생성자
	public Employee() {
		
	}
	
	
	// 번호와 이름만 필수로 추가한 필수 생성자
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	
	// 값을 전부 필수로 추가한 필수 생성자
	public Employee(int empNo, String empName, String dept, String job, 
					int age, char gender, int salary, double bonusPoint, 
					String phone, String address) {
		
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
		
	}

}
