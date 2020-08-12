package FactoryDesignPatters;

public class PageFactory {

	public static void main(String[] args) {
		
		
		OperatingsystemFactory osf = new OperatingsystemFactory();
		OS os =osf.getInstance("Window");
		os.show();
	}

}
