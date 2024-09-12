package com.kh.FileEx;

import java.io.*;
/*
 FileWriter : ���Ͽ� ���ڸ� ���� ���� ��ü�̴�. 
 			  ������ ���ٸ� ������ �����ϰ�, ���Ͽ� �����͸� �ٷ� �� �� �ְ� ���ش�.
   .write() : �ۼ��ϰ� ���� ������ ���� �ȿ� �ۼ��� �� �ְ� ���ִ� �޼����̴�.
   .flush() : Stream�� ����, ��� �����͸� ����� �� ����Ѵ�. (����� �����Ͱ� ��� �ۼ��� �����ϴ�.)
   .close() : ���� �ִ� ������ ���� �� ����Ѵ�.
 */
public class FileWriteEx {

	public static void main(String[] args) {
		
		//                                  ("���ϸ�.Ȯ����") true �� ������ ����⸦ �����Ѵ�.
		try { //                            ("���ϸ�.Ȯ����", true) �� �ۼ��ϸ�, .write() �ȿ� �ۼ��� ���� �ѹ� �� �ۼ��Ѵ�.
			//                                ���ϸ� �տ� �ּҰ� ������, ���� �ڹ� �ڵ带 �ۼ� ���� ���� �ٷ� �ȿ� �����ȴ�.
			FileWriter �۾��� = new FileWriter("��������.txt");
			
			// ���Ͽ� ���� ����
			�۾���.write("�ȳ��ϼ���, ȯ���մϴ�.");
			
			�۾���.close();
			System.out.println("�۾��� �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
