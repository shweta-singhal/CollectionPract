package collectionExamples;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet {
	public static void main(String args[])
	{
		Set set = new TreeSet();
		set.add(43);
		set.add(4);
		set.add(23);
		set.add(43);
		set.add(48);
		set.add(67);
		set.add(4);
		set.add(65);
		set.add(1);
		set.add(44);
		
		System.out.println(set);
	}
}
