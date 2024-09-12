package practice3.model.vo;

// Animal extends
public class Horse extends Animal {

// �ʵ�
	private String location;
	private String color;
	
// �޼���
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
	
	// �⺻ ������
	public Horse() {
		// Ctrl + Space
	}
	
	// �ʼ� ������ : Alt + Shift + S �� O
	public Horse(String name, String kinds, String location, String color) {
		super(name, kinds); // super �Ұ�ȣ ( ) �ȿ��� �θ� class �� ���� �ʵ� ���� ������ �־�� �Ѵ�.
		this.location = location;
		this.color = color;
	}
	
	// @Override speak �����ͼ� ����ϱ�
	@Override
	public void speak() {
		System.out.println(super.toString() + location + " �� ���, ������ " + color + " �Դϴ�.");
	}
}
