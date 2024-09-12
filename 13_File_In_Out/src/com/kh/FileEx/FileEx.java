package com.kh.FileEx;

import java.io.File;
/*
.write(); .close(); .exists(); .mkdir(); 정도만 알아도 크게 문제는 없다.
*/
/*
 File : 파일이나 폴더(directory)를 관리하는 클래스이다.
  		파일 생성/제거/이름/크기/마지막 수정 날짜/존재 여부 등의 기능을 제공한다.
 	   메서드 
 	        boolean .mkdir() : 폴더 생성 // make directory // 폴더는 빈 공간이기 때문에, try catch 문을 사용해서 생성에 실패했을 경우까지 생각해줄 필요가 없다.
 	       boolean .mkdirs() : 경로로 지정해준 모든 폴더 생성 // make directorys
 	boolean .createNewFile() : 파일 생성 // 파일은 내용이 있기 때문에, try catch 문을 사용해서 생성에 실패했을 경우(파일이 깨졌을 경우)를 대비해줘야 한다.
 	       boolean .delete() : 파일이나 폴더 삭제
 	       String .getName() : 파일 이름을 가져와서 보여줌
 	        String .parent() : 파일이 저장된 폴더를 알려줌
 	       String .getPatf() : 폴더 전체 경로 확인
 	       boolean .isFile() : 현재 File 객체가 관리하는 것이 파일이면 true
 	  boolean .isDirectory() : 현재 File 객체가 관리하는 것이 폴더이면 true
 	       boolean .exists() : 파일이나 폴더가 존재한다면 true, 없다면 false
 	          long .length() : 파일의 크기를 알려줌
 	    long .lastModified() : 파일의 마지막 수정 날짜를 알려줌
 	         String[] list() : 폴더 안의 파일 목록을 String[] 배열로 보여줌
 	      File[] listFiles() : 폴더 안의 파일 목록을 File[] 배열로 보여줌
 */
/*
 개발자 상식
 
  os : 운영체제(윈도우, 맥, 리눅스 등)
  		윈도우	|	맥, 리눅스
  		폴더		|	디렉토리
  		        |
  경로 표기 방법(폴더 경로, 파일 위치 등)
        \ /     |	/
  자바 언어는 / \ 관계 없이 모두, 경로로 표시 가능하게 설정 되어 있다.
  
      ┌ 절대 경로 : C:/ 부터 시작해서, 모두 작성해주는 경로
  경로 ┤
      └ 상대 경로 : 내가 위치한 폴더나 파일 기준으로, 폴더를 작성해주는 것을 뜻한다.
      		./ : 현재 내 폴더 위치를 나타낸다.
      	   ../ : 현재 내 폴더에서, 한단계 더 상위 폴더로 이동하는 것을 뜻한다.  
 */
public class FileEx {
	public static void main(String[] args) {
		// C:/Users/user1/Desktop 			// 바탕화면에 폴더 만들기
		File 폴더만들기 = new File("c:/Users/user1/Desktop/newFFF");
				
		// 바탕화면에 newFFF 라는 폴더가 존재하는지 확인하기
		System.out.println("newFFF 폴더가 존재합니까? : " + 폴더만들기.exists());
		
		// 만약 폴더가 존재한다면, 그에 맞는 문구를 출력하고,
		if(폴더만들기.exists()) {
			System.out.println("폴더가 이미 존재합니다.");
		} else { // 존재하지 않는다면, 새로 만들어주기
			// 폴더 생성
			폴더만들기.mkdir();
			System.out.println("폴더를 새로 만들었습니다.");
			System.out.println(폴더만들기.getName()); // 폴더 이름 확인
			System.out.println(폴더만들기.getPath()); // 폴더 주소 확인
			
		}
	}
}
