package practice3.model.vo;

// Animal �� extends
public class Rabbit extends Animal {
	
// �ʵ�
	private int weight;
	private String color;
	
// �޼���
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
	
	// �⺻ ������
	public Rabbit() {
		// Ctrl + Space
	}
	
	// �ʼ� ������ : Alt + Shift + S �� O �� ����, �θ� Ŭ������ �ִ� �ʵ� �߰����־�� �Ѵ�.
	public Rabbit(String name, String kinds, int weight, String color) {
		super(name, kinds); // super �Ұ�ȣ ( ) �ȿ��� �θ� class �� ���� �ʵ� ���� ������ �־�� �Ѵ�.
		this.weight = weight;
		this.color = color;
	}
	
	// @Override speak �����ͼ� ��� - void - �ϱ�
	@Override
	public void speak() {
		System.out.println(super.toString() + "�����Դ� " + weight + " kg �̸�, ������ " + color + " �Դϴ�.");
	}
}
