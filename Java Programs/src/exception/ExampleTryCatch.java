package exception;

public class ExampleTryCatch {
	private int i, j;
	int[] a=new int[4];

	public void operations() throws ArithmeticException {
		int k;
		i = 30;
		j = 2;
		try {
			k = i / j;
			System.out.println("k= " + k);
			if(k>10)
				throw new ArithmeticException();
			
			
		}
		catch (ArithmeticException e) {
			System.out.println("k canot greater than 10 ");
		}
		
		
		
		
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("end"); 

	}

	public static void main(String[] args) {
		ExampleTryCatch obj = new ExampleTryCatch();
		obj.operations();

	}

}
