package threadsAndInnerClasses;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("My thread- start"+Thread.currentThread().getName());
	}

}
