
public class Variable {

	public static void main(String[] args) {
		// ���� ���� ���ڿ� �Ǽ� ����
		// ���� byte short int long
		// byte = 1byte
		
		byte ����Ʈ = 1;
		System.out.println(����Ʈ);
		System.out.println("����Ʈ");
		//������ ������ ���� ctrl + s
		byte bt = 2;
		System.out.println(bt);
		short ��Ʈ = 3;
		System.out.println(��Ʈ);
		int ��Ʈ = 1;
		System.out.println(��Ʈ);
		long �� = 5;
		System.out.println(��);
		// byte �ڷ��� ���� �����̸��� bte bte �ȿ� ���� 2 �ְ� ����ϱ�
		// short �ڷ��� ���� �����̸��� shrt shrt �ȿ� ���� 2 �ְ� ����ϱ�
		// int �ڷ��� ���� �����̸��� nt nt �ȿ� ���� 2 �ְ� ����ϱ�
		// long �ڷ��� ���� �����̸��� lng lng �ȿ� ���� 2 �ְ� ����ϱ�
		
		byte bte = 2;
		System.out.println(bte);
		short shrt = 2;
		System.out.println(shrt);
		int nt = 2;
		System.out.println(nt);
		long lng =2;
		System.out.println(lng);
		
		/*���ڿ��� char �� String �� �ִ�
		 *���ڸ� ��Ÿ���� char�� '' ���� ����ǥ�� ��� ����
		 *"" ū ����ǥ�� String ���ڿ��� ��Ÿ���� ǥ���̱� ������ char���� ���Ұ�
		 * char myChar3 = 'AB';
		 * char myChar4 = 'ABC';
		 * char myChar5 = '������';
		 * ��� ���ڰ� �ϳ��� �ƴϱ� ������ ��� �Ұ�
		 * char ���� �ϳ��� ���ڸ� �������ֱ� ������ A or B�� ����Ҽ� �ִ�
		 * */
		char myChar = 'A';
		System.out.println(myChar);
		
		//String�� ����ϸ� ����, ���� �� ���� �ִ�
		//String�� ����ؼ� �� �̸� ����ϱ�
		
		String Str1 = "�� ���� ���ڿ��̴�";
		System.out.println(Str1);
		
		String name = "������";
		System.out.print("����� �̸��� " + name + " �Դϴ�.");
		// ���࿡ ���� ���ڳ� ������ ���ٷ� ����ϰ� �ʹٸ� + �� ����ؼ� ���ϼ��ִ�.
		System.out.println("�� �� �� �� �� �� "+name+" �� �� �� .");
		
		// ���⸦ �ְ� ���� ��� "" ū ����ǥ ���ο� ���⸦ �ϸ� �ȴ�.
		// ���� + ���� + ���ڿ� ����ϱ�
		
		/* �ȳ��ϼ���. ���¿�. ������ ��� ooo �Դϴ�.
		 * �� ��ȭ��ȣ�� 111-2222-3333 �Դϴ�.
		 * �� �ֹι�ȣ�� ����Դϴ�.
		 * �� �������� A���Դϴ�.
		 * */
		
		String greeting = "�ȳ��ϼ���. ";
		String introduction = "���� ������ ��� ooo �Դϴ�.";
		String number = "111-2222-3333";
		char dash = '-';
		String secret = "���";
		String bloodType = "A��";
		System.out.print(greeting);
		System.out.println(introduction);
		System.out.println("�� ��ȭ��ȣ�� "+number+" �Դϴ�.");
		System.out.println("�� �������� "+bloodType+" �Դϴ�.");
		System.out.println("���� ���Ÿ� ���� " + dash + " ���");
		
		System.out.println(greeting + introduction);
		System.out.println("�� ��ȭ��ȣ�� "+number+" �Դϴ�.");
		System.out.println("�� �������� "+bloodType+" �Դϴ�.");
		System.out.println("�� �ֹι�ȣ�� "+secret+" �Դϴ�.");
		
		// �Ǽ��� float, double ���
		// �Ǽ��� �⺻���� double ����
		// float = 4byte, double = 8byte
		// float�� �Ǽ��� ��� ���ؼ��� f�� �ٿ���� ��
		// �Ǽ� �ڿ� f�� ���� ���� ��ҹ��� ���о��� ��� ����
		float ff1 = 3.14F;
		float ff2 = 3.14f;
		System.out.println("ff1 �� " + ff1 + " �̴�.");
		System.out.println("ff2 �� " + ff2 + " �̴�.");
		// double�� float ���� ũ�� ������, ���¿� �ٸ� ������ ������ �ʾƵ� ����� �����ϴ�
		double dd1 = 3.14;
		System.out.println("double dd1 : " +dd1);
		// boolean �� ����ؼ� true ���� false ���� ǥ�� ����
		// ���߿� �˰����̳� if, for, while ���� ���� ���
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("���� ������ "+isTrue);
		System.out.println("���� ������ "+isFalse+ "?");
		
		// ���� ���� ���ڿ� �Ǽ� ����
		int num = 10;
		System.out.println("���� num �� �� = " + num);
		
		char ch = 'Z';
		System.out.println("���� ch �� �� = " + ch);
		
		String text = "Hello, World!";
		System.out.println("���ڿ��� text = "+text);
		
		double dbl = 3.14;
		System.out.println(dbl);
		
		boolean isTrue2 = true;
		System.out.println("isTrue2 = " + isTrue2);
		
		System.out.println(" num = " + num);
		// num �� 10 ��� 20 �� �ְ� �ʹٸ�?
		num = 20;
		// �������� ó�� 1ȸ�� ����� ��, ������ �ٸ� ���ڳ� ���� ���� ���� �������� �����Ѵ�. 
		System.out.println("20���� ������ ���� num �� �� : " + num);
		
		
		/*
		 * ö���� 19���̾���.
		 * �׷��� 24���� �Ǹ鼭, 20���� �Ǿ���.
		 * */
		
		String name1 = "ö��";
		String age = "19";
		System.out.println(name1 + "�� " + age + "���̾���.");
		age = "20"; // ������ �ϳ� �� �ϴ��� age ���� �����ϴ°� ȿ�����̴�
		System.out.println("�׷��� 24���� �Ǹ鼭, " + age + "���� �Ǿ���.");
		
		
	}

}
