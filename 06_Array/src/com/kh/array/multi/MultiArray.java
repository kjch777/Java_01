package com.kh.array.multi;
/*
������ �迭�̶�?
	2���� �̻��� �迭��, �迭 ��ҷ� �ٸ� �迭�� ������ �迭�̴�.
	
  ��� ���� (2���� �迭 ����)
  	�ڷ���[][] �迭��;
  	�ڷ��� �迭��[][];
  	�ڷ���[] �迭��[];
  	
  	�ڷ���[][] �迭�� = new �ڷ���[���ڰ�][���ڰ�];
  	int[][] arr = {
  					  {10, 20, 30}
  					  {40, 50, 60}
  					    			}
*/
public class MultiArray {
	
	public static void main(String[] args) {
		// 2���� �迭 �����
		int[][] numbers = {
							 {1, 2, 3},
							 {4, 5, 6},
							 {7, 8, 9}
										};
		System.out.println("2���� �迭 ����غ���");
		
	    numbers[0][0] = 1;
	    
	    System.out.println(numbers[0][0]);
	    System.out.println(numbers[0][1]);
	    System.out.println(numbers[0][2]);
	    System.out.println(numbers[1][0]);
	    System.out.println(numbers[1][1]);
	    
	    // for ������ ����ϱ�
	    for(int i = 0; i < numbers.length; i++) {
	    	
	    	for(int j = 0; j < numbers[i].length; j++) {
	    		System.out.print(numbers[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
	}

}
