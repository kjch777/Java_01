package com.kh.oop.basic;

// ����
public class Nation {
	/* �Ӽ��� 
	 public �� �ۼ��ص��� ������
	 �ڵ����� default �� �ٴ´�.
	 ex) (default) String name;
	 default �� �����Ϸ��� default �ۼ����� ����. �˾Ƽ� �ڵ����� �ٴ´�. 
	 */ 
	public String name;
	public int age;
	public char gender;
	public String jumin;
	
	/* �޼��� ��� */
	public void speakKorean() {
		System.out.println("�����ٶ� �ѱ��� ����");
	}
	
	public void welfare() {
		System.out.println("���ѹα� ���� ������ ����!");
	}
	
	public void �������ǹ�() {
		// �� 19�� �̻� ���θ� ������ ���� ���
		if(age >= 19) {
			System.out.println(name + " ���� �����̹Ƿ�, ���� ���� ������Դϴ�.");
		} else {
			System.out.println(name + " ���� �̼����ڷ�, ���� ���� ����ڰ� �ƴմϴ�.");
		}
	}

}
