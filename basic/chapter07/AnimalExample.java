package chapter07;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		
		// ������ �ڵ� Ÿ�� ��ȯ
		
		Animal animal = null;
		animal = new Dog(); // �ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣ��
		animal.sound();
		animal = new Cat(); // �ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣ��
		animal.sound();
		System.out.println("-----");
		
		// �޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
