package com.kh.FileEx;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FilePre {

	public FilePre() {
		// Ctrl + Space
	}

	public void method1() {
		File 텍스트파일 = new File("c:/Users/user1/Desktop/newFFF/파일생성.txt");
		if (텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		} else { // 존재하지 않는다면
			try { // 만약 파일 만들기에 성공했다면
				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName() + "파일이 생성되었습니다.");
			} catch (IOException e) {
				// 만약 파일 만들기에 실패했다면
				System.out.println("파일 생성에 실패했습니다.");
				e.printStackTrace();
			}
		}
	}

	public void method2() {
		// 바탕화면 경로를 설정하는 방법 c:/Users.user1
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		System.out.println(바탕화면경로);

		String 폴더경로 = "c:/Users/user1/Desktop/뉴폴더";
		File 폴더만들기 = new File(폴더경로);
		// 또는
		File 폴더 = new File("c:/Users/user1/Desktop/뉴폴더");
		File 파일 = new File("c:/Users/user1/Desktop/뉴폴더/파일생성.txt");

		if (폴더.exists()) {
			System.out.println("폴더가 이미 존재합니다.");
		} else {
			폴더.mkdir();
			System.out.println(폴더.getName() + "를 생성하였습니다.");
			if (파일.exists()) {
				System.out.println("파일이 이미 존재합니다.");
			} else {
				try {
					파일.createNewFile();
					System.out.println(파일.getName() + " 생성에 성공했습니다.");
				} catch (IOException e) {
					System.out.println(파일.getName() + " 생성에 실패했습니다.");
					e.printStackTrace();
				}
			}
		}
	}

	public void method3() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";

		// 모든 폴더 생성
		File 폴더들 = new File(바탕화면경로 + "/뉴1/뉴2/뉴3");
		폴더들.mkdirs();

		// 파일 생성
		File 파일 = new File(폴더들 + "/새로운파일.txt");
		try {
			boolean 파일생성확인 = 파일.createNewFile();
			System.out.println("파일이 생성 되었습니까? : " + 파일생성확인);

			// 파일 크기 확인
			System.out.println(파일.length());

			// 파일 마지막 수정 날짜 확인
			System.out.println(파일.lastModified());

			// 파일 삭제
			파일.delete();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void method4() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		
		// 파일 이름 변경하기
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일생성이름바꾸기.txt");
		try {
			텍스트파일.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void method5() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일생성이름바꾸기.txt");
		File 새로운이름 = new File(바탕화면경로 + "/newFFF/변경된이름.txt");
		
		// 파일 이름 변경하기
		// 만약 파일이 존재할 경우, 파일 이름 변경
		// 존재하지 않는다면, 변경하지 않는다.
		if(텍스트파일.exists()) {
			if(텍스트파일.renameTo(새로운이름)) { // 만약 파일 이름을 성공적으로 변경했다면
				System.out.println("파일 이름이 성공적으로 변경되었습니다.");
			} else {
				System.out.println("파일 이름 변경에 실패하였습니다.");
			}
		} else {
			System.out.println("파일 이름이 존재하지 않습니다. 먼저, 생성해 주세요.");
		}
	}
	
	public static void main(String[] args) {
		// main + Ctrl + Space
		FilePre 파일 = new FilePre();
		// 파일.method1();
		// 파일.method2();
		// 파일.method3();
		// 파일.method4();
		파일.method5();
	}

}