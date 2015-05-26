package Adapter.Iternum;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationIteratorTestDriver {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		Enumeration<String> enumeration = v.elements();
		EnumerationIterator enumerationIterator = new EnumerationIterator(enumeration);
		while(enumerationIterator.hasNext()) {
			System.out.println(enumerationIterator.next());
		}
	}
}
