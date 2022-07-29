package sampleInterface;


interface SampleInterface3 extends SampleInterface1,SampleInterface2{
int print2(int a);
}

public class InterfaceExample implements SampleInterface3 {
int a;
	public void sayHello()
{
	System.out.println("Hello");
}
public int print(int a)
{
	this.a=a;
	a+=10;
	return a;
}
	public static void main(String[] args) {
		InterfaceExample obj=new InterfaceExample();
		obj.sayHello();
		System.out.println("result : "+obj.print(30));
				
		


	}
	@Override
	public int print2(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
