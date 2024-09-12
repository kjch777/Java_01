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
				// ���� �߸� �ʼ� �����ڿ��� �ܾ �����ͼ� ���غ���.
				animals[i] = new Rabbit ("�䲤�� " + i, "�䳢", random.nextInt(20) + 1, "�Ͼ��");
			} else {
				animals[i] = new Horse ("�̷� " + i, "��踻", "������ī", "���");
			}
		}
		
		// for - each �� ���
		for(Animal a : animals) {
			a.speak();
		}

	}

}
