package com.kh.oop.method.ex;

public class IceCream {
	
	// 필드
	private String name;
	private int sugar;
	private boolean milk;
	
	// 메서드 - setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	// 메서드 - getter
	public String getName() {
		return name;
	}

	public int getSugar() {
		return sugar;
	}

	public boolean isMilk() {
		return milk;
	}
	
	// 메서드 - 생성자 - 기본
	public IceCream() {
		
	}
	
	// 메서드 - 생성자 - 필수
	public IceCream(String name1, int sugar1, boolean milk1) {
		this.name = name1;
		this.sugar = sugar1;
		this.milk = milk1;
	}
	
	// 메서드 - void - 출력
	public void makeIceCream() {
		System.out.println("\n===== 아이스크림 만들기 =====\n");
		System.out.println("어떤걸 만들까? : " + name + "을(를) 만들자!");
		System.out.println("설탕은 얼마나? : " + sugar + "g");
		if(milk) {
			System.out.println("우유 넣자!");
		} else {
			System.out.println("우유 빼자!");
		}
		System.out.println("\n★★★★★ 아이스크림 완성 ★★★★★\n");
	}
	
}
