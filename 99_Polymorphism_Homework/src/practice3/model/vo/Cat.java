package practice3.model.vo;

public class Cat extends Animal {
	
// �ʵ�
	private String location;
	private String color;
	
// �޼���
	// Getter : Alt + Shift + S
	public String getLocation() {
		return location;
	}
	public String getColor() {
		return color;
	}
	
	// Setter : Alt + Shift + S
	public void setLocation(String location) {
		this.location = location;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// �⺻ ������
	public Cat() {
		// Ctrl + Space + Enter
	}
	
	// �ʼ� ������ : Alt + Shift + S �� O
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	// @Override
	public void speak() {
		System.out.println(super.toString() + location + " �� ���, ������ " + color + " �Դϴ�.");
	}
	
}
