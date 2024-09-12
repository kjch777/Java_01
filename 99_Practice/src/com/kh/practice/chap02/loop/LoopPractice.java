package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void Greeting() {
		System.out.println("�ȳ��ϼ���.");
		// Greeting : �ȳ��ϼ��� �λ縦 ����ϴ� �޼���
	}
	
	public void Greeting2() {
		System.out.println("�ݰ����ϴ�.");
		// Greeting2 : �ݰ����ϴ� �λ縦 ����ϴ� �޼���
	}
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
			return;
		} 
		
		for(int i = 1; i<=num; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // �������� �ٹٲޱ��� �Ϸ��� �̷��� �ۼ��ϸ� �ȴ�.
	}
	
	public void practice2() {
		// 1 �̸��� ���ڰ� �Է� �ƴٸ�,
		// 1 �̻��� ���ڸ� �Է� ���ּ��� �� ��µǸ鼭
		// ����ڰ� ���� �ٽ� �Է� �ϵ��� �����
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("���ڸ� �Է� �ϼ��� : ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է� �ϼ���");
			} else {
				break;
			}
		}

		// 1 ���� �Է��� �� ������ ���ڵ��� ���� ����ϰ� �ʹٸ�
		System.out.println("1���� " + num + " ������ ���ڵ��Դϴ�.");
		int i =1;
		while(i <= num) {
			System.out.print(i + " ");
			i++; // ++ �� = ���� ���� �������� �ʾ��� �� �տ� �ֵ� �ڿ� �ֵ� ��� ����.
		}
		System.out.println();
	}

	public void practice3() {
		// ����ڷκ��� �� ���� ���ڸ� �Է� �޾�
		// 1 ���� �Է� ���� ���ڱ����� ��� ���ڸ� �Ųٷ� ��� �غ���
		// ��, �Է� ���� ���ڴ� 1 ���� ũ�ų� ���ƾ� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		int num; // �̷��Ը� �����صδ� �͵� ����
		System.out.println("======= practice 3 ���� =======");
		
		while(true) {
			System.out.print("���ڸ� �Է� �ϼ��� : ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է� �ϼ���");
			} else {
				break;
			}
		}
		
		System.out.println(num + " ���� " + "1 ������ ���ڵ��� �Ųٷ� ��� �մϴ�. ");
		
		while(num >= 1) {
			System.out.print(num + " ");
			num--; // Ű����� �Է� ���� ���ڷκ��� -1 �� �ϸ鼭 1�� �� ������ ���
		}
		
		System.out.println();
		
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int num; // practice4 �� �̶�� ��𼭵� num �� �� �� �ֵ���, practice4 �� �ֻ�ܿ� ����� ��.
		do { // do-while : ������ ���� �ƴϾ, ���� 1ȸ�� ������ ���� �Ѵ�.
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			// 1 �̸��� ���ڰ� �ԷµǸ�
			if (num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
				// do �� ���� ���ǿ� ������� ������ 1ȸ�� ����Ǳ� ������,
				// return �̳� break �� ���� �ۼ������� �ʾƵ� �� ��찡 ����.
			}
		} while (num > 1);
		// ���� ���ڰ� 1 ���� Ŀ�� �Ʒ��� �����´ٸ�
		// num ���� 1 ���� �Ųٷ� ����ϴ� for �� �ۼ��ϱ�
		for(int i = num; i >= 1; i--) { // int i = num; ����
			System.out.print(i + " ");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է� �ϼ��� : ");
		int num = sc.nextInt();
		
		int result = 0;
		
		// ������ ��������, 1���� �Էµ� ������ ���ؼ� ���� ���ϱ�
		for(int i = 1; i <= num; i++) {
			result += i;
			// result += i; : result = result + i : 0 = 1
			
			// �������� ���� ���� ����ϱ�
			if(i < num) {
				System.out.print(i + " + ");
			} else { // i >= num
				System.out.print(i + " = ");
			}
		}
		System.out.print(result);
	}

	public void practice7() {
		/*
		 ����ڷκ��� 2���� ���� �Է¹޾�, �� ������ ���� ����ϱ�
		 ���� 1 �̸��� ���ڰ� �Էµƴٸ�, 1 �̻��� ���ڸ� �Է��ϼ��� ����ϱ�
		 ����ڰ� �ٽ� ���� �Է��ϰ� �ؼ� ����ϱ� 
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
			int num1 = sc.nextInt();
			System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
			int num2 = sc.nextInt();
			
			// ���� ù��° ���ڿ� �ι�° ���� ��� 1 ���� ũ�ų� ���� ���
			if((num1 >= 1) && (num2 >= 1)) {
				// 2���� ���� ���ؼ� �ּҰ�, �ִ밪 ���ϱ�
				int min = Math.min(num1, num2); 
				// Math(����)���Ͽ��� �ּҰ��� ã�� min �� ����Ͽ�, ��ǻ�Ͱ� �˾Ƽ� ���ϰ� �ּҰ��� ���ϰ� �ϱ�
				int max = Math.max(num2, num1); // �Ұ�ȣ ( ) ���� ���� ������ �ٲ� �������.
				// Math.random ���� Random �� �ִ� ���� ����� �� ������������, �� �� ����ϴ� ������ ū ���̰� ����.
				
				for(int i = min; i <= min; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
			}
			
		}
		
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		char sign; // String �� ����ص� �����ϴ�.
		
		while(true) {
			System.out.println("(���α׷� ���Ḧ ���� ��� x �� �Է� �ϼ���)");
			System.out.print("���� ��ȣ�� �Է� �ϼ��� (+ - * / %) : ");
			sign = sc.next().charAt(0);
			if(sign == 'x') { 
				// .equals �� ���ڿ��� ���� �� ����ϱ� ������, String ���� ����Ѵ�.
				// char �� ����� ��쿡�� == != ���
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			// ���� 1�� ���� 2�� �Է� �޾Ƽ� ����ϱ�
			System.out.print("���� 1 : ");
			num1 = sc.nextInt();
			System.out.print("���� 2 : ");
			num2 = sc.nextInt();
			// ���� 1�� ���� 2 �� ���� ��� ��� ���
			int ���; // ������ ������ ���� �ѱ��� ����ص� �����ϴ�.
			if(sign == '+') {
				��� = num1 + num2;
			} else if (sign == '-') {
				��� = num1 - num2;
			} else if (sign == '*') {
				��� = num1 * num2;
			} else if (sign == '/') {
				//�� �� 0 ���� ���� �� ���� ������, ���� 2 �� 0 �� �� �� ����.
				if(num2 == 0) {
					System.out.println("0 ���� ���� �� �����ϴ�.");
				}
				��� = num1 / num2;
				
			} else if (sign == '%') {
				// �������� 0 ���� ���� �� ���� ������ ���� 2 �� 0 �� �� �� ����.
				if(num2 == 0) {
					System.out.println("0 ���� ���� �� �����ϴ�.");
				}
				��� = num1 % num2;
				
			} else {
				System.out.println("�߸��� �Է� �Դϴ�.");
				continue;
			}
			System.out.println(num1 + " " + sign + " " + num2 + " = " + ���);

		}
		
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		// ����		���� : i		���� : j
		for(int i = 1; i <= num; i++) {
			// 1 �ٿ� 1 ��	2 �ٿ� 2 ��	3 �ٿ� 3 �� ... num �ٿ� num ��
			for(int star = 1; star <= i; star++) {
				System.out.print("* ");
			}
			// �ٹٲ��� ���� Enter �� ������ ���ηθ� ��µǱ� ������
			System.out.println(); // �� �־��ش�.
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i >= 1; i++) { // ; �� for �� �Ұ�ȣ ( ) �ȿ��� 2���� ��� ���� 
			for(int star = num; star <= i; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int size = sc.nextInt();
		
		// line �� ���� ���� ��ȣ�� ��Ÿ��
		for(int line = 0; line < size; line++) {
			// blank �� ������ ����ϱ� ���� for ��
			// line ��° �ٿ����� line ���� ������ ����ϰڴ�.
			for(int blank = 0; blank < line; blank++) {
				System.out.print("  ");
			}
			// star �� ���� ����ϱ� ���� for ��
			// line ��° �ٿ����� size - line ���� ���� ���
			// �ι�° �ٺ��� size - line
			for(int star = size; star > line; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
