package com.kh.abstractEx;

// �������� �ۼ��� �޼��带 ����ϰڴ�. : extends ����

// ���� Ŭ������ ���� �ϼ����� ���� ���赵

public class �ﰢ�� extends ���� {

// �ʵ�
	private double �غ�;
	private double ����;
	
// �޼���
	// �ʼ� ������
	// ������ �ִ� �ʵ带 �ۼ������� �ʾƼ� ������ �� ���̴�.
	// �������� String ������ �ۼ�����ٸ�, �ﰢ�������� String ����� super(����)�� �ۼ������ �Ѵ�.
	public �ﰢ��(String ����, double �غ�, double ����) {
		super(����);
		this.�غ� = �غ�;
		this.���� = ����;
	}
	
	@Override
	public double ��������() {
		return 0.5 * �غ� * ����;
	}
	/*
	 Math : ����
	  	sqrt : �������� ����ϴ� �޼���
	  	       ������ : � ���� ���ؼ� ���� �����, ������ ���� �ǵ��� �ϴ� �� 
	  	 pow : �־��� ���� �ŵ� �����ϴ� �޼��� 
	  	     �ŵ� ���� : �Ȱ��� ���� ���� �ݺ��ؼ� ���ϴ� �� 
	 */
	@Override
	public double �����ѷ�() {
		double ���� = Math.sqrt(Math.pow(�غ�, 2) + Math.pow(����, 2));
		return �غ� + ���� + ����;
	}
	
}
