package threadsAndInnerClasses;

public class RunnableEx implements Runnable {
	public static void main(String[] args) {
		Thread Thread1 = new Thread("Guru1");
		Thread Thread2 = new Thread("Guru2");
		Thread1.start();
		Thread2.start();
		System.out.println("thread names are: ");
		System.out.println(Thread1.getName());
		System.out.println(Thread2.getName());
	}

	@Override
	public void run() {
		
		
	}

}
