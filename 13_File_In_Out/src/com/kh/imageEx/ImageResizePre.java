package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageResizePre {
	public static void main(String[] args) {
		// 원본 이미지 경로와 수정 이미지 경로 설정하기
		String 원본이미지 = "src/com/kh/imageEx/pig.jpg"; // 메인 메서드 안에 작성해준다. // .확장자까지 작성해준다.
		String 수정이미지 = "src/com/kh/imageEx/pig_cute.jpg"; // 파일명이 중복되지 않게 바꿔준다.
		
		// 새로 만들 이미지의 가로 세로 길이 설정하기
		int 가로길이 = 400;
		int 세로길이 = 200;
		
		try {
			// BufferedImage 를 사용하여 원본 이미지 데이터 불러오기
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			
			// 새로운 크기의 이미지 생성하기
			BufferedImage 이미지버퍼 = new BufferedImage(가로길이, 세로길이, BufferedImage.TYPE_INT_RGB);
			
			// 이미지 크기를 조정하여, 새로운 이미지에 그릴 준비하기
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로길이, 세로길이, Image.SCALE_SMOOTH);
			
			// 이미지 그리기 시작                           x좌표 y좌표 효과 추가 여부
			이미지버퍼.createGraphics().drawImage(이미지그리기, 0, 0,  null);
			
			// 새로 만든 이미지를 파일로 저장하기
			ImageIO.write(이미지버퍼, "jpg", new File(수정이미지));
			
			System.out.println("생성 완료");
			
		} catch (IOException e) {
			System.out.println("오류 발생");
			e.printStackTrace(); // 이 코드로 에러 발생 원인을 알 수 있다.
		}
	}
}
