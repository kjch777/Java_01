package com.kh.oop.basic;

public class Car {
	// �ʵ�
	public String color; // ���� ����
	public int speed; // ���� �ӵ�
	public String door; // ���� ����
	public String window; // â���� ����
	public String sunRoof; // ����� ����
	public String insurance; // ����
	
	
	// ������ = �޼��带 ��ų� �ʱ�ȭ�� ���� ��
	public Car() {
		
	}
	// ������ = �ʼ� �ɼ�
	// �����ڴ� class �̸��� �Ȱ��ƾ� �Ѵ�.
	// ������ �̸� == class �̸� == ���ϸ�
 // public Car(���ڷ� ���� �� ����, ���ڷ� ���� �� �ӵ�) {
	public Car(String inputColor, int inputSpeed) {
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	
	
	//�޼���
	public void displayInfo() {
		System.out.println("  ���� ����");
		System.out.println("���� : " + color);
		System.out.println("�ӵ� : " + speed);
	}
	
	
	// ���� �޼���
	public static void main(String[] args) {
		// Car �� ���� ������ �����ϱ�
		Car myCar = new Car();
		myCar.color = "������";
		System.out.println("�� ���� ���� : " + myCar.color);
		
		
		// ���忡�� ���� ������ �ϰ�, ����� �ӵ��� �̹� ������ �� ��Ȳ
		// ����� �ӵ��� ������� ���ϴ� �������� ���� ���
		Car orderCar = new Car("black", 60);
		orderCar.displayInfo();
		
		Car storeCar = new Car("white", 100);
		storeCar.displayInfo();
	}

}
