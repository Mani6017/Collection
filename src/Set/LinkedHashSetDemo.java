package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	/*
	 * LinkedHashSet(I) is implementation class for SET(I).
	 * Duplicates values are not allowed
	 * Insertion order is maintained
	 * Underlying DS is Hash table + Linked List
	 * we can insert null value
    * Heterogeneous values can be added.
    * Implements serializable and cloneable? - yes
    * Data are stored based on hashcode, so search is effective.
    * Fill ratio 0.75% or Load factor 75%
    * Default Capacity -16
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set linkedHashset = new LinkedHashSet(); // hetergenous object, if generics not applied
         linkedHashset.add(1);
         linkedHashset.add("A");
         linkedHashset.add("B");
         linkedHashset.add("C");
         linkedHashset.add("D");
         System.out.println("insertion order preserved" + linkedHashset);
         System.out.println("Size : "+ linkedHashset.size());

	}

}
