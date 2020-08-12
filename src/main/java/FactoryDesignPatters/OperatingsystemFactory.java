package FactoryDesignPatters;

public class OperatingsystemFactory {
	
	public OS getInstance(String name)
	{
		if(name.equalsIgnoreCase("Windows"))
		{
			return new Windows();
			
		}
		else 
		{
			return new Andriod();
		}
		
	}

}
