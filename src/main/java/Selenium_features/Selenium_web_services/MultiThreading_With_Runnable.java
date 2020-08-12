package Selenium_features.Selenium_web_services;

public class MultiThreading_With_Runnable {

	public static void main(String[] args) throws InterruptedException {
		
		
		Runnable  tc1 = new TestCase3();

		Runnable  tc2 = new TestCase4();
				
		Thread t1 = new Thread(tc1);
		Thread t2 = new Thread(tc2);
		
		
		t1.start();
		Thread.sleep(100);
		t2.start();
	}

}

class TestCase3 implements Runnable
{
	
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Executing Test Case 3 and the test step number is "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class TestCase4 implements Runnable
{
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Executing Test Case 4 and the test step number is "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
}