import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		
		// ����ڿ��� �Է¹��� ������ ����
		// Scanner�� �̿��ؼ� �Է¹��� ������ ��ǻ�Ϳ� ǥ������
		// System.in �� ����ؼ� Ű���� �Է��� �о�ö� ���
		// Scanner �� �ڷ��� �ڸ��� int, String, �Ǽ� boolean ����
		// Ȯ����� ��Ÿ�� �� ���� ������ �ʱ⿡�� Scanner ��� ���
		// nextLine() : ���� �Ǵ� ���͸� ġ�� �������� ���� ��ü�� �Է� �޴´�.
		// �Էµ� ���ڸ� ��� �� �����´�. (����, Ư������ ��� ��� �� ������)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.print("������� ��� ���� �Է��ϼ��� : ");
		String live = sc.nextLine();
		System.out.println(live);
		
		System.out.print("������� ��ȭ ��ȣ�� �Է��ϼ��� : ");
		String phoneNumber = sc.nextLine();
		System.out.println(phoneNumber);
		
		// Scanner String�� ����ؼ�
		// ������� height, ������� age, ������� nickName�� �Է¹ޱ�
		// . : ���� ��� ����
		//Scanner ���� sc ��� ���� ��
		
		System.out.print("������� Ű�� �Է��ϼ��� : ");
		String height = sc.nextLine();
		System.out.println(height);
		
		System.out.print("������� ���̸� �Է��ϼ��� : ");
		String age = sc.nextLine();
		System.out.println(age);
		
		System.out.print("������� �г����� �Է��ϼ��� : ");
		String nickName = sc.nextLine();
		System.out.println(nickName);
		
		sc.close();
		
	}

}
