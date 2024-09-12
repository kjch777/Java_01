package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date; // �׻� .util �� �⺻

public class DatePre {

	public static void main(String[] args) {
		
		// SimpleDateFormat Ȱ���Ͽ� ��¥ �����
		
		// 1. yyyy-MM-dd
		SimpleDateFormat ��¥ = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String ���ڷε����ͺ��� = ��¥.format(date); 
		System.out.println(���ڷε����ͺ���);
		
		// 2. HH:mm:ss
		SimpleDateFormat �ð� = new SimpleDateFormat("HH:mm:ss");
		// Date date = new Date(); �� �Ἥ import ���� ���൵ �ȴ�.
		String ���ڷε����ͺ���2 = �ð�.format(new Date()); // �׷��� ���ָ� .format(date); �� �� �� �ִ�.
		System.out.println(���ڷε����ͺ���2);
		
		// 3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat ��¥�ð� = new SimpleDateFormat("yyyy-MM-dd // HH:mm:ss");
		String ���ڷε����ͺ���3 = ��¥�ð�.format(new Date()); // date �� �� ���� �ҷ����� ���� �������� �ٲ㰡�鼭 �� �� �ʿ䰡 ����.
		System.out.println(���ڷε����ͺ���3);
		
		// 4. SimpleDateFormat E �� ���� ��Ÿ����
		SimpleDateFormat ��¥�ð�2 = new SimpleDateFormat("EEEE");
		String ���ڷε����ͺ���4 = ��¥�ð�2.format(new Date()); 
		System.out.println(���ڷε����ͺ���4);
	}

}
