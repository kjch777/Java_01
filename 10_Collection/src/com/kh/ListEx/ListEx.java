package com.kh.ListEx;
/*
     ┌     Vector : Java 1 버전 대에서 제일 먼저 등장하여 사용된 것
List ├  ArrayList : 검색할 때 좋다. 하지만 데이터 삽입과 삭제가 빈번한 경우, 부적합하다. 
     └ LinkedList : 검색에는 부적합하다. 하지만 데이터 삽입과 삭제를 진행할 때는 좋다.
*/
import java.util.ArrayList; // 항상 .util 이 기본이다.
import java.util.List;

/*
 List : 자료를 순차적으로 나열한 자료 구조로, 배열과 비슷하다.
 		인덱스가 존재한다.
 		인덱스로 순서가 구분되기 때문에, 중복 데이터 저장이 가능하다.
 		인터페이스이기 때문에, 객체로 생성이 불가능하다.
 		하지만 다형성으로 이용할 수 있다.
 		
 사용 예제 
 	List list = new ArrayList(3); // 3칸짜리 생성
 	
 E(Element) : 요소를 뜻하는 상징적인 글자로, 자료형이 아니다.
 		   == Object String Student 등, 객체를 가리지 않고 넣을 수 있다.
 */
public class ListEx {
	
	public static void main(String[] args) {
		
		// List 객체 생성하고, ArrayList 인스턴스 생성
		/*
		 List list = new ArrayList(3); 에서 List 한 다음, < > 로 타입을 지정해주지 않아서 노란색 경고가 발생한 것이다.
		 
		 만약 노란색을 없애고 싶다면, List<자료형>을 넣어서 사용할 수 있다.
		 List<String> list = new ArrayList(3); 
		 
		 또는, List<Object> 를 사용하면 된다.
		 Object 는 String Integer Boolean 등등 모두 사용 가능하다.
		 */
		List list = new ArrayList(3); // 3칸을 넣을 수 있다.
		list.add("아무거나"); // add 를 사용하여 추가할 수 있다. 1칸째
		list.add(new Object()); // 2칸째
		list.add(123123); // 3칸째
		
		list.add(false); // 4칸째지만 
		// 3칸을 초과해도 크기가 자동으로 늘어나기 때문에, 에러가 발생하지 않는다.
		
		System.out.println(list);
		
	}

}
