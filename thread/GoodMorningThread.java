

public class GoodMorningThread extends Thread  //small piece of code in executiioon   
{
	@Override
	public void run() {
		//super.run();
		String currentThread = Thread.currentThread().getName();
		//String name = currentThread.getName();
		System.out.println("Good Morning :: "+currentThread);
		for(int i=0;i<20;i++)
			System.out.println("Good Morning");
	}
}
