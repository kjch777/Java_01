package com.kh.practice.set.controller;

import java.util.HashSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	
// �ʵ�
	// - lottery : HashSet = new HashSet();
	// ��÷�ڸ� ���� HashSet ��ü lottery ����
	private HashSet lottery = new HashSet(); // HashSet import
	
	// - win : HashSet = new HashSet();
	// ��÷�ڸ� ���� HashSet ��ü win ����
	private HashSet win = new HashSet();

	
// �޼���
	// HashSet �� ���� �����ϴ� �޼���
	public boolean insertObject(Lottery l) {
	//        (�θ� class �̸� ���� ���� �� ���ο� ������)
		
		// ���� ���� l �� lottery �� �߰� // �߰� == �߰�������.add(�߰��Ұ�); 
		lottery.add(l);
		
		// �߰� ����� boolean �� ��ȯ �ϱ� // ��ȯ == return;
		
	}
	
	// HashSet �� �ִ� ���� �����ϴ� �޼���
	public boolean deleteObject(Lottery l) {
	//      (�θ� class �̸� ���� ���� �� ���ο� ������)	
		
		// ���� ���� l �� lottery ���� ���� // ���� == �����Ұ����ִ°�.remove(�����Ұ�);
		lottery.remove(l);
	}
	
	public HashSet winObject() {
		
	}
}
