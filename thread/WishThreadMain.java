

public class WishThreadMain {
	
	public static void main(String[] args) {
		GoodMorningThread thread1 = new GoodMorningThread();
		
		GoodEveningThread runnable = new GoodEveningThread();

		Thread thread2 = new Thread(runnable);
		
   		thread1.start();
         	thread2.start();
	                   //   thread1.run();
                             // thread2.run();	
		
		
		//Thread currentThread = Thread.currentThread();
		String name = Thread.currentThread().getName();
		System.out.println("Main Method thread name :: "+name);
		System.out.println("End of the program!");
	}

}
