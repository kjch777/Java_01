package com.kh.practice.list.music.view;

import java.util.*; // .util.*;

import com.kh.practice.list.music.controller.MusicController;

public class MusicView {

// 필드
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

// 메서드
	// 출력 void
	public void mainMenu() {
		while(true) {
			System.out.println("===== 스포티파이 =====");
			System.out.println("1. 맨 뒤에 노래 추가");
			System.out.println("2. 맨 앞에 노래 추가");
			System.out.println("3. 전체 노래 목록 출력");
			System.out.println("4. 특정 노래 검색");
			System.out.println("5. 특정 노래 삭제");
			System.out.println("6. 특정 노래 수정");
			System.out.println("7. 노래 오름차순 정렬");
			System.out.println("8. 가수 내림차순 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine(); // 버퍼 지우기
			
			switch(choice) {
			
			case 1 : 
				addList();
				break;
			case 2 : 
				addAtZero();
				break;
			case 3 :
				printAll();
				break;
			case 4 : 
				searchMusic();
				break;
			case 5 : 
				removeMusic();
				break;
			case 6 : 
				setMusic();
				break;
			case 7 : 
				ascTitle();
				break;
			case 8 : 
				descSinger();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못된 메뉴 선택입니다. 다시 선택 해주세요.");
			
			}
		}
	}

	public void addList() {
		System.out.print("노래 제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 이름 입력 : ");
		String singer = sc.nextLine();
		mc.addList(title, singer);
	}

	public void addAtZero() {
		System.out.print("노래 제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 이름 입력 : ");
		String singer = sc.nextLine();
		mc.addAtZero(title, singer);
	}
	
	public void printAll() {
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		System.out.print("검색할 노래 입력 : ");
		String title = sc.nextLine();
		System.out.println(mc.searchMusic(title));
	}
	
	public void removeMusic() {
		System.out.print("삭제할 노래 입력 : ");
		String title = sc.nextLine();
		System.out.println(mc.removeMusic(title));
	}
	
	public void setMusic() {
		System.out.print("수정할 노래 입력 : ");
		String title = sc.nextLine();
		System.out.print("수정할 가수 입력 : ");
		String singer = sc.nextLine();
		System.out.println(mc.setMusic(title, singer));
	}
	
	public void ascTitle() {
		mc.ascTitle();
		System.out.println("노래를 오름차순으로 정렬했습니다.");
	}
	
	public void descSinger() {
		mc.descSinger();
		System.out.println("가수를 내림차순으로 정렬했습니다.");
	}

}
