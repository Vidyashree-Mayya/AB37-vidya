package access_specifier;
//Assignment 58 WAP to access 4 different access specifiers within the package

public class Class_one {

	public static void main(String[] args)
	{
		Class_two c1= new Class_two();
		c1.add();
		c1.div();
		c1.mul();
		//c1.sub(); within the package cannot access the private method
		

	}

}
