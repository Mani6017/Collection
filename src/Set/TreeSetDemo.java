package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
     /*
      * TreeSet(C) is implementation class for SORTEDSET(I), NAVIGABLESET(I).
      * Duplicates are not allowed
      * Elements will be retrieved on NATURAL SORTING ORDER 
      * underlying DS is binary search tree
      * Heterogeneous objects are not allowed
      * 
      * Constructors present  are 4
      * 1. TreeSet ts = new TreeSet(); default sort order
      * 2.TreeSet ts = new TreeSet(Comparator c);// customized sorting order defined by comparator object and string buffer class is not comparable
      * 3.TreeSet ts = new TreeSet(Collection c);equivalent tree set of any collection will be created
      * 4.TreeSet ts = new TreeSet(SortedSet s); creates tree set for given sorted set
      */
	public static void main(String[] args) {
     TreeSet<Integer> treeset = new TreeSet<Integer>();
     treeset.add(4);
     treeset.add(3);
     treeset.add(1);
     treeset.add(6);
     treeset.add(5);
     treeset.add(7);
     System.out.println("elements are sorted in ascending order " + treeset);
      System.out.println("ELEMENT IS RETRIEVED FROM FIRST " +treeset.first());
      System.out.println("ELEMENT IS RETRIEVED FROM LAST " + treeset.last());
      System.out.println("values lesser than given value " + treeset.headSet(4));
      System.out.println("value greater than given valuee " + treeset.tailSet(5));
      System.out.println(treeset.contains(1));
      System.out.println("remove first element " +treeset.pollFirst());
      System.out.println("remove last element " + treeset.pollLast());
      System.out.println("higher element of given value on next " + treeset.higher(5));
      System.out.println("lower element of given value on previous " + treeset.lower(5));
      System.out.println("desending order set of elements : " + treeset.descendingSet());
      
      
      // normal iterator.
       Iterator<Integer> iterator =treeset.iterator();
       while(iterator.hasNext()) {
    	   System.out.println(iterator.next());
       }
       
       Iterator<Integer> desIteraor=treeset.descendingIterator(); 
       while (desIteraor.hasNext()) {
    	   System.out.println("iterate by descending " + desIteraor.next());
       }
	}

}
