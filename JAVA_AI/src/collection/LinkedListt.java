package collection;
import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<>();
		
		link.add(20);
		link.add(30);
		link.add(40);
		link.add(50);
		link.add(60);
		System.out.println(link);
		link.add(0, 10);
		System.out.println(link);
		link.addFirst(0);
		link.addLast(70);
		//link.clear();
		System.out.println(link.clone());
		//link.contains(20);
		System.out.println(link.size());
		
		for(int a : link){
			System.out.println(a);
		}
	}

}
;