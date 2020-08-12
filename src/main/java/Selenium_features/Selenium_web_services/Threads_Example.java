package Selenium_features.Selenium_web_services;

public class Threads_Example {

	public static void main(String[] args) throws InterruptedException {
		
		
		TestCase1  tc1 = new TestCase1();

		TestCase2  tc2 = new TestCase2();
				
		tc1.start();
		Thread.sleep(100);
		tc2.start();
	}

}


class TestCase1 extends Thread
{
	
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Executing Test Case 1 and the test step number is "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}

class TestCase2 extends Thread
{
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Executing Test Case 2 and the test step number is "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}