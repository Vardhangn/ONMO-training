package j;
interface Sayable{
	void say();
}

public class MethodRefereneEx {
	public static void saySomething() {
		System.out.println("this is static method");
	}
	public static void main(String[] args) {
		Sayable sayable = MethodRefereneEx :: saySomething;
		sayable.say();
	}

}
