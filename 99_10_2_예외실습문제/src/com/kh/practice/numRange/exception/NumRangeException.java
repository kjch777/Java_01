package com.kh.practice.numRange.exception;

public class NumRangeException extends Exception {
	//                         extends Exception 
	//                                 Exception �� ��ӹ޾�, �����ڰ� ���ϴ� ���� ��Ȳ ��ó �ڵ带 ���� �� �ִ�.

// �޼���
	// �⺻ ������
	public NumRangeException() {
		// Ctrl + Space
	}
	
	// �ʼ� ������
	public NumRangeException(String msg) { // msg : �޼��� == � ����
// � ���ڰ� ������, Exception �� �����ؼ� ó���ϰڴٴ� �ڵ��̴�.
		super(msg);
	//  super(msg);
	}
}
