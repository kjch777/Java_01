package com.kh.ExceptionEx;
/*
 Exception ����, try catch finally 
 
 try ���� Ctrl + Space // catch finally
 
 try {
 		// ���ܰ� �߻��� ���� ������, ������ �ڵ� �ۼ�
 } catch(Exception e) {
 						// ���ܰ� �߻����� �� ������ �ڵ� �ۼ�
 } finally {
 				// ���� �߻��� ���� ����, ������ ������ �ڵ� �ۼ�
 		   		ex) ���� �ݱ�, ���� ���� ��
 }
 */
public class ExceptionFinallyEx {
	public static void main(String[] args) {
		try {
			int ��� = 10/0;
		} catch (Exception e) {
			System.out.println("0 ���� ����.");
		} finally {
			System.out.println("����.");
		}
	}
}
