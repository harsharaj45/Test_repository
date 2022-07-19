package superexample;

public class Child extends Parent {

public Child()
{
	super();
	System.out.println("child class constructor");
}
	public void print(int a)
	{
		System.out.println("child class method");
	}

	public void sum()
	{
		System.out.println("child class sum");
	}
}
