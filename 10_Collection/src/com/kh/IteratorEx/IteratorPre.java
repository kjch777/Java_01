package com.kh.IteratorEx;
/*
 import �� ��, ������ ���� ��ġ���� ���� ������ ������ ����,
 * �� ����Ͽ� ��� ������ �� �ִ�.
 * == ��ü���� 
 */
import java.util.*; // .util 
//     java ���� �ȿ� �ִ� util ���� �ȿ� 
//     �����ϴ� ��� ������ �������ڴٴ� �ڵ�

public class IteratorPre {

	public static void main(String[] args) {
		// ���� ��� �� ������ ���� �޼���
		
	// ArrayList<�ڷ���Ǯ����> ������ = new ArrayList<>(Arrays.asList(�߰��� ���� , �� �����ؼ� �ֱ�))
		ArrayList<Integer> ���ڵ� = new ArrayList<>(Arrays.asList(100, 10, 20, 30, 50));
		���ڵ�.add(70); // �Ǵ� ������.add(�߰��� ��);
		
		// Iterator ����
   // Iterator<�ڷ���Ǯ����> ������ = ������.iterator();
		Iterator<Integer> �ݺ� = ���ڵ�.iterator();
		
		//   ������.hasNext() �� ���� ���� �ִ��� ���� Ȯ�� // ���� true false �� ���´�.
		while(�ݺ�.hasNext()) {
			
	   // �ڷ��� ������ = ������.next() �� ���� �� ��������
			int ���� = �ݺ�.next();
			System.out.println(����); // ���
		}

	}

}
