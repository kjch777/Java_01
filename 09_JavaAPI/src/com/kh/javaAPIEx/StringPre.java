package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		
		// substring �޼��带 ����Ͽ�, ���ڿ��� �Ϻ�(Today)�� �����϶�.
		String ����1 = "Today is a beautiful day.";
		String ���꽺Ʈ��1 = ����1.substring(0, 5); // ���� ���ڴ� ���� ����, �� ���ڴ� �� ���� + 1
		System.out.println(���꽺Ʈ��1);
		
		// toUpperCase �޼��带 ����Ͽ�, ��� �빮�ڷ� ��ȯ�϶�.
		String ����2 = "Programming is fun and challenging.";
		String ���������̽� = ����2.toUpperCase();
		System.out.println(���������̽�);
		
		// toLowerCase �޼��带 ����Ͽ�, ��� �ҹ��ڷ� ��ȯ�϶�.
		String ����3 = "Learning new things is exciting.";
		String ���ξ����̽� = ����3.toLowerCase();
		System.out.println(���ξ����̽�);
		
		// split �� ����Ͽ�, ���ڿ��� " " �� �����϶�.
		String ����4 = "A good medicine tastes bitter.";
		String[] ����4�迭 = ����4.split(" ");
		
			// for - each ��
			for(String ����4_1 : ����4�迭) {
				System.out.println(����4_1);
			}
		
		// replace �� ����Ͽ�, more �� less �� ��ü�϶�.
		String ����5 = "The more, the better.";
		String ���÷��̽� = ����5.replace("more", "less");
		System.out.println(���÷��̽�);
		
		// charAt �� ����Ͽ�, 6��° ���ڸ� �����Ͷ�.
		String ����6 = "Walls have ears.";
		char ���� = ����6.charAt(6); // .charAt(); �� ������, char �� ��� �Ѵ�.
		System.out.println(����);
		
		// substring �޼��带 ����Ͽ�, his ���� ������ �����϶�.
		String ����7 = "Every dog has his day.";
		String ���꽺Ʈ��2 = ����7.substring(14);
		System.out.println(���꽺Ʈ��2);

	}

}
