package com.kh.arrays;

import java.util.Arrays;

/*
 Arrays��?
 	�迭�� ���õ� �پ��� �۾��� ���� ó���� �� �ֵ��� �����ִ� ����� �����̴�.
 	����, ����, �� ���� �� �� �ִ�.
 
 		method
 			  .sort(); : �迭�� �������ش�.
 			.copyOf(); : �迭�� �����ؼ� �Ȱ��� �迭�� ������ش�.
 			.equals(); : �� �迭�� �Ȱ����� �����ش�.
 			  .fill(); : �迭�� ��� ������ ������ ä���ش�.
 		  .toString(); : �迭�� ���ڿ��� �����ؼ� �����ش�. 
 		                 ����� ������ �� �ִ� ��� ���� ����Ϸ��� �̰� �� ����ϴ� �� ����.
 		    .asList(); : �迭�� ����Ʈ�� ��ȯ�Ͽ� �߰��ϴ� ������, �迭�� �������� �ʰ� �迭�� ������ ���μ� �����ش�.
 		    			 
 		    			 ���� ���
			 		     String[] �迭 = {"���", "�ٳ���"}; �� List �迭�� �߰��� ��,
			 		     
			 		     ArrayList<String> ����Ʈ = Arrays.asList(�迭);
			 		     ArrayList<String> ����Ʈ = Arrays.asList("���", "�ٳ���");
 */
public class ArraysEx {
	
	// main method
	public static void main(String[] args) {
	
		// ���� �迭 ����
		//	   index 0  1  2  3  4		length ���� 5
		int[] num = {5, 8, 2, 4, 3};
		
		// ����
		Arrays.sort(num);
		
		// ���ĵƴ��� ����غ���
		System.out.println(num); // �迭�� ��ġ�� �ּҰ��� ���
		System.out.println(Arrays.toString(num)); // �迭�� ������������ ������ ����, ���ڿ��� �����ؼ� ���
		
		// �迭 ����
		// �迭�� ������ ����, �迭�� �� �������� ���� ���� ���־�� �Ѵ�.
		// int �迭�̸� int �迭�� ���� ���־�� �Ѵ�.
		int[] abc = Arrays.copyOf(num, 			num.length);
		//              ���� �ٿ��ֱ� ���� �� ����		���� �� ����
		
		// num ������ abc ������ �� ���� �ƴ��� Ȯ��
		System.out.println("num �� ���� �� abc : " + Arrays.toString(abc));
		
		// �� �迭�� �Ȱ��� ������� Ȯ���غ���
		boolean same = Arrays.equals(num, abc); // �Ұ�ȣ ( ) ���� ������ ��� ����.
		System.out.println("num �� abc �� �Ȱ�����? : " + same);
		
		// 0 ~ 4 �� �ڸ����� ��� �Ȱ��� ������ �����ϰ� ����غ���
		int[] sameNumbers = new int[5];
		Arrays.fill(sameNumbers, 3);
		System.out.println("���� 3 ���� ��� ä��� : " + Arrays.toString(sameNumbers));
		
	}
	
}
