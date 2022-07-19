package encapsulation;

public class Customer {

	
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setMoney(10000);
		obj.calculate();
		double value=obj.getMoney();
		System.out.println(value);
		
	}

}
