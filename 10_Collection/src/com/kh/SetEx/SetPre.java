package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	
// �޼���
	// ���� 
	public static void main(String[] args) {
		// main + Ctrl + Space
		
		HashSet<String> set = new HashSet<>();
		
		// .add(); �� �� �߰� // �ɰԶ� 3�� �߰� // �ߺ� ���� �ڵ����� ����� �ȴ�.
		set.add("�����");
		set.add("����");
		set.add("�ɰԶ�");
		set.add("�ɰԶ�");
		set.add("�ɰԶ�");
		set.add("������");
		set.add("��¡���");
		set.add("�˻���Ĩ");
		
		System.out.println(set); 
		
		// .size() �� ũ�� Ȯ�� // Ȯ���� ����� �ؾ� �����ϴ�.
		System.out.println(set.size());
		
		// .contains() �� �������� �����ϴ��� Ȯ�� // Ȯ���� ����� �ؾ� �����ϴ�.
		System.out.println(set.contains("������")); // ���� true �Ǵ� false �� ���´�.
		
		// .remove(); �� ���� ����
		set.remove("����");
		System.out.println(set);
		
		// .isEmpty() �� �����Ͱ� ��� ���� �Ǿ����� Ȯ�� // Ȯ���� ����� �ؾ� �����ϴ�.
		System.out.println(set.isEmpty()); // ���� true �Ǵ� false �� ���´�.
		
	}
	
}
