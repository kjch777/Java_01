package com.kh.ThrowsEx;
/*
 Ŭ���� �̸�(=���ϸ�) ��ġ�� �ѹ��� �ۼ��ؼ�, try catch ���� �ۼ��� ���� �����ش�. 
 try - catch ���� �ۼ��ϰų�, throws �� ����Ͽ� ���� ó���� ���ָ� �ȴ�.
 */
public class ThrowsEx {

	public ThrowsEx() {
		// Static void �� ����� �ȴٸ�, �⺻ �����ڷ�..?
	}
	
	public void �޼���() throws Exception{
		System.out.println("���ܰ� �߻��߽��ϴ�.");
	}
	
	public static void main(String[] args) throws Exception {
		ThrowsEx ���ο���� = new ThrowsEx();
		���ο����.�޼���();
	}
	
}
