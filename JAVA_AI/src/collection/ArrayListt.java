package collection;
import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);

		b.add(20);
		b.add(30);
		
		
		a.addAll(b);
		System.out.println(a);
		
//		a.removeAll(b);
//		System.out.println(a);
		
//		a.retainAll(b);
//		System.out.println(a);
		
		a.replaceAll(x -> x * 2);
		System.out.println(a);  // used to modify every element in the list using a given rule.
		
//		System.out.println(a.containsAll(b));
//		System.out.println(a.clone()); // make shallow copy 
		
		
//		list.add(34); // Adds an element
//		list.add(76);
//		list.add(87);
//		list.add(1, 44);// Adds at a specific index
//		list.add(4, 43); 
//		
//		list.addFirst(23);
//		list.addLast(90);
//		
////		list.clear();
////		list.clone();
//		
//		System.out.println(list.getClass());
//		
//		System.out.println(list.getFirst());
//		
//		System.out.println(list.getLast());
//		
//		System.out.println(list.get(1));
//		
//		System.out.println(list.clone());
//		
//		System.out.println(list.set(1, 40));
		
//		list.remove(1);
//		
//		list.toArray();
//		
//		System.out.println(list);

	}

}
