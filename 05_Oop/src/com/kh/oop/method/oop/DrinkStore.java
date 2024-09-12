package com.kh.oop.method.oop;

public class DrinkStore {

// 필드
	private DrinkMaker maker;
	private String name;
	private String location;
	private boolean takeout;
	
// 메서드
	// setter
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	
	// getter
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public boolean isTakeout() {
		return takeout;
	}
	
	
	// 기본 생성자
	public DrinkStore() {
		
	}
	
	// 필수 생성자
	public DrinkStore(DrinkMaker maker1, String name1, String location1, boolean takeout1) {
		this.maker = maker1;
		this.name = name1;
		this.location = location1;
		this.takeout = takeout1;
	}
	
	// 출력 void
	public void orderDrink(){
		System.out.println(location + " " + name + " 에서 주문한 정보입니다.");
		maker.makeDrink(); // 제조 음료 확인
		if(takeout) {
			System.out.println("포장용 컵으로 드리겠습니다~!\n");
		} else {
			System.out.println("매장용 컵으로 드리겠습니다~!\n");
		}
	}
}
