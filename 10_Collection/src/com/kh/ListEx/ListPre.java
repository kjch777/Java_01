package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
      ┌     Vector : Java 1 버전 대에서 제일 먼저 등장하여 사용된 것
 List ├  ArrayList : 검색할 때 좋다. 하지만 데이터 삽입과 삭제가 빈번한 경우에는 부적합하다. 
      └ LinkedList : 검색에는 부적합하다. 하지만 데이터 삽입과 삭제를 진행할 때는 좋다.
 */
public class ListPre {

// 메서드
	// 기본 생성자
	public ListPre() {
		// Ctrl + Space
	}
    
	// 출력 void : 벡터
	public void VectorEx() {

	   // List<String> 벡터 = new Vector<>(); 이렇게 사용해도 되지만, 되도록 아래처럼 사용하는 것을 권장한다.
		Vector<String> 벡터 = new Vector<>();

		벡터.add("자바");
		벡터.add("파이썬");
		벡터.add("C");

		System.out.println(벡터);
	}
	
	// 출력 void : 링크드
	public void LinkedEx() {
		
		//    List<String> 링크드리스트 = new LinkedList<>(); 이렇게 사용해도 되지만, 되도록 아래처럼 사용하는 것을 권장한다.
		LinkedList<String> 링크드리스트 = new LinkedList<>();
		링크드리스트.add("말");
		링크드리스트.add("호랑이");
		링크드리스트.add("토끼");
		
		System.out.println(링크드리스트);
		
	}
	
	// 출력 void : 어레이
	public void ArrayEx() {
		
		ArrayList<String> 어레이리스트 = new ArrayList<>();
		
		어레이리스트.add("사과");
		어레이리스트.add("바나나");
		어레이리스트.add("포도");
		
		System.out.println(어레이리스트);
		
	}
	
	// 메인 메서드 : main + Ctrl + Space
	public static void main(String[] args) {
		
		ListPre lp = new ListPre();
		lp.VectorEx();
		lp.LinkedEx();
		lp.ArrayEx();
		
	}

}
