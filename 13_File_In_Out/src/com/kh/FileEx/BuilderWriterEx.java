package com.kh.FileEx;

import java.io.*;

/*
 StringBuilder : 속도가 빠르다. 
 */
public class BuilderWriterEx {
	public static void main(String[] args) {
		// 파일 생성
		String 파일이름 = "라인.txt";
		
		// StringBuilder 를 사용하여, 파일에 쓸 내용 작성
		StringBuilder 스트링빌더 = new StringBuilder();
		
		//     .append : 추가하다 라는 뜻이다.
		스트링빌더.append("첫번째 라인입니다. \n");
		스트링빌더.append("두번째 라인입니다. \n");
		스트링빌더.append("세번째 라인입니다. \n");
		
		// FileWriter 객체를 생성하여, 파일에 쓰기 모드로 열기
		// BufferedWriter 를 사용하여, 더 빨리 가져올 수 있도록 하기
		try {
			BufferedWriter 버퍼드라이터 = new BufferedWriter(new FileWriter(파일이름));
			
			/*
			 System.nanoTime(); : 1ms == 1/1000초
			                      1us == 1/1000ms
			                      1ns == 1/1000us (1/10억초)
			                        
			 */ 
			long 시작시간 = System.nanoTime();
			
			// 파일 내용 작성
			버퍼드라이터.write(스트링빌더.toString());
			
			long 종료시간 = System.nanoTime();
			System.out.println("총 소요 시간 : " + (종료시간 - 시작시간) + " ns");
			
			// 파일 닫기
			버퍼드라이터.close();
			System.out.println("파일에 내용을 성공적으로 작성하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
