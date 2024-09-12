package com.kh.oop.method.oop;

public class DrinkMaker {
	
// 필드
	private String type;
	private    int quant; // 음료 양
	private    int temp; // 온도
	
// 메서드
	// setter
	public void setType(String type) {
		this.type = type;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	// getter
	public String getType() {
		return type;
	}

	public int getQuant() {
		return quant;
	}

	public int getTemp() {
		return temp;
	}
	
	
	// 기본 생성자
	public DrinkMaker() {
		
	}
	
	// 필수 생성자
	public DrinkMaker(String type1, int quant1, int temp1) {
		this.type = type1;
		this.quant = quant1;
		this.temp = temp1;
	}

	// 출력 void
	public void makeDrink() {
		System.out.println("어떤 음료를 드릴까요? : " + type);
		System.out.println("음료의 양은 얼마나요? : " + quant + "ml");
		if(temp<5) {
			System.out.println("차갑게 주세요.");
		} else if((5<temp) && (temp<10)) {
			System.out.println("미지근하게 주세요.");
		} else {
			System.out.println("뜨겁게 주세요.");
		}
		System.out.println("음료 나왔습니다~!");
	}
}
