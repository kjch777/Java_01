package com.kh.practice.charCheck.exception;
//                              Exception �� ��ӹ޾�, �����ڰ� ���ϴ� ���� ��Ȳ�� ���� �� �ִ�.
public class CharCheckException extends Exception {
	
// �޼���
	// �⺻ ������
	public CharCheckException() {
		// super();
	}
	
	// �ʼ� ������
	public CharCheckException(String msg) { // � ���ڰ� ������, Exception �� �����ؼ� ó���ϰڴٴ� �ڵ��̴�.
		super(msg);
	}
	
}
