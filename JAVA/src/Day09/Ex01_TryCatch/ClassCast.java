package Day09.Ex01_TryCatch;

class Animal {  }

class Dog extends Animal {  }

class Cat extends Animal {  }

public class ClassCast {
	
		// (부모 클래스)		(자식 클래스)
		// Animal	   <--- Dog, Cat
		// Animal = Cat 으로 업캐스팅한 이후에
		// 다시 Animal 을 Dog로 다운캐스팅 할 수 없다.
		// - Cat 을 Dog로 타입 변환할 수 없다.
	public static void changeToDog(Animal animal) {
		
		try {
			Dog dog = (Dog) animal;
		}
		
		catch(ClassCastException e) {
			System.err.println("Cat 을 Dog 로 변환할 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeToDog(dog); // Animal animal = new Dog();		Dog dog = (Dog) animal; // dog
		
		Cat cat = new Cat();
		changeToDog(cat); // Animal animal = new Cat();		Dog dog = (Dog) animal; // cat -> 불가능
	}
	
	

}
