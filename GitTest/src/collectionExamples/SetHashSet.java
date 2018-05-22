package collectionExamples;

import java.util.HashSet;
import java.util.Set;

public class SetHashSet {

	public static void main(String agrs[])
	{
		Set set = new HashSet();
		set.add("3");
		set.add(5);
		set.add(7);
		set.add(5.13);
		set.add(23);
		set.add(43);
		set.add(43);
		set.add(23);
		set.add(1);
		set.add(6);
		set.add(8);
		
		System.out.println(set);
		
		boolean result = set.contains(10);
		System.out.println(result);
		
		set.remove(23);
		System.out.println(set);
	}
}
