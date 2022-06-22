package threadsAndInnerClasses;
class MotherBoard{
	static class USB{
		int usb2 = 2;
		int usb3 = 1;
		int getTotalPorts() {
			return usb2 + usb3;
		}
			
	}
}
public class StaticInner {
	public static void main(String[] args) {
		MotherBoard.USB usb = new MotherBoard.USB();
		System.out.println("total ports =  "  +usb.getTotalPorts());
	}
	

}
