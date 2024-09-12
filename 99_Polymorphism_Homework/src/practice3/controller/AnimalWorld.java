package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Horse;
import practice3.model.vo.Rabbit;

public class AnimalWorld {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[5];
		
		Random random = new Random();
		
		for(int i = 0; i < animals.length; i++) {
			if(random.nextBoolean()) {
				// 에러 뜨면 필수 생성자에서 긁어서 가져와서 비교해보자.
				animals[i] = new Rabbit ("토깽이 " + i, "토끼", random.nextInt(20) + 1, "하얀색");
			} else {
				animals[i] = new Horse ("이랴 " + i, "얼룩말", "아프리카", "얼룩");
			}
		}
		
		// for - each 문 사용
		for(Animal a : animals) {
			a.speak();
		}

	}

}
