package com.kh.FileEx;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FilePre {

	public FilePre() {
		// Ctrl + Space
	}

	public void method1() {
		File �ؽ�Ʈ���� = new File("c:/Users/user1/Desktop/newFFF/���ϻ���.txt");
		if (�ؽ�Ʈ����.exists()) {
			System.out.println("������ �����մϴ�.");
		} else { // �������� �ʴ´ٸ�
			try { // ���� ���� ����⿡ �����ߴٸ�
				�ؽ�Ʈ����.createNewFile();
				System.out.println(�ؽ�Ʈ����.getName() + "������ �����Ǿ����ϴ�.");
			} catch (IOException e) {
				// ���� ���� ����⿡ �����ߴٸ�
				System.out.println("���� ������ �����߽��ϴ�.");
				e.printStackTrace();
			}
		}
	}

	public void method2() {
		// ����ȭ�� ��θ� �����ϴ� ��� c:/Users.user1
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		System.out.println(����ȭ����);

		String ������� = "c:/Users/user1/Desktop/������";
		File ��������� = new File(�������);
		// �Ǵ�
		File ���� = new File("c:/Users/user1/Desktop/������");
		File ���� = new File("c:/Users/user1/Desktop/������/���ϻ���.txt");

		if (����.exists()) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			����.mkdir();
			System.out.println(����.getName() + "�� �����Ͽ����ϴ�.");
			if (����.exists()) {
				System.out.println("������ �̹� �����մϴ�.");
			} else {
				try {
					����.createNewFile();
					System.out.println(����.getName() + " ������ �����߽��ϴ�.");
				} catch (IOException e) {
					System.out.println(����.getName() + " ������ �����߽��ϴ�.");
					e.printStackTrace();
				}
			}
		}
	}

	public void method3() {
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";

		// ��� ���� ����
		File ������ = new File(����ȭ���� + "/��1/��2/��3");
		������.mkdirs();

		// ���� ����
		File ���� = new File(������ + "/���ο�����.txt");
		try {
			boolean ���ϻ���Ȯ�� = ����.createNewFile();
			System.out.println("������ ���� �Ǿ����ϱ�? : " + ���ϻ���Ȯ��);

			// ���� ũ�� Ȯ��
			System.out.println(����.length());

			// ���� ������ ���� ��¥ Ȯ��
			System.out.println(����.lastModified());

			// ���� ����
			����.delete();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void method4() {
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		
		// ���� �̸� �����ϱ�
		File �ؽ�Ʈ���� = new File(����ȭ���� + "/newFFF/���ϻ����̸��ٲٱ�.txt");
		try {
			�ؽ�Ʈ����.createNewFile();
			System.out.println("������ �����Ǿ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void method5() {
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		File �ؽ�Ʈ���� = new File(����ȭ���� + "/newFFF/���ϻ����̸��ٲٱ�.txt");
		File ���ο��̸� = new File(����ȭ���� + "/newFFF/������̸�.txt");
		
		// ���� �̸� �����ϱ�
		// ���� ������ ������ ���, ���� �̸� ����
		// �������� �ʴ´ٸ�, �������� �ʴ´�.
		if(�ؽ�Ʈ����.exists()) {
			if(�ؽ�Ʈ����.renameTo(���ο��̸�)) { // ���� ���� �̸��� ���������� �����ߴٸ�
				System.out.println("���� �̸��� ���������� ����Ǿ����ϴ�.");
			} else {
				System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.");
			}
		} else {
			System.out.println("���� �̸��� �������� �ʽ��ϴ�. ����, ������ �ּ���.");
		}
	}
	
	public static void main(String[] args) {
		// main + Ctrl + Space
		FilePre ���� = new FilePre();
		// ����.method1();
		// ����.method2();
		// ����.method3();
		// ����.method4();
		����.method5();
	}

}