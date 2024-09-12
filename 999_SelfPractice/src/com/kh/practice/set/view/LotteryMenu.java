package com.kh.practice.set.view;

import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	
// 필드
	// 객체 생성
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
// 메서드
	// 출력 void
	public void mainMenu() {
		System.out.println("===== 로또 추첨 프로그램 =====");
		
		// 사용자가 직접 메인 메뉴를 선택 할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메서드로 이동.
		while(true) {
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1번 : 추첨자 추가");
			System.out.println("2번 : 추첨자 삭제");
			System.out.println("3번 : 당첨자 확인");
			System.out.println("4번 : 당첨자 정렬해서 확인");
			System.out.println("5번 : 당첨자 검색");
			System.out.println("9번 : 프로그램 종료");
			System.out.print("원하는 메뉴의 번호를 입력하세요 : ");
			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼 지우기
			
			switch(menu) {
			case 1 : 
				insertObject();
				break;
			case 2 :
				deleteObject();
				break;
			case 3 : 
				winObject();
				break;
			case 4 : 
				sortedWinObject();
				break;
			case 5 : 
				searchWinner();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			}
		}


	}
	
	// 추첨자 추가를 위해 정보를 받는 메서드
	// 추첨자 추가용 view 메서드
	public void insertObject() {
		
		// 추가할 추첨자 수 입력 받기
		System.out.print("추가할 추첨자 수를 입력 하세요 : ");
		int num = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		
		// 입력 받은 수만큼 추첨자 이름과 추첨자 전화번호 입력 받기
		for(int i = 1; i <= num; i++) {
			System.out.print("추첨자 이름을 입력 하세요 : ");
			String name = sc.nextLine();
			System.out.print("추첨자 전화번호를 입력 하세요 : ");
			String phone = sc.nextLine();
			
			// 매개변수 생성자 (즉, 필수 생성자) 를 이용해 Lottery 객체에 추첨자 정보 저장 하기
			Lottery lottery = new Lottery(name, phone);
			// import 해야 하고             (자료형을 제외한 변수명만, 변수가 여러개면 , 로 구분)
			
			// Lottery 객체를 lc (LotteryController) 의 ◀ 필드에 이미 있다! 
			// .insertObject() 로 전달
			lc.insertObject(lottery);
			
			// 단, 중복된 추첨자를 입력했거나, 이미 추첨 HashSet 에 대상이 있는 경우,
			// "중복된 대상입니다. 다시 입력하세요." 출력 후, 다시 객체 입력하게 하기
			// 모든 입력이 완료되면 "추가 완료 되었습니다." 출력
			
		}
		
	}
	
	// 특정 추첨자 삭제 결과를 알리는 메서드 // 알리는, void == 출력
	// 추첨자 삭제용 view 메서드
	public void deleteObject() {
		// 삭제할 대상의 이름과 전화 번호를 받고,
		System.out.println("삭제할 대상의 이름과 전화 번호를 입력 하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		
		// 매개변수가 있는 Lottery 생성자 (즉, 필수 생성자) 를 이용하여, 
		Lottery lottery = new Lottery(name, phone);
		
		// 객체에 정보를 담아 lc 로 객체 보내기
		lc.deleteObject(lottery);
		
		// 받은 결과에 따라 true 면 "삭제 완료 되었습니다."
		
		// false 면 "존재하지 않는 대상입니다." 출력
	}
	
	// println 메서드를 이용하여, 당첨자를 출력하는 메서드
	public void winObject() {
		
	}
	
	// 정렬된 당첨자 확인
	public void sortedWinObject() {
		// lc 에서 받아온 HashSet 객체를 Iterator 를 통해 출력하기
	}
	
	// 당첨자 중 특정 대상이 있는지 결과를 출력하는 메서드
	// 당첨자 검색용 view 메서드
	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 전화 번호를 입력하세요.");
		
		// 검색할 대상의 이름과 전화 번호를 받아,
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화 번호 : ");
		String phone = sc.nextLine();
		
		// 매개변수가 있는 Lottery 생성자 (즉, 필수 생성자) 를 이용하여,
		Lottery lottery = new Lottery(name, phone);
		
		// 객체에 정보를 담아 lc 에 객체 보내기
		lottery.
		
		// 받은 결과에 따라 true 면 "축하합니다. 당첨 목록에 존재합니다."
		// false 면 "안타깝습니다. 당첨 목록에 존재하지 않습니다." 출력
	}
	
}
