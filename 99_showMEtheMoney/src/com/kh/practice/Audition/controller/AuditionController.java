package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {

	// �ʵ忡 �迭 �����
	private Audition[] aArr = new Audition[5];

	public static final int CUT_LINE = 60; // ���� �빮�ڷ� ǥ��Ǿ� ������ ����Һ��� ��������� �����.
	// �� ��, static final �� ����Ѵ�.

// �޼���
	// �⺻ ������
	public AuditionController() {
		// 5���� ��ü �迭�� ������ �̹� �����ִ� ���� �������� ������ �ʱ�ȭ ���ش�
		aArr[0] = new Audition("�迵��", "�߶��", 100);
		aArr[1] = new Audition("�ڿ���", "����", 50);
		aArr[2] = new Audition("�̿���", "������", 85);
		aArr[3] = new Audition("������", "��", 60);
		aArr[4] = new Audition("ȫ����", "��", 20);
	}

	// ��ü �迭�� �ִ� ������ ��ȯ - ��ȯ�� return
	public Audition[] printAudition() { // Audition[] == Audition �迭
		return aArr; // aArr �迭�� ��� ���� ��ȯ�ϰڴٴ� ��
	}

	// ��ü �迭�� ������ ���� ���� ��ȯ - ��ȯ�� return
	public int sumScore() {
		int sum = 0; // sum �� 0 �� �־ 0 ���� �ʱ�ȭ
		
		// Audition    : aArr �迭
		for(Audition a : aArr) {	
			sum += a.getScore(); // ������ 0���� �ʱ�ȭ �� ���� 
			  // = aArr �迭���� ������ �����ͼ� ���� ���� a�� ����
		}
		// sumScore �� ȣ���Ѵٸ�, ������ ��ȯ�ϰڴ�.
		return sum;
	}
	
	public double[] avgScore() {
		// double �迭�� �����
		double[] avgArr = new double[2];
		// sumScore �� return ���� 0 ��° index �� �����ϰ�
		avgArr[0] = sumScore();
		// ���� ����� 1 ��° index �� ���� �� 
		avgArr[1] = avgArr[0] / aArr.length;
		// �迭 return
		return avgArr;
	}
	
	// for - each ������ �� �������� �հ� ���� ����ϱ�
	public void printPass() {
		// ��� �޼��� - void
	 // for(   ������ 	���ο� ������ : �迭)
		for(Audition        a     : aArr) {
			a.setPassed(a.getScore() >= CUT_LINE);
 // ���ο� ������.boolean set �������� ������(���ο� ������.���� get >= ĿƮ ����)
			System.out.println(a.getName() + " �����ڴ� " + (a.isPassed() ? "�հ�" : "���հ�") + " �Դϴ�.");
		} // 							   ���� ������ ����    .isPassed() ? true : false
		  //                              boolean getter == is			  �� �� ����� ��		
	}

}
