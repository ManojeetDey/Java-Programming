abstract class Animal {
	// Abstract method(does not have a body)
	public abstract void animalSound();

	// regular method
	public void displaycolour() {
		System.out.println("The colour is black");
	}
}

//subclass (inherited from Animal)
class Crow extends Animal {
	public void animalSound() {
		// the body of animalSound() provided here
		System.out.println("The crow says: kaa kaa");
	}
}

public class Abstract1 {

	public static void main(String[] args) {
		// upcasting is used here 
		Animal c = new Crow();
		c.animalSound();
		c.displaycolour();

	}

}
