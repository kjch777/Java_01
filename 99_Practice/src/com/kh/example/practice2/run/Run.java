package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run { // Product�� �����ͼ� �����ϴ� class

	public static void main(String[] args) { // main �޼���
		
		Product product1 = new Product(); // Product ��ü ����
		
		// ���� ����
		product1.setpName("������ 17"); // setpName �� �޼���� ������,
		product1.setPrice(990000);	  // = �� �ƴ϶� ( ) �� ����Ѵ�. 
		product1.setBrand("����");
		
		product1.information();
		
		// �����ϴ°� set
		System.out.println("\n===== get���� �ҷ��ͺ��� ====="); // �ҷ����°� get
		System.out.println("��ǰ �̸� : " + product1.getpName());
		System.out.println("��ǰ ���� : " + product1.getPrice());
		System.out.println("���� ȸ�� : " + product1.getBrand());

	}

}
