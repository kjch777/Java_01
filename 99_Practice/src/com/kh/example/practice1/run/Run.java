package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	// ���� �޼��� : ���������� �����ϰų� ����ϴ� �޼���
	public static void main(String[] args) {
		// �ٸ� class �� �ҷ������� == ��ü�� �����Ϸ���
		Member ��� = new Member(); 
// class�� ���ο� ������ = new class�� (); �� �ۼ��� ��, import ���� ����,
		���.changeName("���׶��"); // �̸� ���� ����
		
		���.printName();
// ���ο� ������ . �ҷ��� �޼��� �̸� (); �� �ۼ����ش�. 
	}

}

// �ȿ� ��� ���� ������� ������ null �� ��µȴ�.