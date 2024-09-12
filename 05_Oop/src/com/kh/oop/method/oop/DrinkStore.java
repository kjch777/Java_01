package com.kh.oop.method.oop;

public class DrinkStore {

// �ʵ�
	private DrinkMaker maker;
	private String name;
	private String location;
	private boolean takeout;
	
// �޼���
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
	
	
	// �⺻ ������
	public DrinkStore() {
		
	}
	
	// �ʼ� ������
	public DrinkStore(DrinkMaker maker1, String name1, String location1, boolean takeout1) {
		this.maker = maker1;
		this.name = name1;
		this.location = location1;
		this.takeout = takeout1;
	}
	
	// ��� void
	public void orderDrink(){
		System.out.println(location + " " + name + " ���� �ֹ��� �����Դϴ�.");
		maker.makeDrink(); // ���� ���� Ȯ��
		if(takeout) {
			System.out.println("����� ������ �帮�ڽ��ϴ�~!\n");
		} else {
			System.out.println("����� ������ �帮�ڽ��ϴ�~!\n");
		}
	}
}
