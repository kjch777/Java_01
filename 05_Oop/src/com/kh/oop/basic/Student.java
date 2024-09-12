package com.kh.oop.basic;

public class Student {
	// class 영어명은 반드시 대문자로 시작해야 한다.
	
	
	// 필드
	// 필드는 자료형과 변수명 지정만 하고, 값은 지정하지 않아도 된다.
	public String name;
	public String age;
	public String grade;
	
	
	// 생성자 메서드 (필수로 작성해야 하는 생성자 메서드 만들기)
	// 이름 나이 학년 모두 필수로 넣어보자.
	public Student(String inputName, String inputAge, String inputGrade) { 
		// 생성자 메서드 이름은 반드시 class 이름과 똑같아야 한다.
		// 생성자 메서드 소괄호 ( ) 안에 필수 조건은 , 로 구분하여 작성한다.
		this.name = inputName;
		this.age = inputAge;
		this.grade = inputGrade;
		// 필수 조건은 내부에 this. 을 사용하여 불러온 다음, 값을 새로 지정해준다.
		
	}
	
	
	// 정보 출력 메서드
	public void info() {
		// 이름 나이 학년 출력
		System.out.println("이름 : " + name); // 정보 출력 메서드에서는
		System.out.println("나이 : " + age);  // 필드에서 불러온다.
		System.out.println("학년 : " + grade);
	}
	
	
	// 최종 메인 메서드
	public static void main (String[] args) {
		// 학생 객체 생성하기				김철수 18살 3학년	박영희 20살 2학년
		Student student1 = new Student("김철수", "18살", "3학년");
		student1.info();
		System.out.println("==========");
		Student student2 = new Student("박영희", "20살", "2학년");
		student2.info();
		// 학생1과 학생2 정보 출력하기
	}
	
}
