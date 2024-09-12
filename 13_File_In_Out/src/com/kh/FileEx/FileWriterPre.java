package com.kh.FileEx;

import java.io.*;

public class FileWriterPre {

	public static void main(String[] args) {
		String 헬로월드 = "Hello World.txt";
		try {
			FileWriter temp = new FileWriter(헬로월드, true);
			String 내용 = "\n자바를 만든 인간은 도대체 얼마나 천재인가?";
			temp.write(내용);
			temp.close();
			System.out.println("임시 저장 완료");
		} catch (IOException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}

}
