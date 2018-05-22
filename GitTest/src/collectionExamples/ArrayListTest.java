package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(23);
		System.out.println(list.get(1));
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//list.add(32);
			System.out.println(itr.hashCode());
		}
		
		System.out.println("Changes From Varun");
	}

}
