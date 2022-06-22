package j;
interface MyInterfaces{
	
	default void newDefaultMethod() {
		System.out.println("new default method");
	}
	static void newStaticMethod() {
		System.out.println("new static method");
	}
	void existingMethod(String str);
}
public class DefaultStaticMethodEx implements MyInterfaces{
	public void existingMethod(String str) {
		System.out.println("string" +str);
	}
	public static void main(String[] args) {
		DefaultStaticMethodEx obj = new DefaultStaticMethodEx();
		obj.newDefaultMethod();
		MyInterfaces.newStaticMethod();
		obj.existingMethod("this is new java 8 feature");
		
	}

}
