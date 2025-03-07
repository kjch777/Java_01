package com.kh.SocketEx;
/*
 Socket : 컴퓨터에서 통신을 하게 해주는 역할을 한다.
 
 Socket 의 메서드
 	생성자
 		         .Socket() : 기본 생성자로, 사용자가 소켓을 생성할 때 사용한다.
 	이외
 	 	        .connect() : 클라이언트가 서버에 연결하려 할 때  사용한다. // 현관 앞에서 초인종을 누르는 행위와 같다.
 	 	         .accept() : 서버가 클라이언트의 연결 요청을 수락하고, 클라이언트와 통신을 하기 위한 소켓을 생성할 때 사용한다.
 	 	  			         // 집 주인이 문을 열어준 것과 같다. 집 주인 = 서버 / 손님 = 클라이언트
 	    
 	               .send() : 대화를 보낼 때 사용한다.
 	            .receive() : 대화를 받을 때 사용한다.
 	    
 	     .getInputStream() : 소켓에서 데이터(글자, 파일 등) 를 읽어오기 위한 입력 스트리밍 
		.getOutputStream() : 소켓에서 가져온 데이터(글자, 파일 등) 를 쓰기 위한 출력 스트리밍
 	    
 	              .close() : 소켓을 닫아 연결을 종료할 때 사용한다.
 	      
 BufferdReader 의 메서드
 	           .readLine() : 텍스트를 한 줄씩 읽어올 때 사용한다. 주로 대화나, 파일을 주고 받을 때 사용한다. 
 	           
 ServerSocket
 	메서드 중, 내 집에 어떻게 들어올지 포트 번호를 지정하는 필수 생성자로 많이 사용한다.
 	
 PrintWriter
 	글로 작성한 내용을 출력할 때 사용한다.
 */
public class SocketEx {

}
