package collection;

import java.util.TreeSet;
import java.util.*;

public class TreeSett {
	

	public static void main(String[] args) {
		Set<String>car = new TreeSet<>();
		
		car.add("BMW");
		car.add("Supra");
		car.add("HondaCivic");
		car.add("Nissan");
		System.out.println(car);
		
		System.out.println(car.isEmpty());
		
		System.out.println(car.hashCode());

		System.out.println(car.add("Nissan"));
		
		System.out.println(car.contains("BMW"));
	}

}
