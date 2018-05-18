package collectionExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinklistAdd {
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.addFirst(20);
		list.addLast(2);
		list.add(4);
		list.add(90);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
