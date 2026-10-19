package introduction;

public class Townofhanoi {
	public void toh(int n, char S, char D, char H) {
		if(n == 0) return;
		toh(n - 1, S , H, D);
		System.out.println("Move "+ n + " From "+ S + " To "+ D);
		toh(n-1,H,D,S);
		
	}
	public static void main(String[] args) {
		Townofhanoi obj = new Townofhanoi();
		obj.toh(3, 'A', 'B', 'C');

	}

}
