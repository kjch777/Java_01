package com.kh.op;

public class OperatorEx6 {
	/*
	 ���� ������
	 +=
	 ���� ������ �����ϰ�, ����� ������ ������ �־��ִ� ������ �Ѵ�.
	 
	 -=
	 ���� ������ �����ϰ�, ����� ������ ������ �־��ִ� ������ �Ѵ�.
	 
	 �̿ܿ��� *=	/=	%=	**==  //== ����� �ִ�.
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// += �����ڸ� Ȱ���� ����
		System.out.println("===== [+=] =====");
		System.out.println("num1 : " + num1 + " , num2 : " + num2);
		
		num1 += 3; // num1 = num1 + 3;
		System.out.println("num1 += 3 �� ���� num1 �� �� : " + num1);
		
		num2 += num1; // num2 = num2 + num1;
		System.out.println("num1 : " + num1 + " �� num1 + num2 �� ���� num2 �� �� : " + num2);
		
		System.out.println("===== [-=] =====");
		
		int num3 = 10;
		int num4 = 5;
		
		num3 -= 2; // num3 = num3 -2;
		num4 -= num3; // num4 = num4 - num3;
		System.out.println("num3 �� �� : " + num3);
		System.out.println("num4 �� �� : " + num4);
	}

}
