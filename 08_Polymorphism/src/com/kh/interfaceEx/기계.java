package com.kh.interfaceEx;
/*
 interface : class ���� ������ ����� �뵵 
 	�ʵ忡 �ۼ��ϴ� ��� ������ �ڵ�����
 		public static final �� �ۼ��� �ȴ�.
 	���� �տ� public static final �� ������ �ʾƵ� �˾Ƽ� �ٴ´�.
 	
 	�޼��忡 �ۼ��ϴ� ��� �޼��� �տ�
 		    public abstract �� �˾Ƽ� �ڵ����� �پ �ۼ��ȴ�.
 		    
 Q : interface �� �� public static final �� public abstract �� �ٴ°�?
 A : interface �� �ڹٿ���, �ٸ� Ŭ�������� ������ �޼����� ���� �����ϴ� ������ �Ѵ�.
 	 interface �� �ۼ��Ǵ� �ʵ�� �޼����, �ٸ� Ŭ�������� ������ ���� ����ϴ� ��
 	 
 	 interface ���� �ۼ��� ���� ����Һ��� ������ ����̴�.
 */

public interface ��� {

// �ʵ�
	// (public static final) �� �ڵ����� �����Ǿ� �ִ�.
	// public static final int ��Ʈ = 220; �ΰų� �ٸ�����.
						   int ��Ʈ = 220;
						   
	// interface �� �߻� �޼��常 �ۼ��� �����ϴ�.
		   public abstract void �����ѱ�();
		   
		// public abstract �� �ڵ����� �����Ǿ� �ִ� �����̴�.   
		// public abstract void ��������(); �� �Ȱ���.
						   void ��������();
}
