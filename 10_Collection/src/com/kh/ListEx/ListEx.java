package com.kh.ListEx;
/*
     ��     Vector : Java 1 ���� �뿡�� ���� ���� �����Ͽ� ���� ��
List ��  ArrayList : �˻��� �� ����. ������ ������ ���԰� ������ ����� ���, �������ϴ�. 
     �� LinkedList : �˻����� �������ϴ�. ������ ������ ���԰� ������ ������ ���� ����.
*/
import java.util.ArrayList; // �׻� .util �� �⺻�̴�.
import java.util.List;

/*
 List : �ڷḦ ���������� ������ �ڷ� ������, �迭�� ����ϴ�.
 		�ε����� �����Ѵ�.
 		�ε����� ������ ���еǱ� ������, �ߺ� ������ ������ �����ϴ�.
 		�������̽��̱� ������, ��ü�� ������ �Ұ����ϴ�.
 		������ ���������� �̿��� �� �ִ�.
 		
 ��� ���� 
 	List list = new ArrayList(3); // 3ĭ¥�� ����
 	
 E(Element) : ��Ҹ� ���ϴ� ��¡���� ���ڷ�, �ڷ����� �ƴϴ�.
 		   == Object String Student ��, ��ü�� ������ �ʰ� ���� �� �ִ�.
 */
public class ListEx {
	
	public static void main(String[] args) {
		
		// List ��ü �����ϰ�, ArrayList �ν��Ͻ� ����
		/*
		 List list = new ArrayList(3); ���� List �� ����, < > �� Ÿ���� ���������� �ʾƼ� ����� ��� �߻��� ���̴�.
		 
		 ���� ������� ���ְ� �ʹٸ�, List<�ڷ���>�� �־ ����� �� �ִ�.
		 List<String> list = new ArrayList(3); 
		 
		 �Ǵ�, List<Object> �� ����ϸ� �ȴ�.
		 Object �� String Integer Boolean ��� ��� ��� �����ϴ�.
		 */
		List list = new ArrayList(3); // 3ĭ�� ���� �� �ִ�.
		list.add("�ƹ��ų�"); // add �� ����Ͽ� �߰��� �� �ִ�. 1ĭ°
		list.add(new Object()); // 2ĭ°
		list.add(123123); // 3ĭ°
		
		list.add(false); // 4ĭ°���� 
		// 3ĭ�� �ʰ��ص� ũ�Ⱑ �ڵ����� �þ�� ������, ������ �߻����� �ʴ´�.
		
		System.out.println(list);
		
	}

}
