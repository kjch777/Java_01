package com.kh.PropertiesEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

/*
 Properties : �Ӽ�, ����. �ʼ��� �־�� �ϴ� ���� �ۼ��� �� ���� ����Ѵ�. 
 			  Map �� ����� ������ �����͸� �����ϴ� ���� ����Ѵ�.
 			  key(Ű) �� value(��) ���� �̷���� �ִ�.
 			  Ű�� ���� ���ڰ� �ƴ϶� ���ڿ��� ���·� ����Ǿ� �ִ�.
 
 	�޼���
 		.setProperty(String key, String value) : ������ Ű�� ������ �ʿ� �׸��� �߰��� �� ����Ѵ�.
 		              .getProperty(String key) : �־��� Ű�� ���� ���� ��ȯ�� �� ����Ѵ�.
 		.getProperty(String key, String value) : �־��� Ű�� ���� ���� ����������, 
 												 �ش��ϴ� Ű�� ���� ��쿡�� �⺻���� ��ȯ�Ѵ�.
 		                   .load(InputStream in) : �Է� ��Ʈ������ �Ӽ� ����� �о�� �� ����Ѵ�.
 		.store(OutputStream out, String comment) : ��� ��Ʈ������ �Ӽ� ����� ������ �� ����Ѵ�.
 
 Properties �� ���, ���α׷��̳� �ڵ带 ������ �� �ʼ��� �������־�� �ϴ� ������ �ۼ��� ��, �ַ� �ڵ尡 �ƴ϶� ���Ϸ� �����Ѵ�.
 Map �� �ַ� �����͸� �ٷ�����, Properties �� ���� Ű��, ȸ������ ���� ��ȣ�� ������ ���Ͽ�, ������ �ʿ��� ������ �ۼ��س��� �����̴�.
 */
public class PropertiesEx {
	public static void main(String[] args) {
		// Properties ��ü ����
		Properties ���� = new Properties();
		
		// ���� ���� �����
		try {
			// File
			File ��¥���ϸ���� = new File("����.properties");
			
			// ���� ������ �������� �ʴ´ٸ�, ���� ������ֱ�
			if(��¥���ϸ����.exists()) {
				System.out.println("������ �����մϴ�.");
			} else {
				System.out.println("���� ������ �����ϴ�. ���ο� ������ ������ּ���.");
				��¥���ϸ����.createNewFile();
			}
			
			// ���� �ҷ�����
			FileInputStream ���Ϻҷ����� = new FileInputStream("����.properties");
			����.load(���Ϻҷ�����);
			���Ϻҷ�����.close(); // ���� �ҷ����� ����
			
			// ������ �̸��� ��й�ȣ�� �������� �ڵ�
			// ����, �������̸��� �����ں���� ���ٸ�, null ���� ��ȯ�� ���̴�.
			String �������̸� = ����.getProperty("�������̸�");
			String �����ں�� = ����.getProperty("�����ں��");
			System.out.println("�������̸� : " + �������̸�);
			System.out.println("�����ں�� : " + �����ں��);
			
			// ����, ���� �ƹ� �͵� ��� null ���� ��ȯ�Ǵ� ���� �ȴٸ�, ���� ���� �������� �� �ִ�.
			����.setProperty("name", "�Ŵ���");
			����.setProperty("password", "1234");
			
			// ����� ������ ���Ͽ� �����ϱ�
			FileOutputStream �������� = new FileOutputStream("����.properties");
			
			// ���ο� ���� �����, ������ �� � ������ ����, ���� �Ǵ� �߰��ߴ��� �ۼ��ϴ� �ڵ�
			����.store(��������, "���ο� �̸��� ��� ����");
			
			// ���� ���� ����
			��������.close();
			
			System.out.println("�����ڰ� ���������� ����Ǿ����ϴ�.");
		
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		  } 
		
		  catch (Exception e) {
			
			e.printStackTrace();
		  }
	}
}
