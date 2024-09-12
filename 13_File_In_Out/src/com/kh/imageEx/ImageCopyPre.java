package com.kh.imageEx;

import java.io.*;

public class ImageCopyPre {
	public static void main(String[] args) {

		String 원본이미지 = "src/com/kh/imageEx/hogam.jpg";
		String 복사이미지 = "src/com/kh/imageEx/hogam_cute.jpg";

		try {
			FileInputStream 파일읽기 = new FileInputStream(원본이미지);
			FileOutputStream 파일쓰기 = new FileOutputStream(복사이미지);

			// 버퍼를 통해 데이터를 읽고, 쓰기 위한 배열 만들기
			byte[] buffer = new byte[1024];
			int 파일길이;
			
			// 버퍼를 통해 원본 이미지 데이터를 가져와서, 복사할 파일에 사용하기
			while ((파일길이 = 파일읽기.read(buffer)) > 0) {
				파일쓰기.write(buffer, 0, 파일길이);
			}
			
			// 여기서부턴 while 문 바깥에 작성해야 한다.
			// 파일 스트림을 닫아주기 위하여 .close(); 를 반드시 해주어야 한다.
			파일읽기.close();
			파일쓰기.close();
			
			System.out.println("복사 완료");
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
}
