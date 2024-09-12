package com.kh.javaAPIEx;
/*
 Object : 모든 자바 클래스 중에 최상위 클래스로,
          모든 클래스가 기본으로 상속받는 클래스이다.
		  Object 클래스는 기본으로 사용한다 라는 개념이 있기 때문에,
		  굳이 new Object 를 써서 사용 할 필요가 없다.
		  모든 클래스는 기본으로 Object 클래스를 사용할 수 있게 만들어졌다.
		  대표 메서드 : equals toString
   
     Ob : Old Boy
   ject : 나눠서 맡는다
 */
public class ObjectEx {

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Object에서부터 내려오는 메서드입니다.";
	}
	
	public static void main(String[] args) {
		// Object는 기본이기 때문에, 굳이 new 를 써서 공간 생성 할 필요는 없다.
		// 하지만 그렇다고 해서 만들 수 없는 것은 아니다.
		// Object 위에 마우스를 올리면 나오는 노란색 화면에서, 하단 @ 옆에 있는 아이콘을 누르면
		// Object 파일로 이동해서 볼 수 있다.
		Object 오브젝트 = new Object();
		
		System.out.println(오브젝트);

	}

}
