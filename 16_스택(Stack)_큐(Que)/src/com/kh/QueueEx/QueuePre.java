package com.kh.QueueEx;

import java.util.*;

public class QueuePre {
	public static void main(String[] args) {
		Queue<Integer> ť = new LinkedList<>();
		
		ť.offer(80);
		ť.offer(60);
		ť.offer(40);
		ť.offer(20);
		
		int temp1 = ť.poll();
		System.out.println("poll : " + temp1);
		
		int temp2 = ť.peek();
		System.out.println("peek : " + temp2);
		
		boolean temp3 = ť.isEmpty();
		System.out.println("isEmpty : " + temp3);
	}
}
