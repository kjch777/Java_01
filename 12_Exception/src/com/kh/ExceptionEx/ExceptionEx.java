package com.kh.ExceptionEx;

import java.util.*;

/*
 Exception == ����
              ���ܶ�, �ڵ�� ó�� ������ ������ ���Ѵ�.
              
			  try {
			  
			  		// ���ܸ� �߻���ų ���� ������, �õ��ϰ� ���� �ڵ带 �ۼ�
			 
			  } catch(Exception e) {
			 		
			 		// ���ܰ� �߻����� �� ������ �ڵ峪, ������ �ۼ�
			 		
			  }
			  
 catch ���� ���� ���� ���������� �ۼ��� �� �ִ�.
 catch ���� ������ ����� ���
 
 	catch(�迭Exception e)
			 	.
			 	.
			 	.
 	catch(Exception e) �� �� �������� �ۼ� ���ָ� �ȴ�.
 */
public class ExceptionEx {

// �ʵ�
	private Scanner sc = new Scanner(System.in);
	
// �޼���
	
	// �⺻ ������
	public ExceptionEx() {
		// Ctrl + Space
	}
	
	public void method1() {
		//   index   0   1   2   3
		int[] �迭 = {10, 20, 30, 40}; // ������ �ε��� == 3
		
		// for ��               length == 4
		for(int i = 0; i <= �迭.length; i++) {
			try { // �õ� �ϴ�
			System.out.println(�迭[i]);
			} catch(RuntimeException e) {
		    // �Ǵ� (ArrayIndexOutOfBoundsException e)
				System.out.println("1�� ���ܻ�Ȳ");
			}catch(Exception e) { // ������ ���
				System.out.println("�迭�� �ε����� ������ϴ�.");
			}
		}
	}
	
	// ���� - ���� ��� �� ����
	public static void main(String[] args) {
		ExceptionEx ���ܹ߻� = new ExceptionEx();
		���ܹ߻�.method1();
	}
	
}
