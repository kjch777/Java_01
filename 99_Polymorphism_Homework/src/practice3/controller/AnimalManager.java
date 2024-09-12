package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		// 사이즈 5짜리 Animal 타입의 객체 배열 생성하여
		Animal[] animals = new Animal[5];

		// 각 인덱스별로 무작위로
		Random random = new Random();

		// Dog, Cat 클래스를 이용하여 객체 생성하고
		for (int i = 0; i < animals.length; i++) {
			// 만약 랜덤으로 true false 를 가져오게 한 다음
			// if(random.nextBoolean()) : 랜덤으로 거짓과 참이 나온다.
			if (random.nextBoolean()) {
				// true 면 강아지, false 면 고양이 를 칸에 넣을 예정
				// Dog(String name, String kinds, int weight);
				// 댕댕이 이름을 지어줄 때 댕댕이 1 댕댕이 2 ... 식으로 하겠다.
				// "댕댕이 " + 뒤에 붙는 숫자
				// 댕댕이 종은 개 댕댕이 몸무게는 1 ~ 30 kg 까지 측정
				animals[i] = new Dog("댕댕이 " + i, "개", random.nextInt(30) + 1);
			} else {
				animals[i] = new Cat("길냥이 " + i, "고양이", "골목길", "삼색이");
			}
			
		}
		// System.out.println(animals[0]); 으로 출력해보면 에러의 이유를 찾을 수 있다.

		// 반복문으로 각 인덱스별 객체의 speak() 메소드 실행
		for (Animal a : animals) {
			a.speak();
		}

	}

}
