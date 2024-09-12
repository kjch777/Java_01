package practice3.model.vo;

// abstract 추상 메서드를 쓰기 위해서는 class 도 abstract 추상 클래스여야지만 사용이 가능하다.
public abstract class Animal {

// 필드	
	private String name;
	private String kinds;

// 메서드
	// Getter
	public String getName() {
		return name;
	}

	public String getKinds() {
		return kinds;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	// 기본 생성자
	public Animal() {
		// Ctrl + Space + Enter
	}

	// 필수 생성자
	public Animal(String name, String kinds) {
		// Alt + Shift + S ▶ O
		this.name = name;
		this.kinds = kinds;
	}

	// toString
	@Override // javaAPI String toString
	public String toString() {
		return "제 이름은 " + name + " 이고, 종은 " + kinds + " 입니다. ";
	}

	public abstract void speak();

}
