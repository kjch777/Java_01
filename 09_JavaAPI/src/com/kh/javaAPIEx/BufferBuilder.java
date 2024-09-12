package com.kh.javaAPIEx;
/*
        String : ���� �� ����;
  				 ���ڳ� ���ڿ��� ����� �� ��� ��, ������ �ٸ� ���� �־��ִ� ������
  				 �����ϰų� �����ϱ�� �����.
  				 
  // �޸� ũ�Ⱑ ���� �� �ִ� ȯ��
  // �����ϰ� �����ص� ���� ����.
  StringBuffer : ���� �����忡�� ���ÿ� ���Ǿ, �����ϰ� �۾��� ó���� �� �ִ�. (����ȭ)
 StringBuilder : �ϳ��� �����忡�� ����ϴ� ���� ȿ�����̴�. (�񵿱�ȭ, ��ü�� �̰� ���°� ��õ�Ѵ�.)
 
        Thread : ��ǻ�� ������ ����Ǵ�, �������� ���� �帧
          ����ȭ : ��û�� ����� ���ÿ� �Ͼ�� ���� ���Ѵ�.
         �񵿱�ȭ : ��û�� ����� �� �ڸ����� ���ÿ� �Ͼ�� �ʴ� ���� ���Ѵ�. 
 */
public class BufferBuilder {
	// ���� �ൿ�� ������ �� ����� �ִ°� �޼����̴�.
	
	// �ٷ� �����ϰ� ����ϰ� �ʹٸ� main �޼��带 ������ش�.
	public static void main(String[] args) {
	
		// 1. StringBuffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello,");
		buffer.append(" World.");
		System.out.println(buffer.toString());
		
		System.out.println("============");
		
		// 2. StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append("Hello,");
		builder.append(" World.");
		System.out.println(builder.toString());
		
	}
	
}
