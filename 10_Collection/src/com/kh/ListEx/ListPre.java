package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
      ��     Vector : Java 1 ���� �뿡�� ���� ���� �����Ͽ� ���� ��
 List ��  ArrayList : �˻��� �� ����. ������ ������ ���԰� ������ ����� ��쿡�� �������ϴ�. 
      �� LinkedList : �˻����� �������ϴ�. ������ ������ ���԰� ������ ������ ���� ����.
 */
public class ListPre {

// �޼���
	// �⺻ ������
	public ListPre() {
		// Ctrl + Space
	}
    
	// ��� void : ����
	public void VectorEx() {

	   // List<String> ���� = new Vector<>(); �̷��� ����ص� ������, �ǵ��� �Ʒ�ó�� ����ϴ� ���� �����Ѵ�.
		Vector<String> ���� = new Vector<>();

		����.add("�ڹ�");
		����.add("���̽�");
		����.add("C");

		System.out.println(����);
	}
	
	// ��� void : ��ũ��
	public void LinkedEx() {
		
		//    List<String> ��ũ�帮��Ʈ = new LinkedList<>(); �̷��� ����ص� ������, �ǵ��� �Ʒ�ó�� ����ϴ� ���� �����Ѵ�.
		LinkedList<String> ��ũ�帮��Ʈ = new LinkedList<>();
		��ũ�帮��Ʈ.add("��");
		��ũ�帮��Ʈ.add("ȣ����");
		��ũ�帮��Ʈ.add("�䳢");
		
		System.out.println(��ũ�帮��Ʈ);
		
	}
	
	// ��� void : ���
	public void ArrayEx() {
		
		ArrayList<String> ��̸���Ʈ = new ArrayList<>();
		
		��̸���Ʈ.add("���");
		��̸���Ʈ.add("�ٳ���");
		��̸���Ʈ.add("����");
		
		System.out.println(��̸���Ʈ);
		
	}
	
	// ���� �޼��� : main + Ctrl + Space
	public static void main(String[] args) {
		
		ListPre lp = new ListPre();
		lp.VectorEx();
		lp.LinkedEx();
		lp.ArrayEx();
		
	}

}
