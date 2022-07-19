package collectionExample;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> ls=new ArrayList<String>();
		ls.add("harsha");
		ls.add("Athulya");
		ls.add("amina");
	
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		ls.remove(0);
		System.out.println(ls);
		/*for(String element: ls)
		{
			System.out.println(element);
		}*/
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		ls.clear();
		System.out.println(ls);

	}

}
