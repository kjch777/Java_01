package com.kh.operatorPre;

import java.util.Scanner;

// ��Ű�� : ���� ���� Ŭ������ ����ִ� ���� ��ġ

public class OperatorPre {
	// Ŭ���� : �����ϰ��� �ϴ� �ڵ带 �ۼ��ϴ� ����
	
	public static void main(String[] args) {
		// ���� �޼��� : �������� �����ϴ� �޼���
		// �⺻ ��� �޼���
		// �ۼ��� �޼��� �߿���, �����̳� ����ϰ��� �ϴ� �޼��带 �ۼ�
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice44();
		practice5();
	}
	
	public static void practice1() {
		// �������� ����ϴ� �޼���� �ƴ�����,
		// ��Ȳ�� ���� ���� �޼��忡�� ȣ���Ͽ� ����� �� �ִ� �޼��� �� �ϳ�
		// static : �޸𸮿��� ����
		// ��� ����� ������ ���� ��������
		// ��ĳ�ʸ� �̿��ؼ� Ű����� �Է��� ������ ��ǻ�Ϳ� ���
		// System.in : Ű����� �Է� ���� �� �ְ� ���ִ� ��� �ý���
		// Scanner : Ű����� �Է��� ������ ��ǻ�ͷ� ���
		// Scanner �� �⺻���� ������ �ֱ�� ������ ���̺귯������ �����;� �ϱ� ������
		// import �� �̿��ؼ� ������ �;� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		// Scanner �� �ҷ��� ������ �ٷ� sc �� ��ĳ�� ����� �ҷ��͵� ������
		// Syste.out.print �� �̿��ؼ� � �ൿ�� �����ϰ� �ִ��� Ȯ���ϴ� �۾��� ������ ��
		System.out.print("�ο� ���� �Է� �ϼ��� : ");
		// �ο� �� �Է� �ޱ�
		int people = sc.nextInt();
		System.out.print("���� ������ �Է� �ϼ��� : ");
		// ���� ���� �Է� �ޱ�
		int candies = sc.nextInt();
		
		int getCandies = candies / people;
		// 1�δ� ������ ���� ���� ���
		int reMain = candies % people;
		// �����ְ� ���� ���� ���� ���
		
		System.out.println("���� �ο� : " + people);
		System.out.println("������ �� ���� : " + candies);
		System.out.println("�����ϰ� �������� ���� ���� : " + getCandies);
		System.out.println("���� ���� ���� : " + reMain);
		// ���� : ctrl + F11
	}
	
	public static void practice2() {
		//Ű����� ���� �Է��ϱ� + �� �� Ȯ��
		
		Scanner sc = new Scanner(System.in);
		// Scanner �� Ȱ���Ͽ� Ű���� �Է��ϴ� â �����
		System.out.println("�л� ���� ���α׷�");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		// �̸� �Է� �ϱ�
		System.out.print("�г�(���ڸ� �Է� �ϼ���) : ");
		int grade = sc.nextInt();
		// �г� �Է� �ϱ�
		System.out.print("��(���ڸ� �Է� �ϼ���) : ");
		int classNum = sc.nextInt();
		// �� �Է� �ϱ�
		System.out.print("��ȣ(���ڸ� �Է� �ϼ���) : ");
		int num = sc.nextInt();
		// ��ȣ �Է� �ϱ�
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		//� ���ڰ� ������ ���� ���� �� �տ� �ִ� ���ڸ�
		// �ʿ��ϱ� ������ 0���� �ۼ�
		// String gender = sc.next();
		// ���� �Է� �ϱ� (���߿� String �� char �� �Ẽ ��)
		// Scanner �� char ���� �Է��ϰ��� �� ����
		// charAt �� ����ؼ� ���ڿ� ��ġ�� �о���� �۾��� �����ؾ� �Ѵ�.
		// �ý������� ���� ��� System �� out �� print()
		// Scanner �� next �� charAt(���ڸ� ����� ��)
		//		    ���� ������ �ϴ� ���ڿ� �����ϴ� ����
		// T(0) 	A(1)	 B(2)	 L(3)	 E(4) = �� 5����
		// ���� �� �ձ��ڸ� ���� �ʹٸ�
		// charAt(0) : 0�� �� �ձ��ڿ� ���� �� T
		// charAt(1) : �ι�° ���� A
		// charAt(2) : ����° ���� B
		// charAt(3) : �׹�° ���� L
		// charAt(4) : �ټ���° ���� E
		// TABLE�� ��� �� 5�����̱� ������ 
		// charAt ��ȣ �ȿ��� 0 ~ 4������ ���� �ۼ��� �� �ִ�.
		System.out.print("���� : ");
		double score = sc.nextDouble();
		// ���� �Է� �ϱ� (���߿� �Ҽ��� ��° �ڸ� ������ �� ��)
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + classNum);
		System.out.println("��ȣ : " + num);
		System.out.println("���� : " + gender);
		//System.out.println("���� : " + score);
		System.out.printf("���� : %.2f" , score);
		// printf �� �� ���� + �� �ƴ϶� , �� ��� �Ѵ�.
		// printf �� %f �� ����� ���� 
		// �Ҽ��� �ڸ��� �������൵ �ǰ� ���������� �ʾƵ� �ȴ�.
		// �ٸ�, ���� �Ҽ��� �ڸ��� �����ؼ� ����ϱ� ���Ѵٸ�
		// % . ����� ���ϴ� �Ҽ��� �ڸ� �� f
		// ���� ��� �Ҽ��� 4��° �ڸ����� ����ϱ� ���Ѵٸ� %.4f
		// �Ҽ��� 5��° �ڸ����� ����ϱ� ���Ѵٸ� %.5f
		// �Ҽ��� 2��° �ڸ����� ����ϱ� ���Ѵٸ� %.2f
		// ������ ���� ��� ���ڿ� ����
		// ���� ������ ��� ���ڿ� ����
		// System.out.print("�ٹٲ� ���� ���η� ���")

