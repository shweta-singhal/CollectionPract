package collectionExamples;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class LinkListRemove {
	
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.add(32);
		list.add(4);
		list.add(3);
		list.add(324);
		list.add(23);
		list.add(3);
		list.add(3);
		System.out.println(list);
		
		list.removeFirst();
		list.removeFirstOccurrence(3);
		System.out.println(list);
		
		Set set = new TreeSet();
		set.addAll(list);
		System.out.println(set);
	}

}
