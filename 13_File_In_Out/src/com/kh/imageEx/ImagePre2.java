package com.kh.imageEx;

import java.io.*;

public class ImagePre2 {
	public static void main(String[] args) {
		String 폴더경로 = System.getProperty("user.home") + "/Desktop";

		// 폴더명을 작성할 때마다 폴더명 앞에 / 를 작성했는지 반드시 확인해야 한다.
		File 폴더생성 = new File(폴더경로 + "/이미지폴더");
		if (폴더생성.exists()) {
			System.out.println("폴더가 이미 존재합니다.");
		} else {
			폴더생성.mkdir();
		}

		try {
			// FileWriter 는 글을 쓸 때에는 편리하지만, 파일의 이름을 비교하거나, 또 다른 작업을 하기에는 어려움이 있다.
			FileWriter 내용작성 = new FileWriter(폴더생성 + "/동물이름.txt"); // / 반드시 써야 한다! // ,true 를 쓰면 이어서 작성할 수 있다.
			내용작성.write("소\n고양이\n돼지\n토끼\n호랑이");
			내용작성.close(); // 작업하고 난 후 항상, 작업하던 파일을 닫아줄 것
			System.out.println("작성 완료");
			
			File 원본파일 = new File(폴더생성 + "/동물이름.txt");
			File 새로운이름 = new File(폴더생성 + "/좋아하는동물이름.txt");
			
			if(원본파일.renameTo(새로운이름)) {
				System.out.println("파일 이름 변경 완료");
			} else {
				System.out.println("파일 이름 변경 실패");
			}
			
			// 폴더와 파일 삭제
			// 폴더 안에 파일이 존재한다면, 폴더 삭제가 불가능하다.
			// 따라서, 폴더 안에 파일이 존재하는지 먼저 확인한 후, 파일이 없다면 삭제를 진행한다.
			// 배열을 이용하여 파일목록을 먼저 받고, 파일목록이 없다면 삭제를 진행하면 된다.
			File[] 파일목록 = 폴더생성.listFiles();
			System.out.println("폴더 안에 있는 파일 목록 보기 : " + 파일목록); // 이걸 사람이 제대로 보려면
			// for - each 문을 사용해야 한다.
			for(File f : 파일목록) {
				System.out.println(f.getName());
			}
			원본파일.delete();
			새로운이름.delete();
			if(폴더생성.delete()) {
				System.out.println("폴더 삭제 완료");
			} else {
				// 만약 폴더가 열려 있거나, 사용 중이면 삭제가 되지 않는다.
				// 또한, 폴더 안에 파일이 숨겨져 있을 경우, 삭제 권한 문제로 오류가 발생할 수도 있다.
				System.out.println("폴더 삭제 실패");
			}
		} catch (IOException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
	}
}
