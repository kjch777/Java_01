package com.kh.javaAPIEx;

import java.util.StringTokenizer;

/*
 StringTokenizer
 Token(����) == �ּ� ���� �Ǵ� ������ ���� ������, ������ ��ü 
 */
public class StringTokenizerEx {
	
	public static void main(String[] args) {
		
		//                         �Ұ�ȣ ( ) �ȿ� " " �� ����ؼ� ���� �־���� �Ѵ�.
		//                   ���� �����ڸ� ���� ������, �⺻������ ���� �������� �����Ѵ�.
		StringTokenizer ��ū = new StringTokenizer("�ڹ� �� �� �ſ�");
		
		// hasMoreTokens ��, ���� ��ū ���� �ȿ� ���ڰ� ���� ����ִٸ� true
		while(��ū.hasMoreTokens()) {
			
			// nextToken : ���� ��ū�� ���°�, ���� ��ū�� ������ �غ� �ض�.
			System.out.println(��ū.nextToken());
		}
		
		// �����ڸ� , �� ���� ��ũ������ ����
		//                                           ���������������    , �ٿ��� ��� �ϰڴٴ� �ڵ�
		StringTokenizer ��ū2�� = new StringTokenizer("���,������,����", ", ");
		
		while(��ū2��.hasMoreTokens()) {
			System.out.println(��ū2��.nextToken());
		}
		
	}

}
