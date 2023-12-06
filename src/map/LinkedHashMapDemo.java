package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	/*LinkedHashMap (C) is implementation class for map(I)
	 * Duplicate keys are not allowed but duplicate values are allowed
	 * uses a technique called hashing to store elements
	 * only one null key is allowed
	 * The order is preserved
	 * a value of the map can only be fetched using its key.
	 * It is not synchronized. so if it has to be used on multithreading environment, it has to be synchronized explicity.
	 * Initial capacity: 16 and Load Factor: .75
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String , String > ex = new LinkedHashMap<String, String>();
		ex.put("Don ", "Mani");
		ex.put("Dedication ", "Manik");
		ex.put("Hardwork ", "Manika");
		System.out.println(ex);
		
		HashMap<String, String> exam = new HashMap<String, String>();
		exam.put("Don ", "Mani");
		exam.put("Dedication ", "Manik");
		exam.put("Hardwork ", "Manika");
		exam.put("null ", "Kumar");// values overiding
		exam.put("null", "kumaran");// values overiding
		exam.put("null ", "null");// values overiding

		
		System.out.println(exam);
		
		


	}

}
