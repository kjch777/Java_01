package com.kh.example.practice4.run; // ������

import com.kh.example.practice4.model.vo.Student;

public class Run { // ���ϸ�

	public static void main(String[] args) {
		
		// ��ü ����
		Student std = new Student(); // �ۼ� �� �ݵ�� import �� �ҷ��;� �Ѵ�.
		
		std.setName("����ȣ");
		std.setGrade(6);
		std.setClassroom(4);
		std.setHeight(174.5); // ��� ������ ���⼭ �������� �ʴ´�!
		std.setGender('M');
		
		std.information();

	}

}
