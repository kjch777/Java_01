package com.kh.StackEx;

import java.util.*;

public class StackPre {
	public static void main(String[] args) {
		Stack<Integer> ���� = new Stack<>();
		����.push(10);
		����.push(30);
		����.push(40);
		����.push(50);
		����.push(20);
		System.out.println("������ ���� �� ��� : " + ����);
		
		System.out.println("���� �� : " + ����.pop());

		System.out.println("�� �� �� : " + ����.peek());
		
		System.out.println("����ִ��� Ȯ�� : " + ����.isEmpty());
		
		System.out.println("������ ���� ũ�� : " + ����.size());
	}
}
