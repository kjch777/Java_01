package com.kh.ListEx;

import java.util.ArrayList;

public class ArrayListPre {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();

		// .add == �� �߰�
		a.add("���");
		a.add("�ٳ���");
		a.add("������");

		// ���
		System.out.println(a);

		// �� .get(1); �� ����Ͽ� 1�� ����ִ� �� ��ȯ�ϱ�
		String �� = a.get(1);
		System.out.println(��);

		// .set(1, "����"); �� ����Ͽ� �ٳ����� ������ �����ϱ�
		a.set(1, "����"); // ���� �Է��� �� .set
		System.out.println(a.get(1)); // ���� ����� �� .get

		// .size() ����Ͽ� ũ�� ��ȯ�ϱ�
		System.out.println(a.size());

		// .isEmpty() ����Ͽ� ����Ʈ�� ����ִ��� Ȯ���ϱ�
		System.out.println(a.isEmpty());

		// .remove(2); ����Ͽ� ������ �ڸ� �����ϱ�
		a.remove(2);
		System.out.println(a);

		// .remove("���"); ����Ͽ� ��� �����ϱ�
		a.remove("���");
		System.out.println(a);

		// .clear(); ����Ͽ� ��� �����ϱ�
		a.clear();
		System.out.println(a);

		// .isEmpty() ����Ͽ� ����Ʈ�� ����ִ��� Ȯ���ϱ�
		System.out.println(a.isEmpty());

	}

}
