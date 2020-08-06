

public class GoodEveningThread implements Runnable{



	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();




		currentThread.setName("mythread");
		String name =currentThread.getName();
		System.out.println("Good Evening :: "+name);
		for(int i=0;i<20;i++)
			System.out.println("Good Evening");
	}
}
