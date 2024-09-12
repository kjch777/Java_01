package com.kh.oop.method.ex;

public class PizzaStore {
	
	// 필드
	private String pizzaName; 
	private    int pizzaPrice;
	
	// getter setter
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	
	// 메서드 - 생성자 - 기본
	// 생성자 메서드는 이름이 반드시 class 명과 똑같아야 한다.
	public PizzaStore() {
		
	}
	
	// 메서드 - 생성자 - 필수
	// 생성자 메서드는 이름이 반드시 class 명과 똑같아야 한다.
	public PizzaStore(String pizzaName1, int pizzaPrice1) {
		this.pizzaName = pizzaName1;
		this.pizzaPrice = pizzaPrice1;
	}
	
	// 메서드 - void - 출력
	public void inforPizza() {
		System.out.println("피자 이름 : " + pizzaName);
		System.out.println("피자 가격 : " + pizzaPrice);
	}
	
	// 메서드 - main - 최종 출력 및 실행
	public static void main(String[] args) {
		
		// 피자 객체
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("페퍼로니");
		pizza1.setPizzaPrice(25_000);
		
		pizza1.inforPizza();
		
		System.out.println("\n==========\n");
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("포테이토 피자");
		
		// 가격 적는 것을 잊은 경우
		
		pizza2.inforPizza();
		
		// 잊지 않기 위해 쓰는게 필수 생성자이다.
		// 필수 생성자로 출력해보기
		System.out.println("\n==========\n");
		PizzaStore pizza3 = new PizzaStore("파인애플", 18_000);
		pizza3.inforPizza();
		
	}

}
