package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/*
 BufferedImage : 이미지 데이터를 저장하고 처리할 때, 사용한다.
 		 Image : 인터페이스로 이미지를 표현하는 추상화된 개념을 제공한다.
 	   ImageIO : 이미지를 파일로부터 읽어오고, 출력하는 이미지 In Out 
 */
public class ImageResize {
	public static void main(String[] args) {
		
		// 원본 이미지 경로
		String 원본이미지 = "src/com/kh/imageEx/marley.jpg";
		String 사이즈조정이미지 = "src/com/kh/imageEx/marley_cute.jpg";
		
		// 이미지의 가로 세로 크기 설정하기
		int 가로크기 = 200;
		int 세로크기 = 200;
		
		try {
			// BufferedImage 를 사용하여 이미지 불러오기
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			
			// 새로운 크기의 이미지 생성하기                     가로길이  세로길이   이미지를 어떤 타입으로 그릴지 설정
			BufferedImage 크기조정이미지 = new BufferedImage(가로크기, 세로크기, BufferedImage.TYPE_INT_RGB);
			
			// 이미지 크기를 조정하여, 새로운 이미지에 그리기
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로크기, 세로크기, Image.SCALE_SMOOTH);
			크기조정이미지.createGraphics().drawImage(이미지그리기, 0, 0, null);
			
			// 새로 만든 이미지를 파일로 저장하기
			ImageIO.write(크기조정이미지, "jpg", new File(사이즈조정이미지));
			
		} catch (IOException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
}
