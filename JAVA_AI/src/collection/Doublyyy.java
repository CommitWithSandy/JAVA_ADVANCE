package collection;
public class Doublyyy{
	
class Node {
	int val;
	Node prev;
	Node next;
	Node(int val){
		this.val = val; 
		this.next = next;
		this.prev = prev;
	}
}
	Node head = null;
	Node tail = null;
	
	public void add(int val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			head = tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	public void displayForward() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " <-> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward() {
		Node temp = tail;
		while(temp!= null){
			System.out.print(temp.val + " <-> ");
			temp=temp.prev;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		
		Doublyyy list = new Doublyyy();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		
		System.out.println("Forward:");
		list.displayForward();
		System.out.println("Backward");
		list.displayBackward();
	}

}
