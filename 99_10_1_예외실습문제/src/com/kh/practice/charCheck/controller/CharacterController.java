package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

// �޼���
	// �⺻ ������
	public CharacterController() {
		
	}
	
// ��� void 
	// ���ڿ��� ������� ��, ���� ��Ȳ �߻� �ÿ� ����� ���� �����
	public int countAlpha(String s) throws CharCheckException {
		if(s == null || s.isEmpty()) {
			throw new CharCheckException("�Էµ� ���ڿ��� ����ֽ��ϴ�.");
		}
		if(s.contains(" ")) {
			throw new CharCheckException("���ڿ��� ������ ���ԵǾ� �ֽ��ϴ�.");
		}
		// match : �ִ��� Ȯ��
		if(s.matches(".*[0-9_].*")) {
			throw new CharCheckException("���ڿ��� ���ڳ� Ư����ȣ�� ���ԵǾ� �ֽ��ϴ�.");
		}
		// ���ĺ��� ������, ���ĺ��� �������� Ȯ���ϴ� �ڵ�
		int count = 0; // int �̹Ƿ�, return ������ ���ڸ� �־��ش�.
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//        �ҹ��� a ~ z               �빮�� A ~ Z
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				count++;
			}
		}
		return count;
	}
}
