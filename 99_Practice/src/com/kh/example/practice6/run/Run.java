package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// ��ü
		Book bk0 = new Book();
		bk0.title = "�巡�� ����";
		bk0.publisher = "Ȳ�� ����";
		bk0.author = "�̿���";
		bk0.price = 8_000;
		bk0.discountRate = 1.5;
		bk0.inform();
		
		Book bk1 = new Book("�ظ����Ϳ� �������� ��", "���� ��ø", "J.K. �Ѹ�");
		bk1.inform();
		
		Book bk2 = new Book("������ ���� : ���� ������", "���� ����", "J.R.R. ��Ų", 15_000, 0.7);
		bk2.inform();

	}

}
