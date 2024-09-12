package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 만들기를 시작합니다.");
		
		while(true) {
			System.out.print("비밀번호를 입력하세요 ( 1000 ~ 9999 ) : ");
			int pw = sc.nextInt();
			
			if((pw < 1000) || (pw > 10000)) {
				System.out.println("4자리가 아닙니다.");
				continue;
			}
			
			int[] digits = new int[4]; 	 // 4자리만 허용, 0 ~ 3 인 상태
			digits[0] = pw / 1000; 		 // 천의 자리
			digits[1] = (pw / 100) % 10; // 백의 자리
			digits[2] = (pw / 10) % 10;	 // 십의 자리
			digits[3] = pw % 10; 		 // 일의 자리
			
			boolean isTrue = true;
			// length : 크기
			for(int i = 0; i < digits.length; i++) {
				for(int j = i + 1; j < digits.length; j++) {
					if(digits[i] == digits[j]) {
						isTrue = true;
						break;
					}
				}
				
				if(!isTrue) {
					break;
				}
				// 중복 여부에 따른 메세지 출력
				if(!isTrue) {
					System.out.println("중복된 값이 있습니다.");
				} else {
					System.out.println("비밀번호 생성이 완료되었습니다.");
					break; // 비밀번호가 잘 만들어졌다면 모두 종료
				}
			}
			
		}
	}
	
}
