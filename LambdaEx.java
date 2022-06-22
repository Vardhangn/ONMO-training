package j;
interface MyInterface{
	public void myMethod();
	
}
public class LambdaEx {
	public static void main(String[] args) {
		int variable = 10;
		MyInterface myInterface = () -> {
			System.out.println("variable = " +variable);
			
		};
		myInterface.myMethod();
	}

}
