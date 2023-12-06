package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public void arrayListDemo() {
		List <String> arrayList = new ArrayList<String>();
        arrayList.add("toyota");
        arrayList.add("chevyrolet");
        arrayList.add("honda");
        arrayList.add("bmw");
        arrayList.add("benz");
        arrayList.add("benz");

        System.out.println(arrayList);
        
        System.out.println(arrayList.set(1, "Ford"));
        System.out.println(arrayList);
        
        System.out.println(arrayList.indexOf("benz"));
        System.out.println(arrayList.lastIndexOf("benz"));


        System.out.println(arrayList.get(1));
        
		List <String> arrayList1 = new ArrayList<String>();
        arrayList1.addAll(arrayList);        
        System.out.println("another object: " + arrayList1);
        arrayList1.clear();
        System.out.println(arrayList1);
        
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove("benz");
        System.out.println(arrayList);
        
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList1.isEmpty());
      
        for (String string : arrayList) {
			System.out.println("using for each > " + string);
		}
        System.out.println("-----------------------------------------------------------");
        
        
       ListIterator<String> list_Iterator =  arrayList.listIterator();
        while(list_Iterator.hasNext()) {
        	System.out.println("collection over list iterator > " + list_Iterator.next());
        }
        System.out.println("-----------------------------------------------------------");

        while(list_Iterator.hasPrevious()) {
        	System.out.println("collection over list iterator with previous function> " + list_Iterator.previous());
        }
       
        System.out.println("-----------------------------------------------------------");

            Iterator<String> iterator = arrayList.iterator();
            while(iterator.hasNext()) {
            	System.out.println("collection over iterator > " + iterator.next());
            }

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo demo = new ArrayListDemo();
		demo.arrayListDemo();

           

	}

}
