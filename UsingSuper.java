package j;
class Animals{
	public void eat() {
		System.out.println("i can eat");
	}
	}
class Dogs extends Animal{
	//@override
	public void eat() {
		super.eat();
		System.out.println("i can eat dog food");
		
	}
	public void bark() {
		System.out.println("i can bark");
	}
	
	
}
public class UsingSuper {
	public static void main(String[] args) {
		Dogs labrador = new Dogs();
		labrador.eat();
		labrador.bark();

	}
}
