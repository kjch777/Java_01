package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {

// �޼���
	// �⺻ ������
	public MapPre() {
		// Ctrl + Space
	}
	
	// ��� void
	public void practice1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "���׸���");
		map.put(3, "��Ƽ���� �ٺ�ť");
		map.put(2, "�����̽� ������");
		System.out.println(map);
	}
	
	public void practice2() {
		//                                   <�� �ȿ��� �ڷ����� �� �־��൵ ��� ����.>
		Map<String, String> map = new HashMap<String, String>();
		
		// .put() ����ϱ�
		map.put("�п�", "����� ������");
		map.put("���", "����� ���Ǳ�");
		map.put("�Ե� Ÿ��", "����� ���ı�"); // ���� ����
		
		// ��ü ���
		System.out.println("��ü ��� : " + map);
		
		// .get() ����ؼ� ����ϱ�
		System.out.println("�Ե� Ÿ�� �������� " + map.get("�Ե� Ÿ��") + " �Դϴ�.");
		
		// .remove() ����ؼ� ��� �����ϱ�
		map.remove("���");
		
		// for - each �� .keySet() �� ����Ͽ� ��ü ��� ����ϱ�
		
		// (�ڷ��� ���ο���� : ������.keySet()) 
		for(String ����Ű   : map.keySet()) {
			String �ӽ� = map.get(����Ű);
			System.out.println(�ӽ� + " �� ��ġ�� ���� key �� " + ����Ű + " �Դϴ�.");
		}
	}
	
	public void practice3() {
		// Ư�� ���� �����ϴ��� Ȯ���غ���
		
		// <���ϸ�,   ����>
		Map<String, Integer> map = new HashMap<>();
		map.put("���", 100);
		map.put("�ٳ���", 200);
		map.put("ü��", 300);
		
		// 200��¥�� ������ �����ϴ��� Ȯ���غ���
		System.out.println("200��¥�� ������ �־�? : " + map.containsValue(200));
		// containsKey �� containsValue ��� boolean ó�� true false �� ���� ��µȴ�.
		
		// ü���� �����ϴ��� Ȯ���غ���
		System.out.println("ü���� �־�? : " + map.containsKey("ü��"));
		// containsKey �� containsValue ��� boolean ó�� true false �� ���� ��µȴ�.
		
		// ũ�� ��ȸ�غ���
		System.out.println("���� map �� ũ�� : " + map.size());
	}
	
	public void practice4() {
		Map<Integer, String> map = new HashMap<>();
		
		// .put() ����غ���
		map.put(2, "���׸���");
		map.put(1, "��Ƽ���� �ٺ�ť");
		map.put(4, "������ũ �� ġ��");
		map.put(3, "�����̽� ������");
		System.out.println(map); // �ڵ� ���� �ȴ�.
		
		// .get() ����غ���
		System.out.println("3�� �޴��� " + map.get(3) + " �Դϴ�.");
		
		// .size() ����غ���
		System.out.println("��ü ũ��� " + map.size() + " �Դϴ�.");
		
		// .remove() ����غ���
		map.remove(4);
		System.out.println(map); // �ڵ� ���� �ȴ�.
		
		// .isEmpty() ����غ���
		System.out.println("map�� ������ϱ�? : " + map.isEmpty());
		
		// for - each �� �� .keySet() ����غ���
		for(int Ű : map.keySet()) {
			String ��ġ = map.get(Ű);
			System.out.println(Ű + "�� �޴��� " + ��ġ + " �Դϴ�.");
		}
		
		// Ű - ���� �ѹ��� �������� ���
		//  Map.Entry<key,     value>    : �����ú�����.entrySet()
		for(Map.Entry<Integer, String> t : map.entrySet()) {
			System.out.println(t.getKey() + " - " + t.getValue());
		}
		
		// .clear() ����غ���
		map.clear();
		
		
	}
	
	// ���� ����
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		// mp.practice1();
		// mp.practice2();
		// mp.practice3();
		mp.practice4();
	}
	
}
