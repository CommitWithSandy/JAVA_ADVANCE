package introduction;

class Decre{
	public void printDecr(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printDecr(n-1);
	}
}
public class PrintDec {
	public static void main(String[] args) {
		Decre obj = new Decre();
		obj.printDecr(4);

	}

}
