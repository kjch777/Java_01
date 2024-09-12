package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
		
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		
		CharacterController controller = new CharacterController();
		try {
			int count = controller.countAlpha(input);
			System.out.println("'" + input + "' �� ���Ե� �������� ���� : " + count);
		} catch (CharCheckException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		} finally {
			// ���� ���� �־ ��ĳ�ʸ� �ݾ��ְڴٴ� �ڵ�
			sc.close();
		}
	}

}
