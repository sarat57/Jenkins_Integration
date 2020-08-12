package Selenium_features.Selenium_web_services;

public class DeadLock_class {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();

		Thread2 t2 = new Thread2();

		t1.start();
		t2.start();

	}
	
}

class Thread1 extends Thread {
	public void run() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object");
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}

}

class Thread2 extends Thread {
	
	  public void run() { synchronized (Integer.class) {
	  System.out.println("Aquired lock on Integer.class object"); synchronized
	  (String.class) { System.out.println("Aquired lock on String.class object"); }
	  } }
	 
}
