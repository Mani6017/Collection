/********************Nature of Map Interface*****************
 * Map(I) is not the child interface of collection(I) and hence it is not considered to be true collection.
 * It represents data key - value pair 
 * Duplicate keys(primary key) are not allowed in map.
 * Duplicate values are allowed 
 * 
 */
package map;
/*HashMap (C) is implementation class for map(I)
 * Duplicate keys are not allowed but duplicate values are allowed
 * uses a technique called hashing to store elements
 * only one null key is allowed
 * The order is not preserved as it uses hashing. so we cant predict the retrieval order of the elements inserted.
 * a value of the map can only be fetched using its key.
 * It is not synchronized. so if it has to be used on multithreading environment, it has to be synchronized explicity.
 * Initial capacity: 16 and Load Factor: .75
 */

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "Mani");
		hashmap.put(2, "Ravi");
		hashmap.put(3, "Rahul");
		hashmap.put(4, "Arun");
		hashmap.put(5, "alex");
		hashmap.put(null, "jht");// values overriding
		hashmap.put(null, "lkj");// values overriding

		
		System.out.println("employee map : " + hashmap);
		HashMap<Integer, String> duplicatemap = new HashMap<Integer, String>();
        duplicatemap.putAll(hashmap);
        System.out.println("duplicate map" + duplicatemap);
        
        duplicatemap.clear();
        System.out.println("after clearing " + duplicatemap);
        System.out.println("does this map has key" + hashmap.containsKey(2));
        System.out.println("does this map has value " + hashmap.containsValue("maria"));
        System.out.println("does this map has value " + hashmap.containsValue("Maria"));
        
        //cloned(extact copy)
        System.out.println("Clone Map : " + hashmap.clone() );
        
         // get key set
        System.out.println("get all keys only " + hashmap.keySet());
        
        // fetch value
        System.out.println("get values " + hashmap.get(2));
        
        //fetch all values
        System.out.println("get all the values : " + hashmap.values());
        
        //Entry Set
        System.out.println(hashmap.entrySet());
        



	}

}
