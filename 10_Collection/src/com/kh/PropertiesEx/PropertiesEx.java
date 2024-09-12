package com.kh.PropertiesEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

/*
 Properties : 속성, 설정. 필수로 넣어야 하는 값을 작성할 때 많이 사용한다. 
 			  Map 과 비슷한 형태의 데이터를 관리하는 데에 사용한다.
 			  key(키) 와 value(값) 으로 이루어져 있다.
 			  키와 값이 숫자가 아니라 문자열의 형태로 저장되어 있다.
 
 	메서드
 		.setProperty(String key, String value) : 지정된 키와 값으로 맵에 항목을 추가할 때 사용한다.
 		              .getProperty(String key) : 주어진 키에 대한 값을 반환할 때 사용한다.
 		.getProperty(String key, String value) : 주어진 키에 대한 값을 전달하지만, 
 												 해당하는 키가 없을 경우에는 기본값을 반환한다.
 		                   .load(InputStream in) : 입력 스트림에서 속성 목록을 읽어올 때 사용한다.
 		.store(OutputStream out, String comment) : 출력 스트림에서 속성 목록을 저장할 때 사용한다.
 
 Properties 의 경우, 프로그램이나 코드를 실행할 때 필수로 설정해주어야 하는 내용을 작성한 후, 주로 코드가 아니라 파일로 존재한다.
 Map 은 주로 데이터를 다루지만, Properties 는 인증 키나, 회원에게 인증 번호를 보내기 위하여, 인증에 필요한 내용을 작성해놓는 공간이다.
 */
public class PropertiesEx {
	public static void main(String[] args) {
		// Properties 객체 생성
		Properties 설정 = new Properties();
		
		// 설정 파일 만들기
		try {
			// File
			File 진짜파일만들기 = new File("설정.properties");
			
			// 만약 파일이 존재하지 않는다면, 파일 만들어주기
			if(진짜파일만들기.exists()) {
				System.out.println("파일이 존재합니다.");
			} else {
				System.out.println("설정 파일이 없습니다. 새로운 파일을 만들어주세요.");
				진짜파일만들기.createNewFile();
			}
			
			// 파일 불러오기
			FileInputStream 파일불러오기 = new FileInputStream("설정.properties");
			설정.load(파일불러오기);
			파일불러오기.close(); // 파일 불러오기 종료
			
			// 관리자 이름과 비밀번호를 가져오는 코드
			// 만약, 관리자이름과 관리자비번이 없다면, null 값이 반환될 것이다.
			String 관리자이름 = 설정.getProperty("관리자이름");
			String 관리자비번 = 설정.getProperty("관리자비번");
			System.out.println("관리자이름 : " + 관리자이름);
			System.out.println("관리자비번 : " + 관리자비번);
			
			// 만약, 값이 아무 것도 없어서 null 값이 반환되는 것이 싫다면, 설정 값을 변경해줄 수 있다.
			설정.setProperty("name", "매니저");
			설정.setProperty("password", "1234");
			
			// 변경된 설정을 파일에 저장하기
			FileOutputStream 파일저장 = new FileOutputStream("설정.properties");
			
			// 새로운 내용 저장과, 저장할 때 어떤 내용을 수정, 삭제 또는 추가했는지 작성하는 코드
			설정.store(파일저장, "새로운 이름과 비번 저장");
			
			// 파일 저장 종료
			파일저장.close();
			
			System.out.println("관리자가 성공적으로 변경되었습니다.");
		
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		  } 
		
		  catch (Exception e) {
			
			e.printStackTrace();
		  }
	}
}
