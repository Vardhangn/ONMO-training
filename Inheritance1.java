package j;
class Animal{
	public void eat() {
		System.out.println("i can eat");
	}
	}
class Dog extends Animal{
	//@override
	public void eat() {
		System.out.println("i can eat dog food");
		
	}
	public void bark() {
		System.out.println("i can bark");
	}
	
	
}
public class Inheritance1 {
	public static void main(String[] args) {
		Dog retriever = new Dog();
		retriever.eat();
		retriever.bark();
		
	}
}
	


