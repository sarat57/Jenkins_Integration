package Java_Program;

public class Single_ton_Ex {

	public static void main(String[] args) {
		abc a = abc.instance();
		
		

	}

}


class abc
{
	
	static abc obj= new abc();
	
	private abc () {
		
	}
	
	public static abc instance()
	{
		return obj;
	}
	
}