package com.kh.SetEx;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {

	public static void main(String[] args) {
		
		// String[] ���Ϲٱ��� = new String[] {"Ű��", "������", "����", "����"};
		
		// String Ű�� ������ ���� ���� ���� // �����Ѱ� �Ұ�ȣ ( ) �ȿ� ������ �Ǵ� �� ����.
		TreeSet<String> ���ϵ� = new TreeSet<>(Set.of("Ű��", "������", "����", "����"));
		
		// ���ϵ�.addAll(Arrays.asList(���Ϲٱ���));
		���ϵ�.add("����");
		System.out.println("���ϵ� ��ü ��� : " + ���ϵ�);
		
		// ������ ����
		���ϵ�.remove("������"); // index ���� ���� ������, ��ġ ��ǥ(����)�� ���� ������ �Ұ����ϴ�.
		System.out.println("���ϵ� ��ü ��� : " + ���ϵ�);
		
		// ������ ���ԵǾ� �ִ��� Ȯ���ϱ� // Ȯ���Ϸ��� ����غ��� �ȴ�.
		System.out.println("���� �־�? : " + ���ϵ�.contains("����"));
		
		// ���ϵ��� ����ִ��� Ȯ���ϱ� // Ȯ���Ϸ��� ����غ��� �ȴ�.
		System.out.println("��� �־�? : " + ���ϵ�.isEmpty());
		
		// ���ϵ� ���� Ȯ���ϱ� // Ȯ���Ϸ��� ����غ��� �ȴ�.
		System.out.println("� �־�? : " + ���ϵ�.size());
		
		// ���� ���� �� Ȯ���ϱ� // Ȯ���Ϸ��� ����غ��� �ȴ�.
		System.out.println("���� ���� �� : " + ���ϵ�.first());
		// ���� ���� �� == ��½� ���� �տ� �ִ� ��
		
		// ���� ū �� Ȯ���ϱ� // Ȯ���Ϸ��� ����غ��� �ȴ�.
		System.out.println("���� ū �� : " + ���ϵ�.last());
		// ���� ū �� == ��½� ���� �ڿ� �ִ� ��
		
		// ��� �� �����ϱ�
		���ϵ�.clear();
		
		// ��� ���� ���ŵƴ��� Ȯ���ϱ� // Ȯ���Ϸ��� ����غ��� �ȴ�.
		System.out.println("��� �־�? : " + ���ϵ�.isEmpty());
	}
}
