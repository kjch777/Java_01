package com.kh.arrayList;

import java.util.ArrayList;

/*
ArrayList��?
 	����Ʈ�� �迭�� ���������, ���̰� ���ѵǾ� ���� �ʴٴ� ���� �ٸ���.
 	���� ������ ����, ���ϴ� ��ŭ ���� �� �ִ�.
 	
ArrayList�� �̹� �ִ� ����� �̸��̱� ������, �̸��� ���� �� ���� ����ؼ� �� �ȴ�.

ArrayList<�ڷ���> ������ = new ArrayList<�ڷ���>();
				
				����� �� ǥ��� // �� �� ���ڸ� �빮�ڷ� �ٲ㼭 ����Ѵ�.
							int    �� Integer
							String �� String 
							double �� Double
							char   �� Character
				
				.add 		: �߰�
				.get 		: ��ȯ
				.set 		: ����
				.remove 	: ����
				.size 		: ����(ũ��) Ȯ��
				.isEmpty 	: ����ִ��� Ȯ��
				.clear 		: ��� ����
				.IgnoreCase : for ������ ��/�ҹ��� ���о��� ���ϰ� ���� �� ����Ѵ�.
				.length		: �ִ� ���̸� �ڵ����� �����ϰ� ���� �� ����Ѵ�.
*/
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		// �ڸ��� ����ֱ� ������
		System.out.println(num.isEmpty()); // true �� ��µȴ�.
		
		// ���� �߰��ϱ�
		// index �� �ڸ���ġ�� ���ϰ�, 0 ���� �����Ѵ�.
		num.add(10); // index 0 ���� 10 �� �ֱ�
		System.out.println("�߰��ƴ��� Ȯ���غ��� : " + num.get(0));
		
		// ���� �ڸ��� ������� �ʱ� ������
		System.out.println(num.isEmpty()); // false �� ��µȴ�.
		
		// ũ�� Ȯ��
		// ArrayList ���� ũ�⸦ Ȯ���� �� size �� �������, length �� ���� �ʴ´�.
		System.out.println(num.size());
		
		// set : ������ �� ����Ѵ�.
		//   ���� ��ġ      ���� �ٲٰ� ���� ��, ��, ���ڰ� �ƴϾ �ȴ�.
		//     key			   value
		num.set(0, 				20);
		System.out.println("���� �� : " + num.get(0));
		
		// remove : ������ �� ����Ѵ�.
		num.remove(0);
		
		// �ٷ� ������ �����߱� ������ �ƹ��͵� ���� ���¿���
		// System.out.println(num.get(0));
		System.out.println(num.isEmpty());
	}
			
}
