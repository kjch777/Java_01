package com.kh.FileEx;

import java.io.*;

/*
 StringBuilder : �ӵ��� ������. 
 */
public class BuilderWriterEx {
	public static void main(String[] args) {
		// ���� ����
		String �����̸� = "����.txt";
		
		// StringBuilder �� ����Ͽ�, ���Ͽ� �� ���� �ۼ�
		StringBuilder ��Ʈ������ = new StringBuilder();
		
		//     .append : �߰��ϴ� ��� ���̴�.
		��Ʈ������.append("ù��° �����Դϴ�. \n");
		��Ʈ������.append("�ι�° �����Դϴ�. \n");
		��Ʈ������.append("����° �����Դϴ�. \n");
		
		// FileWriter ��ü�� �����Ͽ�, ���Ͽ� ���� ���� ����
		// BufferedWriter �� ����Ͽ�, �� ���� ������ �� �ֵ��� �ϱ�
		try {
			BufferedWriter ���۵������ = new BufferedWriter(new FileWriter(�����̸�));
			
			/*
			 System.nanoTime(); : 1ms == 1/1000��
			                      1us == 1/1000ms
			                      1ns == 1/1000us (1/10����)
			                        
			 */ 
			long ���۽ð� = System.nanoTime();
			
			// ���� ���� �ۼ�
			���۵������.write(��Ʈ������.toString());
			
			long ����ð� = System.nanoTime();
			System.out.println("�� �ҿ� �ð� : " + (����ð� - ���۽ð�) + " ns");
			
			// ���� �ݱ�
			���۵������.close();
			System.out.println("���Ͽ� ������ ���������� �ۼ��Ͽ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
