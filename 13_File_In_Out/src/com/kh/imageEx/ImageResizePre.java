package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageResizePre {
	public static void main(String[] args) {
		// ���� �̹��� ��ο� ���� �̹��� ��� �����ϱ�
		String �����̹��� = "src/com/kh/imageEx/pig.jpg"; // ���� �޼��� �ȿ� �ۼ����ش�. // .Ȯ���ڱ��� �ۼ����ش�.
		String �����̹��� = "src/com/kh/imageEx/pig_cute.jpg"; // ���ϸ��� �ߺ����� �ʰ� �ٲ��ش�.
		
		// ���� ���� �̹����� ���� ���� ���� �����ϱ�
		int ���α��� = 400;
		int ���α��� = 200;
		
		try {
			// BufferedImage �� ����Ͽ� ���� �̹��� ������ �ҷ�����
			BufferedImage �����̹��������� = ImageIO.read(new File(�����̹���));
			
			// ���ο� ũ���� �̹��� �����ϱ�
			BufferedImage �̹������� = new BufferedImage(���α���, ���α���, BufferedImage.TYPE_INT_RGB);
			
			// �̹��� ũ�⸦ �����Ͽ�, ���ο� �̹����� �׸� �غ��ϱ�
			Image �̹����׸��� = �����̹���������.getScaledInstance(���α���, ���α���, Image.SCALE_SMOOTH);
			
			// �̹��� �׸��� ����                           x��ǥ y��ǥ ȿ�� �߰� ����
			�̹�������.createGraphics().drawImage(�̹����׸���, 0, 0,  null);
			
			// ���� ���� �̹����� ���Ϸ� �����ϱ�
			ImageIO.write(�̹�������, "jpg", new File(�����̹���));
			
			System.out.println("���� �Ϸ�");
			
		} catch (IOException e) {
			System.out.println("���� �߻�");
			e.printStackTrace(); // �� �ڵ�� ���� �߻� ������ �� �� �ִ�.
		}
	}
}
