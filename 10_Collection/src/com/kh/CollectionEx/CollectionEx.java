package com.kh.CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 Collections �������̽� : ���ϵ��� ������� �ִ� ���� 
 					  List, Set �� �θ� class
 					  ���������� ȸ���ϸ鼭 �ڵ带 ��ȸ�ϰų�, �ڵ� �ȿ� �ۼ��� ������ ��ȸ�ϰ�,
 					  �߰�, ����, �˻� ���� �⺻ �۾��� �����Ѵ�.
 					 
 .sort() : ����Ʈ�� �⺻ ���� ������ ���� ������ �� ����Ѵ�.
 		1.  ���� : �������� ���� // ���� ������ ū ���� ������ ����
 		2. ���ڿ� : ������ ���� ������ ���� ����
 		3. ���� ������ ����鼭 ���� ���ؿ� ���� ���� : compareTo() �޼��带 ����Ͽ�, ���� ������ �ۼ��� �� �ִ�.
 		
     min, max : �ּҰ�, �ִ밪
 binarySearch : ���� Ž��(2���� ������ ���ư��ٴ� ��)�� ����Ͽ� ����Ʈ���� ������ ��Ҹ� ã�� �� ����Ѵ�.
 				���� Ž�� : ���ĵ� �迭�̳� ����Ʈ����, Ư���� ���� ��ġ�� ã�� �˰���
 						�迭 �Ǵ� ����Ʈ�� ������ ����, Ž�� ������ �������鼭 ���� ã�Ƴ��� ���̴�.
 						�Ǵ� �̺�(2���� �����ٴ� ��) Ž���̶�� �Ѵ�.
 						
 .addAll() : ���� �߰��ϰ��� �ϴ� ��� ���� �߰��� �� ����Ѵ�.
 */
public class CollectionEx {

	public static void main(String[] args) {
		// ����
		ArrayList<Integer> ���ڵ� = new ArrayList<>();
		���ڵ�.add(3);
		���ڵ�.add(5);
		���ڵ�.add(4);
		���ڵ�.add(1);
		���ڵ�.add(2);
		System.out.println(���ڵ� + "\n");
		
		// �÷����� ����ؼ� ������������ �����ϱ�
		Collections.sort(���ڵ�);
		System.out.println(���ڵ�);
		
		// ArrayList ���� .add() �� �ϳ��� �߰��ϴ� ���� �ƴ϶�, �߰��ϰ� ���� ���� �ѹ��� ���� �߰��ϱ�
		//                                      ( ) �ȿ� Arrays.asList() �� �ۼ����ָ�, �ְ� ������ŭ �߰��� �����ϴ�.
		ArrayList<String> ����� = new ArrayList<>(Arrays.asList("black", "white"));
		System.out.println(�����);
		
	}
	
}
