package com.kh.ExceptionEx;

public class ExceptionPre {

	// ���� - ���� ��� �� ����
	public static void main(String[] args) {

		try { // ���ܰ� �߻��� ���� ������, �ϴ� �����Ű��
			int �������� = 10 / 0;
			System.out.println(��������);

			//   �������     Exception   ������
		} catch (ArithmeticException ������ܹ߻�) {
			System.out.println("��� ������ �߻� �߽��ϴ�.");
		}

	 // try ����Ű : try �ۼ� �� Ctrl + Space
		try { 
			// ���ܰ� �߻��� ���� ������, �ϴ� �õ��غ��� ���� �ڵ� �ۼ�
			int[] �迭 = {1, 2, 3};
			//   index   0  1  2 // ����, [ ] �ȿ��� 0 1 2 �� �� �� �ִ�.
			System.out.println(�迭[3]);

		} catch (Exception e) {
			System.out.println("������ ������ϴ�.");
		}
	}

}
