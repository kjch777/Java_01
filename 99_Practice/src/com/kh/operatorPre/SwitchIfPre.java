package com.kh.operatorPre;
	/*
	ǥ���
	�ڵ带 �ۼ��Ҷ� ������ ��, �ڵ带 ���� ���ϰ� �ϱ� ���Ͽ� �ۼ��ϴ� ǥ����� �ִ�.

		������ũ ���̽�(snake_case)
		������ ����� _ �� ����ִ� ǥ�������, ��ó�� ����ٰ� �Ͽ� �ٿ��� �̸�
		one_two_three	gender_code
	
		�Ľ�Į ���̽�(PascalCase)
		ù�ܾ��� ù���ڿ� �����ܾ��� �߰����ڸ� �빮�ڷ� ����ϴ� ǥ�����
		OneTwoThree		GenderCode
	
		ī�� ���̽�(camelCase)
		ù��° �ܾ��� ù���ڴ� �ҹ���, ���� �ܾ��� ù���ڴ� �빮�ڷ� �����ϴ� ǥ�����
		oneTwoThree		genderCode
	
		�ɹ� ���̽�(kebab-case)
		�ܾ� ���̿� ��� - �� ����Ͽ� �������� �ۼ��ϴ� ǥ�����
		one-two-three	gender-code
	
	Window �� Preferences �� General �� Editors �� Text Editors �� Spelling ��
	Encoding: �� Other: �� UTF-8 �� �ѱ�
	Window �� Preferences �� General �� Content Types ��
	Text �� ...
	Window �� Preferences �� General �� Workspace �� ...
	*/
import java.util.Scanner;

public class SwitchIfPre {

	public static void main(String[] args) {
		
		//practice8();
		//castingPractice1();
		//castingPractice3();
		//controlPractice1();
		//controlPractice10();
		//controlPractice5();
		//controlPractice6();
		controlPractice8();
	}
	
	public static void practice8() {
		// �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����ؼ� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		String idNumber = sc.next();
		
		char genderCode = idNumber.charAt(7);
		// �ֹι�ȣ ���ڸ��� ù��° ���ڸ� ������ �ͼ� ������ �Ǻ�
		// 00���00����00�ϻ�-1000000
		// charAt(7��° �ڸ��� ���� ������ ����)
		// charAt �� ����, ���� ������� ���� �ڸ����� ����.
		// �ֹ�-��ȣ - �����ؼ� 7��° �ڸ�
		// - �����ϰ� ���ڸ� �Է��Ѵٸ� 6��° �ڸ��� �ִ� ���� ������ �;� �Ѵ�.
		String gender; // ���߿� �������� �������� Ȯ�ΰ���� �����ٶ� ���
		
		if((genderCode == '1') || (genderCode == '3')) {
			gender = "����"; // ���� 1�̳� 3�� ���´ٸ� ����
						    // " " ū ����ǥ�� String �� ����ϰ�, 
							// ' ' ���� ����ǥ�� char �� ����Ѵ�.
		} else if((genderCode == '2')||(genderCode == '4')) {
			gender = "����"; // ���� 2�� 4�� ���´ٸ� ����
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
			// gender �� ���⿡�� �Է��ϰų�
			return;
			// else ���� ���������� return �� ����Ѵ�.
		}
		System.out.println("�Է��� �ֹι�ȣ�� " + gender + " �Դϴ�.");
		// �������� ���������� ���� ��� ���
	}

	
	public static void castingPractice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char inputChar = sc.next().charAt(0);
		
		int unicode = inputChar; // char 2byte
		// �����ڵ�� ���			 // int 4byte