		// println("����� �� ���� ������ �ٹٲ� ����")
		// printf("������ ������ ���ڿ��� ����� �� ���")
		// %d : 10���� ����(����, 0, ���) 
		// %f : �Ǽ�(�Ҽ��� ��)
		// %s : ���ڿ� ���
		// %c : ���� 1�� ��� 
		// %b : true ���� false ���� ���
		// %x : 16���� ���� 
		// %o : 8���� ���� ���
	}

	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է� �ϼ��� : ");
		int korean = sc.nextInt();
		System.out.print("���� ������ �Է� �ϼ��� : ");
		int english = sc.nextInt();
		System.out.print("���� ������ �Է� �ϼ��� : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		// �Է��� ������ �հ� ���
		// ���� ���� = �������� + �������� + ��������
		double average = (double) total / 3.0;
		// ���� ���� ������ 3�� �ؼ� ��� ���� ����ϱ�
		// ������ ������ ������ ���´ٴ� ������ ���� ������
		// �Ǽ��� ���´ٰ� �����ϰ� int ��� double �� ����Ѵ�.
		// �� double average �� 64bit
		// �� total ���� int 32bit �̱� ������
		// ��ȣ double �� �ۼ��Ͽ� ����ȯ�� ����� ��
		System.out.println("���� ���� : " + korean);
		System.out.println("���� ���� : " + english);
		System.out.println("���� ���� : " + math);
		System.out.println("�� ���� : " + total);
		System.out.println("��� ���� : " + average);
		
	}
	
	public static void practice4() {
		// Ű����� �Է��� 2���� ���� ���� ������
		// true, �׷��� ������ false �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		boolean result = num1 == num2 ;
		// �� ������ ��� ���� result = true or false;
		// = : equal �̶�� �д´�.
		
		// == true : == ���ʿ� �ִ� ���� ���� ������ true
		// 3 == 5 : false ��� ǥ��
		// 5 == 5 : true ��� ǥ��
		// != : ���ʿ� �ִ� ���� �ٸ����� �ٸ��� �¾�! �׷��ٸ� true
		// 3 != 5 : true ��� ǥ��
		// 3 != 3 : false ��� ǥ��
		// true false �� ǥ�� �� �� 
		// ��� ���� true false �� ǥ���ϱ� ���ؼ���
		// boolean �� ����ؼ� ǥ�� ��
		
		System.out.println("�� ��� : " + result);
	}

	public static void practice44(){
		// Scanner �̿��ؼ� num1 num2 �� �ޱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt(); // ������ num1 ���� ����
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt(); // ������ num2 ���� ����
		
		boolean result = num1 != num2 ; // ���� 2���� ���� �ٸ��� true
		System.out.println("ù��° �� : " + num1);
		System.out.println("�ι�° �� : " + num2);
		System.out.println("�� ��� : " + result);
	}

	public static void practice5() {
		// �Է��� ���� ��� ������ true, �ƴϸ� false
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.print("����° ���� �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		
		boolean and = (num1 == num2) && (num2 == num3);
		//         num1 �� num2 �� ���� �� && num2 �� num3 �� ���� ��
		//                             true
		// && ampersand �Ǵ� and ��� �д´�.
		//  ����1  &&  ����2  = 
		// (true) && (true) = true
		// (true) && (false) = false
		// (false) && (true) = false
		// (false) && (false) = false
		boolean isOR = (num1 == num2) || (num2 == num3);
		// || vertical bar �Ǵ� or ��� �д´�.
		// | �� Shift Ű�� \ Ű�� ������ ���´�.
		//   ����1 || ����2 = 
		// (true) || (false) = true
		// (false) || (true) = true
		// (true) || (true) = true
		// (false) || (false) = false
		System.out.println("ù��° �� : " + num1 + ", �ι�° �� : " + num2 + ", ����° �� : " + num3);
		System.out.println("and ��� : " + and);
		System.out.println("isOR ��� : " + isOR);
		
	}
}