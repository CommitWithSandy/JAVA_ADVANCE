package introduction;

class Incre{
	public void printInc(int n) {
		if(n == 0) {
			return;
		}
		printInc(n-1);
		System.out.println(n);
	}
}
public class PrintIncre {
	public static void main(String[] args) {
		Incre obj = new Incre();
		obj.printInc(4);

	}

}