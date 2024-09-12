package com.kh.MapEx;

import java.util.TreeMap;

/*
 TreeMap �����˻�Ʈ�� : ������ �˻�, ����, ����, ������ ������ �������ش�.
 Ű - �� (key - value) �� ���·� �����ϴ� �ڷ� ����
 Ű�� �������� �����Ͽ� �����Ѵ�. (���� ���� : 0 �� 9, A �� Z, a �� z, �� �� ��) 
 
 					  �޼���
 					  
 	   .put(key, value) : TreeMap �� Ű - ��� �߰�
 	          .get(key) : ������ Ű�� �ִ� ��� ���� ����
 	  .containsKey(key) : Ű�� ���ԵǾ� �ִ��� Ȯ��
 	.containsKey(value) : ����� ���ԵǾ� �ִ��� Ȯ��
 	       .remove(key) : ������ Ű�� ���� ����
 	            .size() : (����Ǿ� �ִ�)Ű-�� ���� ���� ��ȯ
 	         .isEmpty() : ����ִ��� Ȯ��
 	           .clear() : ��� ����
 */
public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		// .put() ����Ͽ� �� �߰�
		// tm.put(1, "One");
		
		// ���� �� ���� �߰��ϰ� �ʹٸ�
		Integer[] keys = {1, 2, 3};
		String[] values = {"One", "Two", "Three"};
		
		// �ݺ��� ���
		for(int i = 0; i < keys.length; i++) {
			tm.put(keys[i], values[i]);
		}
		
		// Map ���� Ű �ߺ��� ���� �ʱ� ������, ����� �ٸ� ���, �� �Ʒ��� �ۼ��� ����� �ڵ����� ���������.
		
		System.out.println(tm);
		
		// .get() �޼��带 ����Ͽ� �� ��������
		System.out.println(tm.get(2));
		
		// .remove() �޼��带 ����Ͽ� Ű-��� ����
		tm.remove(3);
		System.out.println(tm);
		
		// .containsKey() �޼��带 ����Ͽ� Ű�� �ִ��� Ȯ���غ���
		System.out.println(tm.containsKey(1));
		
		// .size() �޼��带 ����Ͽ� ���� Ȯ���غ���
		System.out.println(tm.size());
		
		// .isEmpty() �޼��带 ����Ͽ� ����ִ��� Ȯ���ϱ�
		System.out.println(tm.isEmpty());
		
		// .clear() �޼��带 ����Ͽ� ��� �� �����ϱ�
		tm.clear();
		System.out.println(tm);
		
	}
}
