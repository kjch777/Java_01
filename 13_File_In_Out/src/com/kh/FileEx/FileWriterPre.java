package com.kh.FileEx;

import java.io.*;

public class FileWriterPre {

	public static void main(String[] args) {
		String ��ο��� = "Hello World.txt";
		try {
			FileWriter temp = new FileWriter(��ο���, true);
			String ���� = "\n�ڹٸ� ���� �ΰ��� ����ü �󸶳� õ���ΰ�?";
			temp.write(����);
			temp.close();
			System.out.println("�ӽ� ���� �Ϸ�");
		} catch (IOException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}

	}

}
