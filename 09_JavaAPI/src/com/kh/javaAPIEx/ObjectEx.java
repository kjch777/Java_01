package com.kh.javaAPIEx;
/*
 Object : ��� �ڹ� Ŭ���� �߿� �ֻ��� Ŭ������,
          ��� Ŭ������ �⺻���� ��ӹ޴� Ŭ�����̴�.
		  Object Ŭ������ �⺻���� ����Ѵ� ��� ������ �ֱ� ������,
		  ���� new Object �� �Ἥ ��� �� �ʿ䰡 ����.
		  ��� Ŭ������ �⺻���� Object Ŭ������ ����� �� �ְ� ���������.
		  ��ǥ �޼��� : equals toString
   
     Ob : Old Boy
   ject : ������ �ô´�
 */
public class ObjectEx {

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Object�������� �������� �޼����Դϴ�.";
	}
	
	public static void main(String[] args) {
		// Object�� �⺻�̱� ������, ���� new �� �Ἥ ���� ���� �� �ʿ�� ����.
		// ������ �׷��ٰ� �ؼ� ���� �� ���� ���� �ƴϴ�.
		// Object ���� ���콺�� �ø��� ������ ����� ȭ�鿡��, �ϴ� @ ���� �ִ� �������� ������
		// Object ���Ϸ� �̵��ؼ� �� �� �ִ�.
		Object ������Ʈ = new Object();
		
		System.out.println(������Ʈ);

	}

}
