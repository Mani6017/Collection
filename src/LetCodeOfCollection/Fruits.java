package LetCodeOfCollection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Fruits {

	public static void main(String[] args) {
		// Collection = list & Set
		
		//List- it allows duplicate and order insertion
         List<String> list = new ArrayList<String>();
         list.add("apple");
         list.add("mango");
         list.add("apple");
         list.add("pine");
         list.add("grape");
         
         
         Collections.sort(list);
         boolean empty = list.isEmpty();
         System.out.println(empty);
         list.clear();
         System.out.println(empty);

         
         
//         for (String eachfruit : list) {
//			System.out.println(eachfruit);
//		}
//         //getvalue based on generics
//         String value = list.get(0);
//         
//         System.out.println("first value " + value);
//         //contains
//         boolean contains =list.contains("grape");
//         System.out.println("has contains " + contains);
//         //before removing
//         boolean remove = list.remove("apple");
//         System.out.println("remove " + remove);
//         
//         System.out.println("----------");
//         //after remove 
//         for (String eachfruit : list) {
// 			System.out.println(eachfruit);
// 		}
//         
//         int size = list.size();
//         System.out.println(size);
         
	}

}
