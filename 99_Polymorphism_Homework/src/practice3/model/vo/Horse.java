package practice3.model.vo;

// Animal extends
public class Horse extends Animal {

// 필드
	private String location;
	private String color;
	
// 메서드
	// Setter
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// Getter
	public String getLocation() {
		return location;
	}
	
	public String getColor() {
		return color;
	}
	
	// 기본 생성자
	public Horse() {
		// Ctrl + Space
	}
	
	// 필수 생성자 : Alt + Shift + S ▶ O
	public Horse(String name, String kinds, String location, String color) {
		super(name, kinds); // super 소괄호 ( ) 안에는 부모 class 에 속한 필드 값의 변수명만 넣어야 한다.
		this.location = location;
		this.color = color;
	}
	
	// @Override speak 가져와서 출력하기
	@Override
	public void speak() {
		System.out.println(super.toString() + location + " 에 살며, 색상은 " + color + " 입니다.");
	}
}
