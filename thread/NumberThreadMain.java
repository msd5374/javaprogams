
public class NumberThreadMain {
	
	public static void main(String[] args) {
		NumberThread thread = new NumberThread();
		thread.setName("-- Number Thread --");
		thread.start();
//		thread.run();
		
		Thread currentThread = Thread.currentThread();
		String name = currentThread.getName();
		System.out.println("Main Method thread name :: "+name);
		
		System.out.println("End of the Main Program");
		System.out.println("End of the Main Program");
		System.out.println("End of the Main Program");
		System.out.println("End of the Main Program");
	}

}
