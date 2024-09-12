package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {

// method
	// �⺻ ������
	public ArrayListEx2() {
		
	}
	
	public void method1() {
		
		ArrayList<String> list = new ArrayList<>();
		//									  <> ���� ��ȣ ���� �����ص� �ȴ�.
		
		// .add �� ����Ͽ� ���� �ٳ��� ��� �� �߰�
		list.add("����");
		list.add("�ٳ���");
		list.add("���");
		
		// .get �� ����Ͽ� �� index �ڸ��� �� ���
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		// 					   .get() �Ұ�ȣ �ȿ��� ���ڰ� ��ġ ��ǥ�� �ִ´�.
		System.out.println(list.get(2));
		
		// .set �� ����Ͽ� �ٳ����� Ű���� ����
		list.set(	  1, 	   			      "Ű��");
		//	 set(���ڰ� ��ġ ��ǥ,	���� �ٲٰ� ���� ��, ��, ���ڰ� �ƴϾ �ȴ�.);
		
		// .size �� ����Ͽ� ũ�� Ȯ��, ��, ��¹��� ����Ѵ�.
		System.out.println("�ٱ��� ũ�� : " + list.size());
		// 			   ũ�⸦ Ȯ���Ϸ��� ���̱� ������, .size() �Ұ�ȣ �ȿ��� �ƹ��͵� ���� �ʴ´�.
		
		// .remove �� ����Ͽ� Ű�� ����
		list.remove(1);
		//  .remove() �Ұ�ȣ �ȿ��� ����� ���� �� �Ǵ� ���ڷ� �� ��ġ ��ǥ�� �ִ´�.
		
		// .isEmpty() �� ����Ͽ� ����ִ��� Ȯ��, ��, ��¹��� ����Ѵ�.
		System.out.println("�ٱ��� �����? : " + list.isEmpty());
  // ����ִ��� Ȯ���Ϸ��� ���̱� ������, .isEmpty() �Ұ�ȣ �ȿ��� �ƹ��͵� ���� �ʴ´�.
		
		// ������ ����� for ��
		//   �ڷ��� ���� ���� ������ : �ݺ� �� ������
		for(String 	fruit      :   list) {
			System.out.println(fruit);
		}
		
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		
		// .add �� ���� ȣ���� ����� ������ �߰�
		animal.add("����");
		animal.add("ȣ����"); // .add(�߰��ϰ� ���� ���� �Է�, ���ڰ� �ƴϾ �ȴ�.)
		animal.add("�����"); // Ctrl + alt + �� : ���� �����ؼ� �ؿ� �ٿ��ִ� ����Ű
		animal.add("������");
		
		// .size() �� ������ �� ���� �ִ��� Ȯ��
		System.out.println("���� �� ������? : " + animal.size() + " ������.");
		//											.size(�Է�X)
		
		// .get ���� ���� Ȯ��
		System.out.println("animal.get(0)���� " + animal.get(0) + " �� �־�.");
		System.out.println("animal.get(1)���� " + animal.get(1) + " �� �־�.");
		System.out.println("animal.get(2)���� " + animal.get(2) + " �� �־�.");
		System.out.println("animal.get(3)���� " + animal.get(3) + " �� �־�.");
		//											   .get(���ڰ� ��ġ ��ǥ)
		
		// .set ���� ����� �� �䳢�� ����
		animal.set(2, "�䳢");
		
		// .remove �� ������ ����
		animal.remove(3);
		//    .remove(���� ��ġ ��ǥ�� �ƴ� �� ��ü�� �ᵵ �ȴ�.)
		
		// for ������ �ٲ� �������� get �� ���
		for(String zoo : animal) {
			System.out.println(zoo);
		}
		
		// .clear �� ��� ����
		animal.clear(); // ��� �����ϱ� �Ұ�ȣ ( ) ���� ��� �д�.
		
		// .isEmpty() �� ��� ���� �ƴ��� Ȯ��
		System.out.println("���� �ƾ�? : " + animal.isEmpty());
		
	}
	
	public void method3() {
		ArrayList<String> pizza = new ArrayList<>(); // ArrayList ����
		
		System.out.println("===== ���� �޴� =====");
		
		// .add �� �߰�
		pizza.add("��������");
		pizza.add("��������");
		pizza.add("���۷δ�");
		
		// �Ѳ����� ����ϱ�
		System.out.println("��� �޴� ���� : " + pizza);
		
		// .get ���� ���
		System.out.println("1�� ���� : " + pizza.get(0));
		System.out.println("2�� ���� : " + pizza.get(1));
		System.out.println("3�� ���� : " + pizza.get(2));
		
		// .set ���� ���۷δ� �� ���ξ��� ����
		pizza.set(2, "���ξ���");
		System.out.println("3�� ���ڴ� " + pizza.get(2) + " ���ڷ� ���� �Ǿ����ϴ�!");
		
		// .remove �� ���ξ��� ����
		pizza.remove(2);
		// �Ǵ� pizza.remove("���ξ���");
		
		// for ������ ���
		for(String closed : pizza) {
			System.out.println(closed);
		}
		
		System.out.println("���߾��...");
		
		// .clear �� �޴� ��� ����
		pizza.clear();
		
		System.out.println("���� ���߳���?.. : " + pizza.isEmpty());			
		
	}
	
	// main : ���� ��� �� ������ �ڵ带 �ۼ��ϴ� ����
	public static void main(String[] args) {
		
		ArrayListEx2 al = new ArrayListEx2();
		// al.method1();
		// al.method2();
		al.method3();
		
	}

}
