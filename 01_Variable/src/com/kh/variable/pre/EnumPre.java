package com.kh.variable.pre;

public class EnumPre {

// �ʵ�
	enum ������ { ������, ��Ȳ��, �����, �ʷϻ�, �Ķ���, ����, ����� };
	enum �Һ��� { �л�, ������, ������ } // ; ��� �Ǳ�� �ϴ� �� ����.
	enum �Ǹ��� { �Ҹž�, ���ž�, �߸ž� }; // ������ ����� �ϴ� �� ����.
	
// �޼���
	// �⺻ ������
		public EnumPre() {
			
		}
		
	// ��� void
	public void method1() {
		// �迭�� ���
		������[] �迭 = ������.values(); // .values(); �� enum ���� �ۼ��� ���� ������ �� �� ����Ѵ�.
		
		// for - each ������ ����ϱ�
		for(������ �� : �迭) {
			System.out.println(��);
		}
	}
	
	public void method2() {
		// �迭�� ���
		�Һ���[] �迭1 = �Һ���.values();
		�Ǹ���[] �迭2 = �Ǹ���.values();
		
		System.out.println("=== �Һ��� ===");
		
		// for - each ���� ����Ͽ� �Һ���, �Ǹ��ڸ� ���� ����ϱ�
		for(�Һ��� c : �迭1) {
			System.out.println(c);
		}
		
		System.out.println("=== �Ǹ��� ===");
		
		for(�Ǹ��� s : �迭2) {
			System.out.println(s);
		}
		
		// �Һ���{�л�} , �Ǹ���{�Ҹž�} 
		�Һ��� c = �Һ���.�л�;
		System.out.println("�л��� ��� : " + c.ordinal());
		
		�Ǹ��� s = �Ǹ���.�Ҹž�;
		System.out.println("�Ҹž��� ��� : " + s.ordinal());
		
		System.out.println("=== ��� �� ��� ===");
		
		// .ordianl(); , if �� ����Ͽ� ���ϱ�
		if(c.ordinal() > s.ordinal()) {
			System.out.println("�Һ����� ����� �� �����ϴ�.");
		} else if(c.ordinal() == s.ordinal()) {
			System.out.println("�Һ��ڿ� �Ǹ����� ����� �����ϴ�.");
		} else {
			System.out.println("�Ǹ����� ����� �� �����ϴ�.");
		}
	}
	
	// ���� ��� �� ����
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		ep.method2();
	}
	
}
