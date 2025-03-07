package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	// 사용자로부터 숫자를 입력받고
	Scanner sc = new Scanner(System.in);
	
	// PersonController 가져오기
	PersonController pc = new PersonController();
	
// 메서드
	// 출력 void
	public void mainMenu() {
		while (true) {
			System.out.println("==== 메인 메뉴 ====");
			System.out.println("1. 학생 메뉴");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine(); // 남아있는 Enter 없애기

			// 번호를 선택할 수 있는 switch 문 작성
			switch (choice) {
			case 1:
				studentMenu();
				break;
			// 학생 메뉴 작성 후 break;

			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			}
		}
	}

	// 학생을 추가하거나 조회하기
	public void studentMenu() {
		while (true) {
			System.out.println("==== 학생 메뉴 ====");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 출력");
			System.out.println("0. 이전 메뉴로 돌아가기");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine(); // 남아있는 Enter 없애기

			switch (choice) {
			case 1:
				insertStudent();
				// 학생 추가하기
				break;

			case 2:
				printStudent();
				// 학생 출력하기
				break;

			case 0:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;

			default:
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			}
		}
	}

	public void insertStudent() {
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 남아있는 Enter 없애기

		System.out.println("신장 : ");
		double height = sc.nextDouble();
		sc.nextLine(); // 남아있는 Enter 없애기

		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine(); // 남아있는 Enter 없애기

		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine(); // 남아있는 Enter 없애기

		System.out.println("전공 : ");
		String major = sc.nextLine();

		// 2번째로 학생 추가 넣기
		pc.insertStudent(name, age, height, weight, grade, major);
		System.out.println("학생이 추가되었습니다.");
	}
	
	// 학생이 얼마나 존재하는지 출력하기
	public void printStudent() {
		// 학생 정보가 들어있는 Student 장바구니 모양의 배열 가져오기
		Student[] students = pc.printStudent();
		System.out.println("==== 학생 목록 ====");
		
		// for - each 문
		for(Student s : students) {
			
			// 만약 안이 비어있지 않다면 학생들을 보여주기
			if(s != null) {
				System.out.println(s);
			} else {
				System.out.println("보여줄 학생 정보가 없습니다.");
			}
			
		}
		
	}

}
