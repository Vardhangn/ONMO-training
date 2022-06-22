package j;

public class AbstractMethod {
	public void display() {
	System.out.println("in public");
	}
}abstract class Language{
	public void display() {
		System.out.println("this is java programming");
	}
}
class Main extends Language{
	public static void main(String[]  args) {
		Main obj = new Main();
		obj.display();
	}
}
