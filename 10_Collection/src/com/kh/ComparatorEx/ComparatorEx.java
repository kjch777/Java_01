package com.kh.ComparatorEx;

import java.util.ArrayList; // �׻� .util �� �⺻�̴�.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// ��Ű�����̳� ���ϸ� �ѹ��� �ٲٴ� ����Ű F2
/*
 Comparator : ���ϴ� ��ü
 �޼���
 compare(������1, ������2) : �� ��ü�� ������ ���Ͽ�, ���� ������ ������ �� ����Ѵ�.
         ������1�� ������2���� ������ ������ ��ȯ�Ѵ�.
		 ������1�� ������2�� ������ 0 �� ��ȯ�Ѵ�.
		 ������1�� ������2���� ũ�� ����� ��ȯ�Ѵ�.
 reversed() : ������ �Ųٷ� ����� ������ �ű� �� ����Ѵ�.
              �����̶�� ��
 comparing(Ŭ������ :: ������ �޼����) : Ŭ���� �ȿ��� ������ �޼��带 �ҷ���, ���� ������ ������ִ� ����
 */
public class ComparatorEx {
	public static void main(String[] args) {
		List<String> �ܾ�� = new ArrayList<>(Arrays.asList("���", "��纣��", "������"));
		
		// �ܾ�� ����Ʈ �ȿ� �ִ� �ܾ��� ���̸� �������� �����ϱ�
		// Ŭ������ :: ������ �޼����
		// String Ŭ���� ���� �޼��� ��, ���̸� ��Ÿ���� length �޼��带 ����ؼ� ���ϰڴٴ� �ڵ�
		Comparator<String> ���̺� = Comparator.comparing(String :: length);
		
		// .sort() �� ����Ͽ� ����
		�ܾ��.sort(���̺�);
		
		// ���ĵ� ����Ʈ ���
		System.out.println("���ڿ� ���̸� �������� ���ĵ� ����Ʈ : " + �ܾ��);
	}
}
