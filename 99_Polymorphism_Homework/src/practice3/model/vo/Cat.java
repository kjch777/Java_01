package practice3.model.vo;

public class Cat extends Animal {
	
// 필드
	private String location;
	private String color;
	
// 메서드
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
	
	// 기본 생성자
	public Cat() {
		// Ctrl + Space + Enter
	}
	
	// 필수 생성자 : Alt + Shift + S ▶ O
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	// @Override
	public void speak() {
		System.out.println(super.toString() + location + " 에 살며, 색상은 " + color + " 입니다.");
	}
	
}
