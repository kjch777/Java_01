package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/*
 BufferedImage : �̹��� �����͸� �����ϰ� ó���� ��, ����Ѵ�.
 		 Image : �������̽��� �̹����� ǥ���ϴ� �߻�ȭ�� ������ �����Ѵ�.
 	   ImageIO : �̹����� ���Ϸκ��� �о����, ����ϴ� �̹��� In Out 
 */
public class ImageResize {
	public static void main(String[] args) {
		
		// ���� �̹��� ���
		String �����̹��� = "src/com/kh/imageEx/marley.jpg";
		String �����������̹��� = "src/com/kh/imageEx/marley_cute.jpg";
		
		// �̹����� ���� ���� ũ�� �����ϱ�
		int ����ũ�� = 200;
		int ����ũ�� = 200;
		
		try {
			// BufferedImage �� ����Ͽ� �̹��� �ҷ�����
			BufferedImage �����̹��������� = ImageIO.read(new File(�����̹���));
			
			// ���ο� ũ���� �̹��� �����ϱ�                     ���α���  ���α���   �̹����� � Ÿ������ �׸��� ����
			BufferedImage ũ�������̹��� = new BufferedImage(����ũ��, ����ũ��, BufferedImage.TYPE_INT_RGB);
			
			// �̹��� ũ�⸦ �����Ͽ�, ���ο� �̹����� �׸���
			Image �̹����׸��� = �����̹���������.getScaledInstance(����ũ��, ����ũ��, Image.SCALE_SMOOTH);
			ũ�������̹���.createGraphics().drawImage(�̹����׸���, 0, 0, null);
			
			// ���� ���� �̹����� ���Ϸ� �����ϱ�
			ImageIO.write(ũ�������̹���, "jpg", new File(�����������̹���));
			
		} catch (IOException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
	}
}
