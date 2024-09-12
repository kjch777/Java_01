package com.kh.variable.ex;

/*
 enum(������) : �������� ������ ���� ����̴�.
 		��� : ��� ������ ��

 �޼���
 	             .values(); : enum �� �ۼ��� ��� ����� �迭�� ��ȯ�� �� ����Ѵ�.
 	  .valueOf(String �̸�); : �̸��� ��ġ�ϴ� enum ����� ��ȯ�� �� ����Ѵ�.
 	            .ordinal(); : enum ����� ������ ������ �� ����Ѵ�.
 	               .name(); : enum ����� �̸��� ��ȯ�� �� ����Ѵ�.
 	.compareTo(EnumType e); : �ٸ� enum ����� ������ ���� �� ����Ѵ�.
 	           .toString(); : enum ����� ���ڿ� ǥ������ ��ȯ�� �� ����Ѵ�.
 	           .getClass(); : enum Ŭ������ Class ��ü�� ��ȯ�� �� ����Ѵ�.
 */



public class ������Ex {
	
	public enum ��¥�� {
		������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���, MONDAY; // ���� ����� ���� �빮�ڷ� �ۼ��Ѵ�.
	}
	
	//         index   0    1   2    3
	public enum ������ { ��, ����, ����, �ܿ� };
	
	public static void main(String[] args) {
		System.out.println("������ : " + ��¥��.������);
		System.out.println("ȭ���� : " + ��¥��.ȭ����);
		System.out.println("������ : " + ��¥��.������);
		
		������[] ���� = ������.values();
		System.out.println("�����鿡 ���ǵ� ��� ���");
		for(������ s : ����) {
			System.out.println(s);
		}
		// .valueOf(String �̸�) : �̸��� ��ġ�ϴ� enum ����� ��ȯ�� �� ����Ѵ�.
		������ �� = ������.valueOf("��");
		System.out.println("�� �� ��ġ�ϴ� ��� : " + ��);
		// ���� ó���� ���� Exception �ۼ�
		
		// .ordinal(); : enum ����� ������ ������ �� ����Ѵ�.
		System.out.println("�� ����� ���� : " + ��.ordinal());
		
		// .name(); : enum ����� �̸��� ��ȯ�� �� ����Ѵ�.
		System.out.println("�� ����� �̸� : " + ��.name());
		
		// .toString(); : valueOf ó�� ��� ����
		System.out.println(��.toString());
		
		// .getClass(); : enum Ŭ������ Class ��ü�� ��ȯ�� �� ����Ѵ�.
		System.out.println("Ŭ������ ��ü�� : " + ����.getClass());
		
		// class [Lcom.kh.variable.ex.EnumEx$������; : ������ �迭�� ��Ÿ���� ��
	}
	
}
