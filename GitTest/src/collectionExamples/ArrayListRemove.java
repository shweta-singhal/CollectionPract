package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		int[] arr = {1,4,3,24,5,65};
		for(int i=0; i<arr.length; i++)
		{
		list.add(arr[i]);
		}
		
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
