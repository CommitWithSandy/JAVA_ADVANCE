package introduction;


class IncreDecre{
	public void printIncreDecr(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printIncreDecr(n-1);
		System.out.println(n);
	}
}
public class PrintIncreDecre {

	public static void main(String[] args) {
		IncreDecre obj = new IncreDecre();
		obj.printIncreDecr(4);

	}

}
