package ArrayList_Hashmap_Jdbc;

import java.util.HashMap;
import java.util.Map;

/*
 * declare HASHMAP
add pairs to hashmap
remove pairs from hashmap
read pairs from hashmap
 */
public class HashmapDemo {

	public static void main(String[] args) {
		HashMap <Integer,String> hm=new HashMap<Integer,String>(); //Decleration	
	//adding pairs to HashMap
		
		hm.put(101, "Krishna");
		hm.put(102, "Hamu");
		hm.put(103, "Sandy");
		hm.put(104, "Miheer");
		hm.put(105, "Abhi");
	 System.out.println(hm);
	 
	 //Remove a pair from hashmap
	 hm.remove(103);
	 System.out.println(hm); //new pairs after deletion
	 //How to read pairs from Hashmap
	 for(Map.Entry m:hm.entrySet())
	 {
		 System.out.println(m.getKey()+ "   "+m.getValue());
	 }
	  
	}

}
