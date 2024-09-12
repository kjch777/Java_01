package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date; // 항상 .util 이 기본이다.
import java.util.GregorianCalendar;

/*
              Date : 특정 날짜와 시간을 나타내는 클래스
          Calendar : 날짜와 시간을 조작하는 데에 사용되는 추상 클래스 
 GregorianCalendar = 그레고리력을 사용하여 날짜와 시간을 계산하는 데에 사용한다.
  SimpleDateFormat = 날짜와 시간을 형식으로 보여주고 그것을 출력하는 데에 사용한다.
         LocalDate  
               KST = Korean Standard Time
 */
public class DateEx {
	
	public static void main(String[] args) {
		
		// 1. Date
		Date 현재데이트 = new Date();
		System.out.println(현재데이트);
		
		// 2. Calendar
		Calendar 캘린더 = Calendar.getInstance();
		// 캘린더에서 년 월 일 가져오기
		int 년 = 캘린더.get(Calendar.YEAR);
		int 월 = 캘린더.get(Calendar.MONTH); // 0월부터 가져오기 때문에 +1을 해주어야 한다.
		int 일 = 캘린더.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재 날짜 : " + 년 + "/" + (월 + 1) + "/" + 일);
		
		/*
		 3. GregorianCalendar
		 그레고리안 달력은 1년 1월 1일이 무조건 월요일로 정의되어 있다.
		 2024, 4, 23 을 넣으면, 자동으로 2024년 5월 23일로 변경된다.
		 2024년 5월 23일은 목요일 
		 */ 
		// GregorianCalendar 그레고리안1 = new GregorianCalendar(); 라고 써도 된다.
		GregorianCalendar 그레고리안2 = new GregorianCalendar(2024, 4, 23); // 일요일이 1번, 토요일이 7번이다.
		int 날짜 = 그레고리안2.get(Calendar.DAY_OF_WEEK); // 2024년 5월 23일이 목요일이기 때문에 5라고 나오는 것이다.
		System.out.println("날짜 : " + 날짜);
		
		/*
		 4. SimpleDateFormat
		 년 : y == year
		 월 : M == Month (첫 글자가 m 으로 분과 같기 때문에, 월은 대문자 M 을 사용한다.)
		 일 : d == day
	    요일 : E == 요일은 E 로 표기하자고 국제 표준화 기구에서 약속하였다.
	    		  만약 O요일 로 출력하고 싶다면 EEEE 라고 쓰면 된다.
		 시 : H == Hour  (H : 0 ~ 23 시	h : 오전(am)과 오후(pm)로 나눠서 표기)
		 분 : m == minute
		 초 : s == second
		 
		                                              년 월 일만 보여주고 싶을 때
		 */
		SimpleDateFormat 날짜형식 = new SimpleDateFormat("yyyy-MM-dd");
		String 날짜표시 = 날짜형식.format(new Date());
		System.out.println("날짜형식 지정해서 표시하기 : " + 날짜표시);
		
		// 5. LocalDate 현재 날짜 가져오기
		LocalDate 지역날짜 = LocalDate.now();
		System.out.println("지역 날짜 : " + 지역날짜);
				
	}

}
