package practice3.model.vo;

// Animal 을 extends
public class Rabbit extends Animal {
	
// 필드
	private int weight;
	private String color;
	
// 메서드
	// Setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// Getter
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	
	// 기본 생성자
	public Rabbit() {
		// Ctrl + Space
	}
	
	// 필수 생성자 : Alt + Shift + S ▶ O 한 다음, 부모 클래스에 있는 필드 추가해주어야 한다.
	public Rabbit(String name, String kinds, int weight, String color) {
		super(name, kinds); // super 소괄호 ( ) 안에는 부모 class 에 속한 필드 값의 변수명만 넣어야 한다.
		this.weight = weight;
		this.color = color;
	}
	
	// @Override speak 가져와서 출력 - void - 하기
	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + " kg 이며, 색깔은 " + color + " 입니다.");
	}
}