		System.out.println("�Է��� ���� '" + inputChar + "' �� �����ڵ�� '" + unicode + "' �Դϴ�.");
		// �����ڵ�� �� ������ ��� ���ڳ� ���ڸ� ��ǻ�Ϳ��� �ϰ��ǰ� ǥ�����ֱ� ���� ���
		// ���ڿ� ���ڸ� �ٿ��� ��ǻ�Ͱ� ���� �� �ֵ��� ���ִ� ���
		
	}

	
	public static void castingPractice3() {
		// �־��� �ڵ忡�� �� ĭ�� ä���, ��� ����� �������� �����
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f; // �⺻���� double �̱� ������, float �� �������ִ� f �� ���� �ڿ� �ٿ��ش�.
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // �����⸦ �ؼ� ���� 2�� ������
		System.out.println((int) dNum); // �Ǽ� double �� �Ǿ� �ִ� ���� ���� int �� ����
		// double 8byte		int 4byte
		// double �� �� ũ�Ƿ�, ���� ����ȯ�� �ϰڴٴ� ǥ�� (int) �� �ۼ��Ѵ�.
		System.out.println(iNum2 * dNum); // 10.0
		// ���� ���� ū ���� ������, �ڵ����� ū ������ ����Ǳ� ������, (double) �� �ʼ��� �ƴϴ�.
		System.out.println((double) iNum1); // 10.0
		System.out.println((double) iNum1 / iNum2); // 2.5; ������ �� �Ǽ���
		System.out.println(dNum); // 2.5
		System.out.println((int) fNum); // 3 �Ǽ��� �� ������
		System.out.println((int) (iNum1 / fNum)); // �����⸦ �ؼ� ���� 3�� ������
		// int �� float �� ���� ũ���� byte �̹Ƿ�,
		// �տ� () �� �ۼ��Ͽ� ���������� �Ǽ������� ǥ���� �־�� �Ѵ�.
		System.out.println((double) iNum1 / fNum); // 3.3333333
		// float �� �Ҽ��� ���� 6�ڸ� ������ �����ش�.
		System.out.println((double) iNum1 / fNum); // 3.33333333333333335
		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println(ch  + iNum1); // 75
		// 'A' ���� (int)ch �� ����ؼ� 65 ��°� �� �� �ִ�.
		// ū byte ���� ���� byte ���� ������, �ڵ����� ū byte ���� �������.
		// 65 + (int iNum1 = 10) = 75
		System.out.println((char) (ch + iNum1)); // 'K'
		// (char) �� ����ϸ� ���ڸ� ���ڷ� ġȯ�Ͽ� ����� �� �ִ�. 
	}

	
	public static void controlPractice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		System.out.print("���Ͻô� �޴��� ��ȣ�� �Է��ϼ��� : ");
		int menuNumber = sc.nextInt(); 
		
		switch (menuNumber) {
		case 1 : 
			System.out.println("�Է� �޴� �Դϴ�.");
			break;
		case 2 : 
			System.out.println("���� �޴� �Դϴ�.");
			break;
		case 3 : 
			System.out.println("��ȸ �޴� �Դϴ�.");
			break;
		case 4 : 
			System.out.println("���� �޴� �Դϴ�.");
			break;
		case 7 : 
			System.out.println("���α׷��� �����մϴ�.");
			break;
		default : 
			System.out.println("�߸��� �޴� ��ȣ�Դϴ�.");
		}
	}

	
	public static void controlPractice10() {
		// System.out.print ���� ����� ������ �������
		// �ٹٲ����� ���� �ۼ��ϰ� �ʹٸ� : \n
		// Ű���� �Է��ϴ� ��ġ�� ���� ���� ó������ �̵���Ű�� �ʹٸ� : \r
		// System.out.print();
		// + �� ); �� �ٿ��� ������ �ʴ� ��, ���� �ٲ㵵 ��� �̾ �ۼ��� �� �ִ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Ŵ��� ����\n"
						  + "2. ¦��/Ȧ��\n"
						  + "3. �հ�/���հ�\n"
						  + "4. ����\n"
						  + "5. �α���\n"
						  + "6. ���� Ȯ��\n"
						  + "7. BMI\n"
						  + "8. ����\n"
						  + "9. P/F");
		System.out.println("�����ϰ� ���� ����� ���ڸ� �Է��ϼ��� : ");
		int menuNumber = sc.nextInt();
		
		switch (menuNumber) {
		case 1 : 
			System.out.println("1. �Ŵ��� ����");
			break;
		case 2 : 
			System.out.println("2. ¦��/Ȧ��");
			break;
		case 3 : 
			System.out.println("3. �հ�/���հ�");
			break;
		case 4 : 
			System.out.println("4. ����");
			break;
		case 5 : 
			System.out.println("5. �α���");
			break;
		case 6 : 
			System.out.println("6. ���� Ȯ��");
			break;
		case 7 : 
			System.out.println("7. BMI");
			break;
		case 8 : 
			System.out.println("8. ����");
			break;
		case 9 : 
			System.out.println("9. P/F");
			break;
		default : 
			System.out.println("�߸��� �Է��Դϴ�.");
		} 
		
	}

	public static void controlPractice5() {
		// ! �� Ư�� ������ �����ϴ� ���� ����Ѵ�.
		// inputId.equals(userId) :  inputId �� userId �� ���� ���� �� ��
		// !inputId.equals(userId) : �� �տ� ! �� ������
		//                           inputId �� userId �� ���� �ٸ� �� ��
		
		Scanner sc = new Scanner(System.in);
		String userId = "myId";
		String userPw = "myPassword12";
		
		System.out.print("���̵� �Է��ϼ��� : ");
		String inputId = sc.next(); // next �� ���� �������� �ν�
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String inputPw = sc.next(); // nextLine �� ���� �ᵵ ���� �ν�
		
		if((inputId.equals(userId)) && (inputPw.equals(userPw))) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		} else if (!inputId.equals(userId)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else if (!inputPw.equals(userPw)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		
		
	}

	public static void controlPractice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ����� �Է��ϼ���\n"
						  + "������\n"
						  + "ȸ��\n"
						  + "��ȸ��\n"
						  + "��� �Է� : ");
		String userRole = sc.next(); // Role : �����̳� ��Ģ�� �����Ҷ� �ַ� ���� ������
		System.out.println("�ش� ������� ��� ���� : ");
		
		switch(userRole) {
		case "������" : 
			System.out.println("- ȸ�� ���� \n" 
							 + "- �Խñ� ���� \n"
							 + "- �Խñ� �ۼ� \n"
							 + "- �Խñ� ��ȸ \n"
							 + "- ��� �ۼ� \n");
			break;
		case "ȸ��" : 
			System.out.println("- �Խñ� �ۼ� \n"
							 + " - �Խñ� ��ȸ \n"
							 + "- ��� �ۼ� \n");
			break;
		case "��ȸ��" : 
			System.out.println("- �Խñ� ��ȸ");
			break;
		default : 
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
	
	public static void controlPractice8() {
		/*
		 Ű����� 2���� ������ ���� ��ȣ�� �Է��Ͽ�, 
		 ���� ��ȣ�� ���� ���� ��� ����ϱ� 
		 (2���� ���� ��� ����϶��� �۵��ϸ�, 
		 ������ �������� ���� ���� ��ȣ�� �Է��Ͽ��� ���
		 "�߸� �Է��߽��ϴ�." ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("���� ��ȣ +, -, *, /, % �� �ϳ��� �Է��ϼ��� : ");
		char sign = sc.next().charAt(0);
		System.out.print("����� �ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		double result;
		if((num1 > 0) && (num2 > 0)) {
			switch(sign) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' : // / % �� 0 ���� ���� �� ���� ������, 
				       // if ������ ���� 0 �� �� ��츦 ���� ó���� ���� ���־�� �Ѵ�. 
					   // ������ ���� ó������ if �� ������� ������ ������� �� ����...
				result = num1 / num2;
				break;
			case '%' : 
				result = num1 % num2;
				break;
			default : 
				System.out.println("�߸��� �Է��Դϴ�.");
				return;
			}
			System.out.println("\nù��° �� : " + num1 + " " +
							   sign + " �ι�° �� : " + 
							   num2 + "\n�� ������� " +
							   num1 + sign + num2 + 
							   " = " + result + " �Դϴ�.");
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

}
