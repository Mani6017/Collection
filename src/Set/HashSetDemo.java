package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	/**
     * set (I) -> Hash set(C) and Linked HashSet(C) are implements.
     * set(I) -> SortedSet(Child interface) -> Navigable(I) => TreeSet(c) is the implementation.
     * Important points to remember.
     * 1. To store group of individual objects.
     * Duplicates are not allowed.
     * Insertion order will not be maintained.
     * Set(I) doesn't have new methods other than given in Collection(I).
     * DS for HashSet is Hash Table.
     * If we add duplicate value to HashSet , simply it will return false to the add()
      * and it wont throw any error or exception.
      * we can insert null value
      * Heterogeneous values can be added.
      * Implements serializable and cloneable? - yes
      * Data are stored based on hashcode, so search is effective.
      * Fill ratio 0.75% or Load factor 75%
      * Default Capacity -16
     * ------------------------------------------------------
     * Number Constructors available in HashSet = 4
     * 1. HashSet hs = new HashSet(); size 16 and fill ratio is 0.75
     * 2.HashSet hs = new HashSet(int initialize);  size as declared and  fill ratio is 0.75(default)
     * 3.HashSet hs = new HashSet(int initialize, float fillRatio); size and ratio can be declared
     * 4.HashSet hs = new HashSet(Collection c);create a hashset for any given collection(one type to another type of collection)
     */
	public void basicDemoHashSet() {
		HashSet<String> demo = new HashSet<String>();
		demo.add("b");
		demo.add("h");
		demo.add("k");
		demo.add("k");
		demo.add("e");
		demo.add("l");
		demo.add("m");
		demo.add("k"); // In hashset insertion order will not be maintain and duplicate also well.
		//demo.add(null);
		//System.out.println(demo);
	   // demo.remove(null);
        System.out.println(demo.contains("x"));
        System.out.println(demo.containsAll(demo));

		System.out.println("contains" + demo);
		
		
		//using Iterator
		Iterator<String> iterator = demo.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	 	
	}
	public static void main(String[] args) {
		HashSetDemo ex = new HashSetDemo();
		ex.basicDemoHashSet();
	}

}
