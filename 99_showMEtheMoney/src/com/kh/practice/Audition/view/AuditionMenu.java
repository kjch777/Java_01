package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

// ������� ���忡�� �ٶ󺸴� ȭ��

public class AuditionMenu {

// �ʵ�
	// import �� ��ü		���ο� ������   =	���ο� 		 ���� () ����
	AuditionController 	    ac 		=	 new AuditionController(); 
	
// �޼���
	// �⺻ ������
	public AuditionMenu() { 
		
	}
	
	// ������ ����, ��� ���
	// ��� void �޼��� ���� class ��� �޶� ��� ����.
	public void printAuditionMenu() {
		System.out.println("������ �̸� \t\t �о� \t\t ����"); // \t Tab��ŭ ���� - \n Enter �ٹٲ�
		System.out.println("=========================");
		
		// for - each ��
		// String �� ��ٸ� �������� �̸�, ����, ���� �߿� �ϳ��� ������ �� �ִ�.
		// Audition �� �̸�, �о�, ���� ��� ������ �� �ִ�.
		for(Audition a : ac.printAudition()) {
			// �ۼ� �� import
		}
		
	}
}
