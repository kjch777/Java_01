package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {

// �ʵ�
	private Snack s = new Snack();

// �޼���
	// �⺻ ������
	public SnackController() {
		
	}
	
	// return saveData
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "���� �Ϸ�";
	}
	
	// return confirmData
	public String confirmData() {
		return s.information();
	}
	
}
