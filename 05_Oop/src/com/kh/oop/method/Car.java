package com.kh.oop.method;
	// ����Ű tip : ctrl ���� ���·� �Ķ��� ������ ���콺�� ���, 
	// �� ó�� ������� �������� ��ġ�� �� �� �ִ�.

public class Car {
	
	// �ʵ�
	public String brand;
	public String model;
	public 	  int year;
	
	// �⺻ ������
	public Car() {
		
	} 
	
	// �ʼ� ������
	public Car(String brand1, String model1, int year1) {
		this.brand = brand1;
		this.model = model1;
		this.year = year1;
	}
	
	// return method
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
		
		// �ڵ��� car1 ���
		Car car1 = new Car("����Ÿ", "ķ��", 2020);
		
		// ���� ���
		System.out.println(car1.getBrand() + "   " + car1.getModel() + "   " + car1.getYear());

	}

}
