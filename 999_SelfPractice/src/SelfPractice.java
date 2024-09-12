import java.util.Scanner;

public class SelfPractice {
	
	public static void main(String[] args) {
	
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice44();
		//practice5();
		//practice6();
		//practice7();
		//practice8();
		//practice9();
		practice10();
		
	}
	
	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� ���� �� ����Դϱ�? : ");
		int people = sc.nextInt();
		System.out.print("���� ������ �� ��Դϱ�? : ");
		int candies = sc.nextInt();
		System.out.println("�׷��ٸ� 1�δ� �����ϰ� �������� ������ ������ ��Դϱ�? : ");
		int perPerson = candies / people;
		int remain = candies % people;
		System.out.println(perPerson + "���Դϴ�.");
		System.out.println("�׷��ٸ� ���� ������ ������ ��Դϱ�?");
		System.out.println(remain + "���Դϴ�.");
		
	}

	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ� �Է��ϼ���) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ� �Է��ϼ���) : ");
		int classNum = sc.nextInt();
		System.out.print("��ȣ(���ڸ� �Է��ϼ���) : ");
		int num = sc.nextInt();
		System.out.print("����(M/F) : ");
		String gender = sc.next();
		System.out.print("���� : ");
		double score = sc.nextDouble();
		
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + classNum);
		System.out.println("��ȣ : " + num);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + score);
	}
	
	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int korean = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int english = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double average = (double) total / 3.0;
		
		System.out.println("���� ������" + korean + " �� �Դϴ�.");
		System.out.println("���� ������" + english + " �� �Դϴ�.");
		System.out.println("���� ������" + math + " �� �Դϴ�.");
		System.out.println("�� ������" + total + " �� �Դϴ�.");
		System.out.printf("��� ������ %.2f �� �Դϴ�.\n" , average);
		// printf �� %.2f �� ���� + �ʿ���� " " �ȿ� ���� �ۼ��ص� �ȴ�.
	}

	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		boolean result = (num1 == num2);
		
		System.out.println("�� ��� : " + result);
	}

	public static void practice44() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		boolean result = num1 != num2 ;
		System.out.println("ù��° ���� : " + num1);
		System.out.println("�ι�° ���� : " + num2);
		System.out.println("�� ��� : " + result);
	}

	public static void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.print("����° ������ �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		
		boolean and = (num1 == num2) && (num2 == num3);
		boolean isOR = (num1 == num2) || (num2 == num3);
		
		System.out.println("ù��° �� : " + num1 + " , �ι�° �� : " + num2 + ", ����° �� : " + num3);
		System.out.println("and ��� : " + and);
		System.out.println("isOR ��� : " + isOR);
		
	}

	public static void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if((num > 0) && (num % 2 == 0)) {
			System.out.println("¦���Դϴ�.");
		}
		
		else if((num > 0) && (num % 2 == 1)) {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		else {
			System.out.println("����� �Է����ּ���.");
		}
		
	}

	public static void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int korean = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int english = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = sc.nextInt();
		
		System.out.println("���� ���� : " + korean);
		System.out.println("���� ���� : " + english);
		System.out.println("���� ���� : " + math);
		
		int sum = korean + english + math;
		System.out.println("�հ� ���� : " + sum);
		double avr = (double) sum / 3.0;
		System.out.printf("��� ���� : %.2f " , avr);
		
		if((korean >= 40) && (english >= 40) && (math >= 40) && (avr >= 60)) {
			System.out.println("\n�����մϴ�, �հ��Դϴ�!");
		}
		
		else {
			System.out.println("���հ��Դϴ�.");
		}
		
		
		
	}

	public static void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		String result;
		System.out.printf("BMI ���� : %.2f\n" , BMI);
		// printf �� �������� \n �̳� println �� �ۼ��Ͽ� �ٹٲ��� ���־�� �Ѵ�.
		
		if((BMI<18.5) && (BMI>0)) {
			result = "��ü��";
		} else if((BMI>=18.5) && (BMI<23)) {
			result = "����ü��";
		} else if((BMI>=23) && (BMI<25)) {
			result = "��ü��";
		} else if((BMI>=25) && (BMI<30)) {
			result = "��";
		} else if(BMI>=30) {
			result = "����";
		} else {
			result = "�߸��� �Է�";
		}
		System.out.println(result + " �Դϴ�.");
		// String �� ����Ͽ� System.out.print ���� ��ü�Ͽ��� ���,
		// �� �޼ҵ� �ȿ��� String ������ ��� System.out.print �� ��ü�� ���Ͽ�
		// �ϳ��� ���� ���� String ���� ������ ������ ����� �־�� �Ѵ�. 
	}
	
	public static void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ������ �Է��ϼ��� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻ ��� ������ �Է��ϼ��� : ");
		int fin = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int asm = sc.nextInt();
		System.out.print("�⼮ �ϼ��� �Է��ϼ��� : ");
		int att = sc.nextInt();
		
		System.out.println("========== ��� ==========");
		
		double midScore = (double) mid * 0.2;
		System.out.printf(": %.2f��\n" , midScore);
	}

	public static void practice10() {
		/*
		 Ű����� 2���� ������ ���� ��ȣ�� �Է��Ͽ�, 
		 ���� ��ȣ�� ���� ���� ��� ����ϱ� 
		 (2���� ���� ��� ����϶��� �۵��ϸ�, 
		 ������ �������� ���� ���� ��ȣ�� �Է��Ͽ��� ���
		 "�߸� �Է��߽��ϴ�." ���
		 */
		Scanner sc = new Scanner(System.in);
		double result;
		System.out.print("����� ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		if(num1 > 0) {
			System.out.print("���� ��ȣ +, -, *, /, % �� �ϳ��� �Է��ϼ��� : ");
			char sign = sc.next().charAt(0);{
				switch(sign) {
				case '+' : case '-' : case '*' : case '/' : case '%' :  
					System.out.println("����� �ι�° ������ �Է��ϼ��� : ");
					int num2 = sc.nextInt();
					break;
					switch() {}
				default : 
					System.out.println("�߸��� �Է��Դϴ�.");
					return;
				}
			}
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		
		System.out.println("\nù��° �� : " + num1 + " " +
				   sign + " �ι�° �� : " + 
				   num2 + "\n�� ������� " +
				   num1 + sign + num2 + 
				   " = " + result + " �Դϴ�.");
		
		/*double result;
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
			case '/' :
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
		}*/
	}
	
}