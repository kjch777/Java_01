package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	
// �ʵ�
	public char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};

// �޼���
	// �߻� �޼���
	public abstract String makeCall() {
	// abstract (�߻�) �� �޼��忡 ���̷��� ���������� �ٷ� �ڿ� �ۼ��Ѵ�.
		
	}
	
	// �߻� �޼���
	public abstract String takeCall() {
		
	}
	
}
