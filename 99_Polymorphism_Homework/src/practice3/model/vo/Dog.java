package practice3.model.vo;

// Animal �߻� Ŭ���� �������� extends
public class Dog extends Animal {
	
// �ʵ�	
	public static final String PLACE = "�ְ�ī��";
	private int weight;
	
// �޼���
	// Getter
	public int getWeight() {
		return weight;
	}
	
	// Setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// �⺻ ������
	public Dog() {
		// Ctrl + Space + Enter
	}

	// �ʼ� ������ : Alt + Shift + S �� O
	public Dog(String name, String kinds, int weight) {
		super(name, kinds); // Animal �ȿ� �̹� �ִ� name �� kinds �� �ٶ󺸰� �ϱ� ���Ͽ� �Ұ�ȣ ( ) �ȿ� �ۼ����ش�.
		this.weight = weight;
	}
	
	// @Override speak : Ctrl + Space + Enter
	@Override
		public void speak() {
			System.out.println(super.toString() + "�����Դ� " + weight + " kg �Դϴ�.");
			
		}
	
}
