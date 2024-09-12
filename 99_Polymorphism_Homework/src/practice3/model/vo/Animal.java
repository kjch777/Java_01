package practice3.model.vo;

// abstract �߻� �޼��带 ���� ���ؼ��� class �� abstract �߻� Ŭ������������ ����� �����ϴ�.
public abstract class Animal {

// �ʵ�	
	private String name;
	private String kinds;

// �޼���
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

	// �⺻ ������
	public Animal() {
		// Ctrl + Space + Enter
	}

	// �ʼ� ������
	public Animal(String name, String kinds) {
		// Alt + Shift + S �� O
		this.name = name;
		this.kinds = kinds;
	}

	// toString
	@Override // javaAPI String toString
	public String toString() {
		return "�� �̸��� " + name + " �̰�, ���� " + kinds + " �Դϴ�. ";
	}

	public abstract void speak();

}
