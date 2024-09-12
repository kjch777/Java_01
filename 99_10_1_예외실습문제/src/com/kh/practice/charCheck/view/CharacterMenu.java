package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
		
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		
		CharacterController controller = new CharacterController();
		try {
			int count = controller.countAlpha(input);
			System.out.println("'" + input + "' 에 포함된 영문자의 갯수 : " + count);
		} catch (CharCheckException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		} finally {
			// 무슨 일이 있어도 스캐너를 닫아주겠다는 코드
			sc.close();
		}
	}

}
