package com.kh.hw.person.model.vo;

public class Person {
	
// 필드
	// 이름 나이 키 몸무게
	private String name;
	private int age;
	private double height;
	private double weight;
	
// 메서드
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// Getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
	
	// 기본 생성자
	public Person() {
		// Ctrl + Space
	}
	
	// 필수 생성자 : Alt + Shift + S ▶ O
	public Person(String name, int age, double height, double weight) { // 추가할게 없으면 super(); 는 지워준다.
		// 부모 클래스의 필수 생성자 메서드에서는 super(); 를 지워준다.
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// @Override 표시하고 toString 작성하기
	@Override
	public String toString() { // return " 작성 할 내용 " ;
		return "사람 [ name = " + name + " , age = " + age + " , height = " + height + " , weight = " + weight + " ]";
	}
	
}
