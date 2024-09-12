package com.kh.SetEx;

import java.util.HashSet; // �׻� .util �� �⺻�̴�.

/*
 set(����, �ָӴ�)
  	 ������ �������� �ʴ´�.
  	 �ߺ� ������ ������ ������ �ʴ´�. (���� ���� ������ �ڵ����� ����� �ȴ�.)
  	 
  	 �� LinkedHashSet : ������ �����ϴ� set
 set ��   HashSet (��ǥ��) : ó�� �ӵ��� ���� set
     ��       TreeSet : �ڵ� ���ĵǴ� set
     
		 HashSet ��� ����
		 		 ��� ���� 1 : ��ü�� equals() �� �����ε� �Ǿ� �־�� �Ѵ�. 
		 		 ��� ���� 2 : ��ü�� hashCode() �� �����ε� �Ǿ� �־�� �Ѵ�.
		 		 
		 Set<�ڷ���> �� = new HashSet<>();
		 HashSet<�ڷ���> �ؽü� = new HashSet<>();
     
 */
public class SetEx {

	public static void main(String[] args) {
		
		// �ߺ��� ������� �ʰ�, �� ���� �����ϴ� ���� �����ϱ� ������,
		// ������ �ߺ� Ȯ�ο� ���� ����Ѵ�.
		HashSet<String> set = new HashSet<>();
		
		// �����͸� �߰��� ���� .add()
		set.add("�θǽ�");
		set.add("ȣ��");
		set.add("�׼�");
		set.add("������");
		
		// ����� ���� .add() �� �߰��� ���� ������ ������ ���´�.
		System.out.println(set);
		
		// �����͸� Ȯ���� ���� .get()
		// System.out.println(set.get(1));
		// set �� �ڸ��� �����ϰ�, Ư���ϰ� �ڸ� ��ȣ�� ������ �ڸ��� ���� ������ ������ ����.
		
		// �����͸� ������ ���� .remove()
		set.remove("�θǽ�");
		System.out.println(set);
		
		// �������� ũ�⸦ Ȯ���� ���� .size() // Ȯ���� ����� �ؾ� �����ϴ�.
		System.out.println(set.size());
		
		// �����͸� ��� ������ ���� .clear()
		set.clear();
		System.out.println(set);
		
		// Ư�� �����Ͱ� �����ϴ��� Ȯ���� ���� .contains() // Ȯ���� ����� �ؾ� �����ϴ�.
		System.out.println(set.contains("������")); // ���� true �Ǵ� false �� ���´�.
		
		// �����͸� ������ ���� .set()
		// set.set();
		// set �� �ڸ��� �����ϰ�, Ư���ϰ� �ڸ� ��ȣ�� ������ �ڸ��� ���� ������ ������ ����.
	}

}
