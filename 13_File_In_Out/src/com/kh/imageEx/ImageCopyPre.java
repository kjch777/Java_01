package com.kh.imageEx;

import java.io.*;

public class ImageCopyPre {
	public static void main(String[] args) {

		String �����̹��� = "src/com/kh/imageEx/hogam.jpg";
		String �����̹��� = "src/com/kh/imageEx/hogam_cute.jpg";

		try {
			FileInputStream �����б� = new FileInputStream(�����̹���);
			FileOutputStream ���Ͼ��� = new FileOutputStream(�����̹���);

			// ���۸� ���� �����͸� �а�, ���� ���� �迭 �����
			byte[] buffer = new byte[1024];
			int ���ϱ���;
			
			// ���۸� ���� ���� �̹��� �����͸� �����ͼ�, ������ ���Ͽ� ����ϱ�
			while ((���ϱ��� = �����б�.read(buffer)) > 0) {
				���Ͼ���.write(buffer, 0, ���ϱ���);
			}
			
			// ���⼭���� while �� �ٱ��� �ۼ��ؾ� �Ѵ�.
			// ���� ��Ʈ���� �ݾ��ֱ� ���Ͽ� .close(); �� �ݵ�� ���־�� �Ѵ�.
			�����б�.close();
			���Ͼ���.close();
			
			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
	}
}
