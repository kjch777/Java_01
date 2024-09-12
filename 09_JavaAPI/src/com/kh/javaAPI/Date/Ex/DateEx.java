package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date; // �׻� .util �� �⺻�̴�.
import java.util.GregorianCalendar;

/*
              Date : Ư�� ��¥�� �ð��� ��Ÿ���� Ŭ����
          Calendar : ��¥�� �ð��� �����ϴ� ���� ���Ǵ� �߻� Ŭ���� 
 GregorianCalendar = �׷������� ����Ͽ� ��¥�� �ð��� ����ϴ� ���� ����Ѵ�.
  SimpleDateFormat = ��¥�� �ð��� �������� �����ְ� �װ��� ����ϴ� ���� ����Ѵ�.
         LocalDate  
               KST = Korean Standard Time
 */
public class DateEx {
	
	public static void main(String[] args) {
		
		// 1. Date
		Date ���絥��Ʈ = new Date();
		System.out.println(���絥��Ʈ);
		
		// 2. Calendar
		Calendar Ķ���� = Calendar.getInstance();
		// Ķ�������� �� �� �� ��������
		int �� = Ķ����.get(Calendar.YEAR);
		int �� = Ķ����.get(Calendar.MONTH); // 0������ �������� ������ +1�� ���־�� �Ѵ�.
		int �� = Ķ����.get(Calendar.DAY_OF_MONTH);
		System.out.println("���� ��¥ : " + �� + "/" + (�� + 1) + "/" + ��);
		
		/*
		 3. GregorianCalendar
		 �׷����� �޷��� 1�� 1�� 1���� ������ �����Ϸ� ���ǵǾ� �ִ�.
		 2024, 4, 23 �� ������, �ڵ����� 2024�� 5�� 23�Ϸ� ����ȴ�.
		 2024�� 5�� 23���� ����� 
		 */ 
		// GregorianCalendar �׷�����1 = new GregorianCalendar(); ��� �ᵵ �ȴ�.
		GregorianCalendar �׷�����2 = new GregorianCalendar(2024, 4, 23); // �Ͽ����� 1��, ������� 7���̴�.
		int ��¥ = �׷�����2.get(Calendar.DAY_OF_WEEK); // 2024�� 5�� 23���� ������̱� ������ 5��� ������ ���̴�.
		System.out.println("��¥ : " + ��¥);
		
		/*
		 4. SimpleDateFormat
		 �� : y == year
		 �� : M == Month (ù ���ڰ� m ���� �а� ���� ������, ���� �빮�� M �� ����Ѵ�.)
		 �� : d == day
	    ���� : E == ������ E �� ǥ�����ڰ� ���� ǥ��ȭ �ⱸ���� ����Ͽ���.
	    		  ���� O���� �� ����ϰ� �ʹٸ� EEEE ��� ���� �ȴ�.
		 �� : H == Hour  (H : 0 ~ 23 ��	h : ����(am)�� ����(pm)�� ������ ǥ��)
		 �� : m == minute
		 �� : s == second
		 
		                                              �� �� �ϸ� �����ְ� ���� ��
		 */
		SimpleDateFormat ��¥���� = new SimpleDateFormat("yyyy-MM-dd");
		String ��¥ǥ�� = ��¥����.format(new Date());
		System.out.println("��¥���� �����ؼ� ǥ���ϱ� : " + ��¥ǥ��);
		
		// 5. LocalDate ���� ��¥ ��������
		LocalDate ������¥ = LocalDate.now();
		System.out.println("���� ��¥ : " + ������¥);
				
	}

}
