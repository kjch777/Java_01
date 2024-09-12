package com.kh.oop.constructor;

public class ConstructorEx {
	
	
	// 필드 변수명 정의
	public String name; // 값이 없다.
	public String phNo;
	public	  int idNo;
	public    int money;
	
	public static void main(String[] args) {
		/*
		 생성자
		 변수를 원하는 값으로 초기화 할 수 있다.
		 
		 초기값 = 0; 일 때, 초기값에 1을 넣어주면
		 초기값이 1로 초기화 된다.
		 
		 1. 생성자는 반환값이 없다. (return 사용 X, void X 앞 2개로 선언하지 않는다.)
		 2. 객체(클래스)를 초기화 하는 방법이 많을 경우, 전부 사용이 가능하다.
		 
		 선언 예제
		 1. 기본(초기) 생성자 : 필수로 작성해야 하는 값이 없다.
		 	public 클래스 이름 () {
		 	
		 	}
		 	
		 2. 필수 생성자 : 필수로 받아와야 하는 값이 존재한다.
		 			  필수로 받아와야 하는 값은, 필드에 작성된 값만 받아오는 것이 가능하다.
		 	public 클래스 이름 (String aa, int bb, char cc) { 
		 		  (변수명과 필드값은 같아야 한다.)
		 		  this.변수명1 = aa;
		 		  this.변수명2 = bb;
		 		  this.변수명3 = cc;
		 	}
		 	
		 3. 값이 지정된 생성자 : 필드나 생성자에서 값을 지정해준 생성자
		 */
	}

	
	// 생성자는 기본, 필수, 값을 지정한 생성자로 나뉜다.
	// 기본 생성자 : 아무것도 필수로 넣지 않은 생성자
	public ConstructorEx() {
		// 생성자 이름은 클래스 이름과 대/소문자 하나까지 반드시 똑같아야 한다.
	} 
	
	
	// 필수 생성자 : 괄호 안에 매개변수가 필수로 들어가야 하는 생성자
	public ConstructorEx(String inputName /* 매개변수 */) {
		// 생성자 이름은 클래스 이름과 대/소문자 하나까지 반드시 똑같아야 한다.
		this.name = inputName;
		// 필드값 name 을, 매개변수 inputName 을 사용하여 값을 변환시킨 것
	}
	
	public ConstructorEx(String inputName, String inputNumber) {
		//				(매개변수의 변수명은 중요하지 않고, 자료형의 순서가 중요하다.)
		//				(순서가 같아도 갯수가 다르면 에러가 나지 않는다.)
		this.name = inputName;
		this.phNo = inputNumber;  
	}
	
	public ConstructorEx(String inputName, String inputNumber, int inputID) {
		this.name = inputName;
		this.phNo = inputNumber;
		this.idNo = inputID;
	}
	
	public ConstructorEx(String inputName, String inputNumber, int inputID, int inputMoney) {
		this.name = inputName;
		this.phNo = inputNumber;
		this.idNo = inputID;
		this.money = inputMoney; // 필드에서 값이 비어있는 변수명을 불러와서 값을 새로 넣어준 것
	}
	
	
	/*
	 값을 지정한 생성자 : 초기의 값만 지정해주기 때문에 매개변수를 필수로 넣어주지 않아도 되지만,
	 지금은 기본 생성자와 생김새가 똑같아서 오류가 나기 때문에, 임의로 매개변수를 넣어준다.
	 보통은 public ConstructorEx(){} 로 사용한다.
	 거의 안 쓴다. 
	 */ 
	public ConstructorEx(int a) {
		// 기본으로 값을 지정해서 전달하는 생성자
		// 생성할 때부터 값을 지정해주고, 추후 값을 변경할 수 있도록 해준 생성자이다.
		
		name = "이름을 입력해주세요.";
		phNo = "번호를 입력해주세요."; // String 이기 때문에 문자열을 값으로 넣어주어야 한다.
		idNo = 7; // int 이기 때문에 숫자를 값으로 넣어주어야 한다.
		money = 0;
	}

}
