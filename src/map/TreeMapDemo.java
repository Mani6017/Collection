package map;

import java.util.TreeMap;

/*TreeMap(C) is implementation class for map(I).
 * Duplicate keys are not allowed but duplicate values are allowed.
 * Null key is NOT allowed.
 * The elements will be retrieved on natural sorting order.
 * 
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeMap<String, String> obj = new TreeMap<String, String>();
         obj.put("camry", "Toyota");
         obj.put("corolla", "Toyota");
         obj.put("rav4", "Toyota");
         obj.put("highlander", "Toyota");
         
         //obj.put("null", "Toyota");  ---Null key is NOT allowed.
         obj.put("Toyota", "sedan");// overriding values ---- * Duplicate keys are not allowed but duplicate values are allowed.

         obj.put("Toyota", "suv");

         System.out.println(obj);
	}

}
