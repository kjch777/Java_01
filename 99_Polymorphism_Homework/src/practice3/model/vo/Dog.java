package practice3.model.vo;

// Animal 추상 클래스 가져오기 extends
public class Dog extends Animal {
	
// 필드	
	public static final String PLACE = "애견카페";
	private int weight;
	
// 메서드
	// Getter
	public int getWeight() {
		return weight;
	}
	
	// Setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// 기본 생성자
	public Dog() {
		// Ctrl + Space + Enter
	}

	// 필수 생성자 : Alt + Shift + S ▶ O
	public Dog(String name, String kinds, int weight) {
		super(name, kinds); // Animal 안에 이미 있는 name 과 kinds 를 바라보게 하기 위하여 소괄호 ( ) 안에 작성해준다.
		this.weight = weight;
	}
	
	// @Override speak : Ctrl + Space + Enter
	@Override
		public void speak() {
			System.out.println(super.toString() + "몸무게는 " + weight + " kg 입니다.");
			
		}
	
}
