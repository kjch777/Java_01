package com.kh.oop.method.ex;

public class Circle {
	
	// �ʵ�
	private double PI = 3.14;
	private int radius = 1;
	
	
	// Getter Setter �� �ʵ忡 �ۼ��ϴ� ��...
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	public void setPI(double pI) {
		PI = pI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	// �⺻ ������
	public Circle() {
		
	}
	
	// �޼���
	public void incrementRadius() { // increment ����		radius ������
		// ������ 1�� ����
		radius++;
	}
	
	public void getAreaOfCicle() { // area ����
		// �Ǽ��� ������ ������ double
		double area = PI * radius * radius;
		System.out.println("���� ���� : " + area);
	}
	
	public void getSizeOfCircle() { // size �ѷ�
		// �Ǽ��� ������ ������ double
		double size = 2 * PI * radius;
		System.out.println("���� �ѷ� : " + size);
	}
	
	public static void main(String[] args) {
		// �� �̶�� ��ü ����
		Circle �� = new Circle();
		
		// �������� 1�� �����ϱ� ��, ���� �ѷ��� ���� ����ϱ�
		System.out.println("===== ���� �ʱ� �ѷ��� ���� =====");
		��.getSizeOfCircle();
		��.getAreaOfCicle();
		
		��.incrementRadius(); // ������ 1�� ����
		// �������� 1�� ������ ��, ���� �ѷ��� ���� ����ϱ�
		System.out.println("������ 1 ���� ��, ���� �ѷ��� ����");
		��.getSizeOfCircle();
		��.getAreaOfCicle();
	}
	
}
