package com.kh.arrayList.pre;

public class BookArray {

	// main method - ���� ��� �� ����
	public static void main(String[] args) {

		// ��ü
		Book[] å�� = new Book[3];
		å��[0] = new Book("�Ƹ��", "�տ���");
		å��[1] = new Book("�Һ��� ��Ģ", "��� �Ͽ�ö");
		å��[2] = new Book("���� �а� ���� ������", "�տ���");

		System.out.println(å��); // ��ǻ�Ϳ��� å�� �迭�� ����Ǿ� �ִ� �ּ�

		// for - each ��
		// for ���� ���, ���� å�� �߿��� 1�Ǹ� ������ ���� ������,
		// �� �� �ڷ����� �迭 [] �� �ٿ����� �ʴ´�.
		for (Book å : å��) {
			System.out.println(å); // å�鿡�� �� �Ǿ� å ���� �ּҰ� ��µȴ�.
			System.out.println(å.getBookName());
			System.out.println(å.getAuthor());
		}
		System.out.println("===============");

		for (int i = 0; i < å��.length; i++) {
			å��[i].showBook();
		}

	}
}
