package collection;
import java.util.HashMap;
import java.util.List;
public class HashMapp {

	public static void main(String[] args) {
		HashMap <Integer, String>map = new HashMap();
		map.put(1, "Sandesh");
		map.put(2, "Sarthak");
		map.put(3, "Siddhesh");
		map.put(4, "Karan");
		map.put(5, "Karan");
		System.out.println(map);
		
		System.out.println(map.get(1)); 
		
		for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		map.replace(1, "Sandy");
		System.out.println(map);
		
		for (String value : map.values()) { // ONLY VALUE WILL SHOW
		    System.out.println(value);
		}
		 
		for (Integer key : map.keySet()) { // ONLY KEY WILL SHOW
		    System.out.println(key);
		}
	}

}
