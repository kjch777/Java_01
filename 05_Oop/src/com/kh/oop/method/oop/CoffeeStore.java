package com.kh.oop.method.oop;

// Coffee Store class
public class CoffeeStore {
	
// 필드
	// 커피 만드는 파일을 가져와서, 각각의 가게마다 커피 만드는 방법을 다르게 작성해보기
	private CoffeeMaker maker;
	private String name;
	private String location;
	
// 메서드
	// setter
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	// getter
	public CoffeeMaker getMaker() {
		return maker;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	
	// 기본 생성자
	public CoffeeStore() {
		
	}
	
	// 필수 생성자
	public CoffeeStore(CoffeeMaker maker1, String name1, String location1) {
		this.maker = maker1;
		this.name = name1;
		this.location = location1;
	}
	
	// 출력 void
	public void orderCoffee() {
		System.out.println("커피 브랜드 : " + name);
		System.out.println("브랜드 지역 : " + location + "\n");
		System.out.println(name + "에서 주문한 커피");
		maker.makeCoffee();
	}

}
