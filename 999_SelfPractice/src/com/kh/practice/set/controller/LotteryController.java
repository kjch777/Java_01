package com.kh.practice.set.controller;

import java.util.HashSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	
// 필드
	// - lottery : HashSet = new HashSet();
	// 추첨자를 담을 HashSet 객체 lottery 생성
	private HashSet lottery = new HashSet(); // HashSet import
	
	// - win : HashSet = new HashSet();
	// 당첨자를 담을 HashSet 객체 win 생성
	private HashSet win = new HashSet();

	
// 메서드
	// HashSet 에 값을 저장하는 메서드
	public boolean insertObject(Lottery l) {
	//        (부모 class 이름 적고 띄어쓰기 후 새로운 변수명)
		
		// 전달 받은 l 을 lottery 에 추가 // 추가 == 추가받을값.add(추가할값); 
		lottery.add(l);
		
		// 추가 결과인 boolean 값 반환 하기 // 반환 == return;
		
	}
	
	// HashSet 에 있는 값을 삭제하는 메서드
	public boolean deleteObject(Lottery l) {
	//      (부모 class 이름 적고 띄어쓰기 후 새로운 변수명)	
		
		// 전달 받은 l 을 lottery 에서 삭제 // 삭제 == 삭제할값이있는곳.remove(삭제할값);
		lottery.remove(l);
	}
	
	public HashSet winObject() {
		
	}
}
