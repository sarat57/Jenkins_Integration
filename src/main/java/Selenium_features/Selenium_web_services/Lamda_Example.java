package Selenium_features.Selenium_web_services;

public class Lamda_Example {

	public static void main(String[] args) throws InterruptedException {
		Runnable  tc1 =() -> {
						for(int i=0;i<4;i++)
						{
							System.out.println("Executing Test Case 3 and the test step number is "+i);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}	
					};
		Runnable  tc2 = ()-> {
						for(int i=0;i<4;i++)
						{
							System.out.println("Executing Test Case 4 and the test step number is "+i);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					};
		Thread t1 = new Thread(tc1);
		Thread t2 = new Thread(tc2);
		t1.start();
		Thread.sleep(100);
		t2.start();
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());		
		System.out.println("This is my final report after execution");
		
		
	}

}