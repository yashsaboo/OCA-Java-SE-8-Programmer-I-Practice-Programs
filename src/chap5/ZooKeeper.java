package chap5;

class Animal {
	protected String getName() {
		return "Animal";
	}
}

class Gorilla extends Animal {
	public String getName() { // DOES NOT COMPILE
		return "Gorilla";
	}
}

public class ZooKeeper {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.getName());
	}
}