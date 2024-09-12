package com.kh.imageEx;

import java.io.*;

/*
 �̹����� �����ϱ� ���ؼ���, 
 ���� �̹��� ������ ��ο�, �ű�� ���� �̹��� ������ ��θ� ���� ���־�� �Ѵ�.
 
 File : ������ �а�, ����, ��������, ����� �� ���̴� ��ü
 
  FileInputStream : ������ �����͸� �о�� �� ����Ѵ�.
 		  .read() : �����͸� �о��
 
 FileOutputStream : ������ �����͸� ������ �� ����Ѵ�.
 		 .write() : �����͸� ��� 
 */
public class ImageCopy {
	public static void main(String[] args) {
		// �����̸� �����Ϸ���,
		// �������� ������ ��ġ�ϰ� �ִ� ��Ҹ� �ۼ� ���־�� �Ѵ�.
		// �ڹ� �ڵ忡�� ���� ������ �ۼ��� ����, / �� ����.
		// ��� ������ ������ src �κ��� �����Ѵ�.
		//               ���� ��θ� ��� �ۼ�������, / �� �ۼ��ϰ�, ���ϸ�.Ȯ���� �� �ۼ����ش�.
		String �����̹��� = "src/com/kh/imageEx/healing.jpg";
		String �����̹��� = "src/com/kh/imageEx/healing_cute.jpg"; // �̸��� ��ġ�� �ȵǹǷ� �̸� ����
		
		// FileInputStream OutputStream �� ����Ͽ� �а� ����
		try {
			FileInputStream �����б� = new FileInputStream(�����̹���);
			FileOutputStream ���Ͼ��� = new FileOutputStream(�����̹���);
			
			// ���۸� ����, �����͸� �а� ���� ���� �迭 �����ϱ�
			byte[] buffer = new byte[1024];
			int ����;
			
			// �迭�� ���� ���۸� ����, ���� ���Ϸκ��� �����͸� �о�ͼ� ������ ���Ͽ� ����ϱ�
			// while ���� ����Ͽ�, �̹��� 0 ���� ������ ������ ����
			while((���� = �����б�.read(buffer)) > 0) {
				���Ͼ���.write(buffer, 0, ����);
			}
			// ���� �а� ��ٸ�, �����ϱ�
			�����б�.close();
			���Ͼ���.close();
			
			System.out.println("�̹��� ���簡 �Ϸ� �Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("�̹��� ���� �� ������ �߻� �߽��ϴ�.");
			e.printStackTrace();
		}
	}
}
