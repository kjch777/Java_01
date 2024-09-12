package com.kh.example.practice4.run; // 폴더명

import com.kh.example.practice4.model.vo.Student;

public class Run { // 파일명

	public static void main(String[] args) {
		
		// 객체 생성
		Student std = new Student(); // 작성 후 반드시 import 로 불러와야 한다.
		
		std.setName("강용호");
		std.setGrade(6);
		std.setClassroom(4);
		std.setHeight(174.5); // 출력 순서는 여기서 정해지지 않는다!
		std.setGender('M');
		
		std.information();

	}

}
