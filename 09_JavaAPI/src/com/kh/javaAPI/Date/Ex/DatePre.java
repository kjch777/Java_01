package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date; // 항상 .util 이 기본

public class DatePre {

	public static void main(String[] args) {
		
		// SimpleDateFormat 활용하여 날짜 만들기
		
		// 1. yyyy-MM-dd
		SimpleDateFormat 날짜 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String 글자로데이터변경 = 날짜.format(date); 
		System.out.println(글자로데이터변경);
		
		// 2. HH:mm:ss
		SimpleDateFormat 시간 = new SimpleDateFormat("HH:mm:ss");
		// Date date = new Date(); 를 써서 import 먼저 해줘도 된다.
		String 글자로데이터변경2 = 시간.format(new Date()); // 그렇게 해주면 .format(date); 로 쓸 수 있다.
		System.out.println(글자로데이터변경2);
		
		// 3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 날짜시간 = new SimpleDateFormat("yyyy-MM-dd // HH:mm:ss");
		String 글자로데이터변경3 = 날짜시간.format(new Date()); // date 는 한 번만 불러오면 굳이 변수명을 바꿔가면서 써 줄 필요가 없다.
		System.out.println(글자로데이터변경3);
		
		// 4. SimpleDateFormat E 로 요일 나타내기
		SimpleDateFormat 날짜시간2 = new SimpleDateFormat("EEEE");
		String 글자로데이터변경4 = 날짜시간2.format(new Date()); 
		System.out.println(글자로데이터변경4);
	}

}
