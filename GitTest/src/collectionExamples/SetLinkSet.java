package collectionExamples;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkSet {

	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add(23);
		set.add("null");
		set.add(21);
		set.add(2);
		set.add(1);
		
		System.out.println(set);
		
		set.remove("null");
		System.out.println(set);
	}

}
