package com.kh.DeQueEx;

import java.util.*;

/*
 Deque(��) : ���� ������ ���԰� ������ ��� �����ϴ�.
 			���� + ť �� ����� ��� �����ϰ�, ��������� �����͸� �߰��ϰų� ������ �� �ִ�.
 	�޼���
 		.addFirst() : �� �տ� ���� �߰��� �� ����Ѵ�. 
 		 .addLast() : �� �ڿ� ���� �߰��� �� ����Ѵ�.
     .removeFirst() : �� ���� ���� ������ �� ����Ѵ�.
      .removeLast() : �� ���� ���� ������ �� ����Ѵ�.
        .getFirst() : �� ���� ���� �������� Ȯ���� �� ����Ѵ�. (���������� �ʴ´�.)
         .getLast() : �� ���� ���� �������� Ȯ���� �� ����Ѵ�. (���������� �ʴ´�.)
 
 Deque �� �������̽��̱� ������, ArrayDeque �� �� ��ü�� ����Ͽ� ������ �����Ѵ�.
 */
public class DeQueEx {
	public static void main(String[] args) {
		// Deque �����ϱ�
		Deque<Integer> �� = new ArrayDeque<>();
		
		// �� �տ� �� �߰��ϱ�
		��.addFirst(1);
		��.addFirst(2);
		��.addFirst(3);
		System.out.println("addFirst �� �� �߰� ��� : " + ��);
		
		// �� �ڿ� �� �߰��ϱ�
		��.addLast(4); // .add() �� .addLast() �� ����ϴ�.
		��.addLast(5);
		��.addLast(6);
		System.out.println("addLast �� �� �߰� ��� : " + ��);
		
		// �� ���� �� �����ϱ�
		��.removeFirst();
		System.out.println("removeFirst �� �� ���� ��� : " + ��);
		
		// �� ���� �� �����ϱ�
		��.removeLast();
		System.out.println("removeLast �� �� ���� ��� : " + ��);
		
		// �� ���� �� Ȯ���ϱ�
		int �Ǿհ� = ��.getFirst();
		System.out.println("�� �� �� : " + �Ǿհ�);
		
		// �� ���� �� Ȯ���ϱ�
		int �ǵް� = ��.getLast();
		System.out.println("�� �� �� : " + �ǵް�);
	}
}
