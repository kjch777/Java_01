package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		// ������ 5¥�� Animal Ÿ���� ��ü �迭 �����Ͽ�
		Animal[] animals = new Animal[5];

		// �� �ε������� ��������
		Random random = new Random();

		// Dog, Cat Ŭ������ �̿��Ͽ� ��ü �����ϰ�
		for (int i = 0; i < animals.length; i++) {
			// ���� �������� true false �� �������� �� ����
			// if(random.nextBoolean()) : �������� ������ ���� ���´�.
			if (random.nextBoolean()) {
				// true �� ������, false �� ����� �� ĭ�� ���� ����
				// Dog(String name, String kinds, int weight);
				// ����� �̸��� ������ �� ����� 1 ����� 2 ... ������ �ϰڴ�.
				// "����� " + �ڿ� �ٴ� ����
				// ����� ���� �� ����� �����Դ� 1 ~ 30 kg ���� ����
				animals[i] = new Dog("����� " + i, "��", random.nextInt(30) + 1);
			} else {
				animals[i] = new Cat("����� " + i, "�����", "����", "�����");
			}
			
		}
		// System.out.println(animals[0]); ���� ����غ��� ������ ������ ã�� �� �ִ�.

		// �ݺ������� �� �ε����� ��ü�� speak() �޼ҵ� ����
		for (Animal a : animals) {
			a.speak();
		}

	}

}
