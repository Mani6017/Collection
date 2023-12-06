package collection;

import java.util.LinkedList;

//TODO Auto-generated method stub
		/*
		 * Linked list is best suitable for insertion and deletion.
		 * All the collections implements serializable and cloneable Interface.
		 * Linked list also implements those interfaces but not RandomAccess Interface.
		 * 
		 */
public class LinkedListDemo {
          public void linkedListOperations() {
        	  LinkedList<Integer> linkedList = new LinkedList<Integer>();
        	  linkedList.add(2);
        	  linkedList.add(3);
        	  linkedList.add(4);
        	  linkedList.add(4);
        	  System.out.println(linkedList);
        	  linkedList.addFirst(1);
        	  linkedList.addLast(5);
        	  System.out.println(linkedList);
        	  
        	  System.out.println("index position " +linkedList.get(3));
        	
        	  System.out.println(linkedList.getLast());
        	  
        	  System.out.println(linkedList.set(0, 25));
        	  
        	  System.out.println(linkedList.removeLast());

        	  System.out.println(linkedList);

        	  System.out.println(linkedList.removeFirst());
        	  System.out.println(linkedList);
        	  System.out.println("deleting first occurance of element "+linkedList.removeFirstOccurrence(3));
        	  System.out.println(linkedList);
        	  System.out.println("as same method of remove " + linkedList.poll());
        	  System.out.println(linkedList);


        	  



          }
	public static void main(String[] args) {
		LinkedListDemo ex = new LinkedListDemo();
                ex.linkedListOperations();
	}

}
