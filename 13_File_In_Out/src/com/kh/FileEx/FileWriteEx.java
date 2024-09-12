package com.kh.FileEx;

import java.io.*;
/*
 FileWriter : 파일에 문자를 쓰기 위한 객체이다. 
 			  파일이 없다면 파일을 생성하고, 파일에 데이터를 바로 쓸 수 있게 해준다.
   .write() : 작성하고 싶은 내용을 파일 안에 작성할 수 있게 해주는 메서드이다.
   .flush() : Stream을 비우고, 모든 데이터를 출력할 때 사용한다. (출력할 데이터가 없어도 작성은 가능하다.)
   .close() : 쓰고 있는 파일을 닫을 때 사용한다.
 */
public class FileWriteEx {

	public static void main(String[] args) {
		
		//                                  ("파일명.확장자") true 가 없으면 덮어쓰기를 진행한다.
		try { //                            ("파일명.확장자", true) 를 작성하면, .write() 안에 작성한 것을 한번 더 작성한다.
			//                                파일명 앞에 주소가 없으면, 현재 자바 코드를 작성 중인 폴더 바로 안에 생성된다.
			FileWriter 글쓰기 = new FileWriter("예제파일.txt");
			
			// 파일에 글자 쓰기
			글쓰기.write("안녕하세요, 환영합니다.");
			
			글쓰기.close();
			System.out.println("글쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
