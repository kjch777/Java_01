package com.kh.practice.token.controller;

public class TokenController {
	
// �޼���
	// �⺻ ������
	public TokenController() {
		
	}
	
	public String firstCap(String input) {
	// �Էµ� ���ڿ��� ù ���ڸ� �빮�ڷ� ��ȯ ��, ��ȯ
	// ���� ���, "java" ��� ���ڿ��� �ԷµǸ�, �ڵ����� "Java" �� ����ǰ� ������ִ� �޼���
	// subString (�����ϴ� �ε��� ��, ������ �ε��� ��) 
    // subString (�����ϴ� �ε��� ��) �� ���� ���ϴ� ���ں��� ������ ����
    // toUpperCase : ���ڸ� ��� �빮�ڷ� ������ �� ���
		return input.substring(0, 1).toUpperCase() + input.substring(1);
		
	}
	
	public int findChar(String input, char one) {
		
	}
	
}
