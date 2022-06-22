package threadsAndInnerClasses;
class Polygon {
	public void display() {
		System.out.println("inside polygon class");
	}
}
class AnonymousDemo{
	public void createClass() {
		Polygon p1 = new Polygon() {
			public void display() {
				System.out.println("inside anonymous class");
				
			}
		};
		p1.display();
	}
}
public class AnonymousClass {
	public static void main(String[] args) {
		AnonymousDemo an = new AnonymousDemo();
		an.createClass();
	}

}
