package com.kh.practice.file.model.dao;

import java.util.*;

public class FileDAO {
	private Map<String, String> files = new HashMap<>();

	public boolean checkName(String file) {
		
		return files.containsKey(file);
	}
	
	public void fileSave(String file, String s) {
		files.put(file, s);
		System.out.println("���� ���� �Ϸ� : " + file);
	}

	public StringBuilder fileOpen(String file) {
		if(files.containsKey(file)) {
			System.out.println("���� ���� �Ϸ� : " + file);
			return new StringBuilder(files.get(file));
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
			return new StringBuilder(); // ������ �������� �����Ƿ�, ������ ���� ���� ����.
		}
	}

	public void fileEdit(String file, String s) {
		if(files.containsKey(file)) {
			files.put(file, s);
			System.out.println("���� ���� �Ϸ� : " + file);
		} else {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		}
		
	}

}
