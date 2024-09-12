package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();

	public void mainMenu() {
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ����");
		System.out.println("3. ���� ����");
		System.out.println("4. ��   ��");
		System.out.print("�޴� ���� : ");
		
		int choice = sc.nextInt();
		sc.nextLine(); // ����(�����ִ� ����) �����
		
		switch(choice) {
		case 1 : 
			fileSave();
			break;
		case 2 : 
			fileOpen();
			break;
		case 3 : 
			fileEdit();
			break;
		case 4 : 
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0); // return; ���δ� �ݺ��� ���� �� �����µ�, �̷��� �ϴϱ� �ݺ��� ������.
		default : 
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
		}
	}
	
	public void fileSave() {
		System.out.print("���� �̸� �Է� : ");
		String fileName = sc.nextLine();
		
		// ����, ������ �����Ѵٸ�
		if(fc.checkName(fileName)) {
			System.out.println("���� �̸��� ������ �̹� �����մϴ�.");
		} else {
			System.out.print("�ۼ��� ���� �Է� : ");
			String content = sc.nextLine();
			fc.fileSave(fileName, new StringBuilder(content));
		}
	}
	
	public void fileOpen() {
		System.out.print("������ ���� �̸� �Է� : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		System.out.println("���� ���� : " + fileContent);
	}
	
	public void fileEdit() {
		System.out.print("������ ���� �̸� �Է� : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		
		System.out.println("���� ���� ���� : " + fileContent);
		System.out.print("������ ���� �Է� : ");
		String newContent = sc.nextLine();
		fc.fileEdit(fileName, new StringBuilder(newContent));
	}

}
