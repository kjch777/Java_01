package com.kh.practice.chap02.run;

import java.util.Scanner;

import com.kh.practice.chap02.loop.LoopPractice;
// import : �������ڴٴ� ��	�� ���� ��ġ	. ���� �ȿ� �ִ� ���ϸ�;

public class Run {
	// �� ���� �����ϴ� ���� �޼���
	public static void main(String[] args) {
		// ��� ���� Ŭ�������� ���� ���� �� �޼��� �̸��� �ۼ�
		// �޼����, Ư�� ����� ���� �� �� �ֵ��� ����� �ۼ��� �����̴�.
		// static �� ���� �����ϴ�. �׷� static �� ����� ��������...
			 Scanner sc = new Scanner(System.in);
		LoopPractice LP = new LoopPractice();
		// LoopPractice �� �ִ� Greeting �� �����ͼ� ����Ϸ���,
		// Scanner �� ����ߴ� ��ó�� LoopPractice �� new �� ������ �ͼ�
		// LoopPractice �ؿ� �ִ� Greeting �� ��ȯ�ؾ� �Ѵ�.
		
		//LP.Greeting();
		//LP.Greeting2();
		//LP.practice2();
		//LP.practice3();
		//LP.practice12();
		//LP.practice13();
		//LP.practice14();
		LP.practice15();
		
	}

}
