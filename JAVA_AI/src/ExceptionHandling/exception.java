package ExceptionHandling;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;
		int arr[] = {1, 2, 3};
		
		try {
			a = 90 / 0;
			System.out.println(a);
			System.out.println(arr[3]);
			
	}catch(ArithmeticException e) {
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Error");
	}
	finally {
		System.out.println("Hello");
	}

}
}
