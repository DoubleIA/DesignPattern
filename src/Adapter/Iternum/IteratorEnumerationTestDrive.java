package Adapter.Iternum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class IteratorEnumerationTestDrive {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		Iterator<String> iterator = v.iterator();
		IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(iterator);
		while(iteratorEnumeration.hasMoreElements()) {
			System.out.println(iteratorEnumeration.nextElement());
		}
	}
}
