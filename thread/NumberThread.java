

public class NumberThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		//write your logic
		//this logic will be executed in the separate thread
		Thread currentThread = Thread.currentThread();
		String name = currentThread.getName();
		System.out.println("NumberThread class :: "+name);
		for(int i=0;i<10;i++)
			System.out.println(i);
	}
	
}
