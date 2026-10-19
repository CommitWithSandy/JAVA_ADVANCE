package introduction;

class Zigzag{
	
	public void ZigZag(int n) {
		if( n == 0) {
			return;
		}
			
			System.out.println("Pre" +n);
			
			ZigZag(n - 1);
			
			System.out.println("In" +n);
			
			ZigZag(n - 1);
			
			System.out.println("Post" +n);

	}
}		
public class Recursion {
	
	public static void main(String[] args) {
		Zigzag obj = new Zigzag();
		obj.ZigZag(3);

	}

}
