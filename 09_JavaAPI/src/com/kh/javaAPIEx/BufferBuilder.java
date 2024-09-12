package com.kh.javaAPIEx;
/*
        String : 변할 수 없음;
  				 문자나 문자열을 사용할 때 사용 후, 변수명에 다른 값을 넣어주는 것이지
  				 수정하거나 삭제하기는 힘들다.
  				 
  // 메모리 크기가 변할 수 있는 환경
  // 수정하고 삭제해도 문제 없다.
  StringBuffer : 여러 스레드에서 동시에 사용되어도, 안전하게 작업을 처리할 수 있다. (동기화)
 StringBuilder : 하나의 스레드에서 사용하는 것이 효율적이다. (비동기화, 대체로 이걸 쓰는걸 추천한다.)
 
        Thread : 컴퓨터 내에서 실행되는, 독립적인 실행 흐름
          동기화 : 요청과 결과가 동시에 일어나는 것을 뜻한다.
         비동기화 : 요청과 결과가 한 자리에서 동시에 일어나지 않는 것을 뜻한다. 
 */
public class BufferBuilder {
	// 무언가 행동을 진행할 때 만들어 주는게 메서드이다.
	
	// 바로 실행하고 출력하고 싶다면 main 메서드를 만들어준다.
	public static void main(String[] args) {
	
		// 1. StringBuffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello,");
		buffer.append(" World.");
		System.out.println(buffer.toString());
		
		System.out.println("============");
		
		// 2. StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append("Hello,");
		builder.append(" World.");
		System.out.println(builder.toString());
		
	}
	
}
