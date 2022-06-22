package threadsAndInnerClasses;
class OuterC{
	public void outerMethod()
	{
		class InnerC{
			public void innerMethod() {
				System.out.println("inner method");
			}
		}
		System.out.println("outer method");
	}
	
}
public class MethodLocalInner {
	public static void main(String[] args) {
		OuterC ob = new OuterC();
		ob.outerMethod();
	}

}
