package j;
class A{}
class B extends A{}
public class InstanceOfDemo {
	public static void main(String[] args) {
		B objOfClassB = new B();
		System.out.println("obj of class b is instance of b" + (objOfClassB instanceof B));
		System.out.println("obj of class b is instance of b" + (objOfClassB instanceof A));
				
	}

}
