package com.kh.imageEx;

import java.io.*;

public class ImagePre2 {
	public static void main(String[] args) {
		String ������� = System.getProperty("user.home") + "/Desktop";

		// �������� �ۼ��� ������ ������ �տ� / �� �ۼ��ߴ��� �ݵ�� Ȯ���ؾ� �Ѵ�.
		File �������� = new File(������� + "/�̹�������");
		if (��������.exists()) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			��������.mkdir();
		}

		try {
			// FileWriter �� ���� �� ������ ��������, ������ �̸��� ���ϰų�, �� �ٸ� �۾��� �ϱ⿡�� ������� �ִ�.
			FileWriter �����ۼ� = new FileWriter(�������� + "/�����̸�.txt"); // / �ݵ�� ��� �Ѵ�! // ,true �� ���� �̾ �ۼ��� �� �ִ�.
			�����ۼ�.write("��\n�����\n����\n�䳢\nȣ����");
			�����ۼ�.close(); // �۾��ϰ� �� �� �׻�, �۾��ϴ� ������ �ݾ��� ��
			System.out.println("�ۼ� �Ϸ�");
			
			File �������� = new File(�������� + "/�����̸�.txt");
			File ���ο��̸� = new File(�������� + "/�����ϴµ����̸�.txt");
			
			if(��������.renameTo(���ο��̸�)) {
				System.out.println("���� �̸� ���� �Ϸ�");
			} else {
				System.out.println("���� �̸� ���� ����");
			}
			
			// ������ ���� ����
			// ���� �ȿ� ������ �����Ѵٸ�, ���� ������ �Ұ����ϴ�.
			// ����, ���� �ȿ� ������ �����ϴ��� ���� Ȯ���� ��, ������ ���ٸ� ������ �����Ѵ�.
			// �迭�� �̿��Ͽ� ���ϸ���� ���� �ް�, ���ϸ���� ���ٸ� ������ �����ϸ� �ȴ�.
			File[] ���ϸ�� = ��������.listFiles();
			System.out.println("���� �ȿ� �ִ� ���� ��� ���� : " + ���ϸ��); // �̰� ����� ����� ������
			// for - each ���� ����ؾ� �Ѵ�.
			for(File f : ���ϸ��) {
				System.out.println(f.getName());
			}
			��������.delete();
			���ο��̸�.delete();
			if(��������.delete()) {
				System.out.println("���� ���� �Ϸ�");
			} else {
				// ���� ������ ���� �ְų�, ��� ���̸� ������ ���� �ʴ´�.
				// ����, ���� �ȿ� ������ ������ ���� ���, ���� ���� ������ ������ �߻��� ���� �ִ�.
				System.out.println("���� ���� ����");
			}
		} catch (IOException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		
	}
}
