package example.array;

import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc=new Scanner(System.in);	
	int[] arr= new int[5];
	public void readData()
	{
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	public void display()	{
		System.out.println("The array elements are: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		ArrayExample1 obj=new ArrayExample1();
		obj.readData();
		obj.display();
		
	}

}
