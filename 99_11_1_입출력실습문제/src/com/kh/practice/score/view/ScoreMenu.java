package com.kh.practice.score.view;

import java.io.*;
import java.util.*;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() throws Exception {
		while (true) {
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ���");
			System.out.println("0. ��   ��");
			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();
			sc.nextLine(); // ���� �����

			switch (choice) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			}
		}

	}

	public void saveScore() {
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		sc.nextLine(); // ���� �����
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		sc.nextLine(); // ���� �����
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();
		sc.nextLine(); // ���� �����
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		scr.saveScore(name, kor, eng, math, sum, avg);
		
	}

	public void readScore() throws Exception {
		DataInputStream dis = scr.readScore();
		while(dis.available() > 0) {
			String name = dis.readUTF();
			int kor = dis.readInt();
			int eng = dis.readInt();
			int math = dis.readInt();
			int sum = dis.readInt();
			double avg = dis.readDouble();
			System.out.printf("�̸� : %s, ���� : %d, ���� : %d, ���� : %d, �հ� : %d, ��� : %.2f%n", name, kor, eng, math, sum, avg);	
		}
	}

}
