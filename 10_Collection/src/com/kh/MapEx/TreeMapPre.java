package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {

	public static void main(String[] args) {
		TreeMap<String, String> ���ϵ� = new TreeMap<>();
		
		
		String[] Ű�� = {"apple", "banana", "orange", "grape", "watermelon"};
		String[] ����� = {"���", "�ٳ���", "������", "����", "����"};
		
		for(int i = 0; i < Ű��.length; i++) {
			���ϵ�.put(Ű��[i], �����[i]);
		}
		
		// ��ü ���
		System.out.println("���ϵ� Ű=��� ��ü ��� : " + ���ϵ�);
		
		// .get() �޼��� ���
		System.out.println("banana �� " + ���ϵ�.get("banana"));
		
		// .size() �޼��� ���
		System.out.println("���ϵ��� � �ֽ��ϱ�? : " + ���ϵ�.size() + " �� �ֽ��ϴ�.");
		
		// .isEmpty() �޼��� ���
		System.out.println("���ϵ��� �Ѱ��� �����ϱ�? : " + ���ϵ�.isEmpty());
		
		// .containsKey() �޼��� ���
		System.out.println("grape Ű�� �����մϱ�? : " + ���ϵ�.containsKey("grape"));
		
		// .containsValue() �޼��� ���
		System.out.println("���� ����� �����մϱ�? : " + ���ϵ�.containsValue("����"));
		
		// .keySet() �޼��� ���
		System.out.println("���ϵ� Ű ��ü ��� : " + ���ϵ�.keySet());
		
		// .values() �޼��� ���
		System.out.println("���ϵ� ��� ��ü ��� : " + ���ϵ�.values());
		
		// .firstKey() �޼��� ���
		System.out.println("���ϵ��� ù��° Ű ��� : " + ���ϵ�.firstKey());
		
		// .lastKey() �޼��� ���
		System.out.println("���ϵ��� ������ Ű ��� : " + ���ϵ�.lastKey());
		
		// .clear() �޼��� ���
		���ϵ�.clear();
		System.out.println("���ϵ��� �Ѱ��� �����ϱ�? : " + ���ϵ�.isEmpty());
		
	}

}
