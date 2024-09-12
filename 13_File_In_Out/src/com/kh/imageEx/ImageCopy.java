package com.kh.imageEx;

import java.io.*;

/*
 이미지를 복사하기 위해서는, 
 원본 이미지 파일의 경로와, 옮기고 싶은 이미지 파일의 경로를 설정 해주어야 한다.
 
 File : 파일을 읽고, 쓰고, 가져오고, 사용할 때 쓰이는 객체
 
  FileInputStream : 파일의 데이터를 읽어올 때 사용한다.
 		  .read() : 데이터를 읽어옴
 
 FileOutputStream : 파일의 데이터를 내보낼 때 사용한다.
 		 .write() : 데이터를 사용 
 */
public class ImageCopy {
	public static void main(String[] args) {
		// 힐링이를 복사하려면,
		// 힐링이의 사진이 위치하고 있는 장소를 작성 해주어야 한다.
		// 자바 코드에서 폴더 구분을 작성할 때는, / 를 쓴다.
		// 모든 파일의 실행은 src 로부터 시작한다.
		//               폴더 경로를 모두 작성했으면, / 를 작성하고, 파일명.확장자 를 작성해준다.
		String 원본이미지 = "src/com/kh/imageEx/healing.jpg";
		String 복사이미지 = "src/com/kh/imageEx/healing_cute.jpg"; // 이름이 겹치면 안되므로 이름 변경
		
		// FileInputStream OutputStream 을 사용하여 읽고 쓰기
		try {
			FileInputStream 파일읽기 = new FileInputStream(원본이미지);
			FileOutputStream 파일쓰기 = new FileOutputStream(복사이미지);
			
			// 버퍼를 통해, 데이터를 읽고 쓰기 위한 배열 설정하기
			byte[] buffer = new byte[1024];
			int 길이;
			
			// 배열에 담은 버퍼를 통해, 원본 파일로부터 데이터를 읽어와서 복사할 파일에 사용하기
			// while 문을 사용하여, 이미지 0 부터 끝까지 가지고 오기
			while((길이 = 파일읽기.read(buffer)) > 0) {
				파일쓰기.write(buffer, 0, 길이);
			}
			// 파일 읽고 썼다면, 종료하기
			파일읽기.close();
			파일쓰기.close();
			
			System.out.println("이미지 복사가 완료 되었습니다.");
		} catch (Exception e) {
			System.out.println("이미지 복사 중 오류가 발생 했습니다.");
			e.printStackTrace();
		}
	}
}
