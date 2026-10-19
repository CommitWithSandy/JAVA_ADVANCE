package ExceptionHandling;

public class Throwss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;
		if(a >=80) {
			throw new ArithmeticException("Greater than 20");
		}
		System.out.print("Smaller than 20");
	}

}
