package com.kh.ThreadEx;
/*
 process : program + success = 프로그램 실행 성공을 뜻한다. 즉, 프로그램 실행 중이라는 뜻이다.
 
 Thread(쓰레드) : 실 
 		쓰레드란, 컴퓨터에서 실제로 작업을 수행하는 것을 의미한다.
 		2개 이상의 쓰레드를 가지는 프로세스를 멀티 쓰레드라고 한다.
 쓰레드를 생성하는 방법
    1. Runnable 인터페이스를 사용하기 : 클래스 이름 옆에 implements Runnable 작성 // 인터페이스를 가져올 때는 implements
 		2. Thread 클래스를 상속받기 : 클래스 이름 옆에 extends Thread 작성 // 클래스를 가져올 때는 extends
 	메서드와 관계 없이, 쓰레드를 시작할 때는 .start(); 를 사용해야 시작할 수 있다.
 	쓰레드에서 실행 순서는, 쓰레드가 컴퓨터 안에서 생성되고 시작되는 지점에 따라 달라진다.
 	
		 쓰레드의 기본 우선 순위는 5 이다.
		 우선 순위는 1 ~ 10 까지 존재한다.
		 
	  Thread.MIN_PRIORITY = 우선 순위 1 : CPU 자원을 가장 적게 확보
	 Thread.NORM_PRIORITY = 우선 순위 5 : (기본)
	  Thread.MAX_PRIORITY = 우선 순위 10 : CPU 자원을 가장 많이 확보
	  
	  만약, 우선 순위에서 1, 5, 10 이외의 우선 순위를 사용하고 싶다면
	  예제 : 우선 순위를 3 으로 하고 싶다면
	        setPriority(3);
	        우선 순위를 6 으로 하고 싶다면
	        setPriority(6);
	  
 쓰레드에서 말하는 우선 순위는, 실행 순서가 아니다. CPU 자원을 누가 더 많이 확보하는가 이다.
 우선 순위가 높다고 해서 항상 먼저 실행되는 것은 아니다.
  	
	  .sleep(); : ~초간 잠자는 상태 유지 // 알아서 ~초 후에 다시 실행
	  
	  ▼ 아래 2개는 현재 사용이 권장되지는 않는다.
	.suspend(); : 일시 중지 // 알아서 재실행 되지 않는다.
	 .resume(); : 일시 중지한 쓰레드 다시 시작  // 이걸로 재실행 해줘야 다시 실행 된다.
	   
	   .wait(); : 특정 조건이 충족될 때까지 대기하게 할 때 사용한다.
	 .notify(); : 대기 중인 쓰레드를 깨워서, 특정 작업을 진행하게 할 때 사용한다.
	  
	  .await(); : Condition 객체에 속한 쓰레드를 일시적으로 대기 상태로 만든다.
	 .signal(); : await 에 의해 대기하고 있는 쓰레드를 깨운다.
 */
public class ThreadEx extends Thread {
	public void run() {
		System.out.println("쓰레드 실행 중");
		try {
			Thread.sleep(1_000); // 1초 동안 정지 하겠다는 코드
			System.out.println("1초 끝");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
	}
}
