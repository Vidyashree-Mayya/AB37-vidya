package access_specifier;
//within the class Assignment -57
//Create a class with 4 different methods other than main method with 4 different access specifiers and try to access them within class

public class AccessSpecifer
{
	public void add()
	{
		System.out.println("This is addition");
	}

	private void sub()

	{
		System.out.println("This is Substraction");
	}
	protected void mul()
	{
		System.out.println("This is Multiplicaion");
	}
	
	void div()
	{
		System.out.println("This is Division");
	}
	public static void main(String[] args) 
	{

		AccessSpecifer a1=new AccessSpecifer();
		a1.add();
		a1.div();
		a1.mul();
		a1.sub();

	}

}
