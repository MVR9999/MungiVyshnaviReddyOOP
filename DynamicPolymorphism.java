class Animal {
	public void eat() {
		System.out.println("This animal eats insects.");
	}
}

class Bird extends Animal {

	public void eat() {
		System.out.println("This bird eats seeds.");
	}

}

class DynamicPolymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Bird();
		myAnimal.eat();

		Bird myBird = new Bird();
		myBird.eat();
	}
}