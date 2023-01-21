import java.util.Scanner;

public class SuiteFibonacciMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		int terme=0, c1=1, c2=0, c3=0;
		
		int resultat = fibonacci (terme);
		System.out.print(resultat);	
		
	}
	public static int fibonacci(int t) {
	int c1=0, c2=1, c3=0, c4 = 0;
	for (int i = 0 ; i < 10-2 ; i++) {
		c3 = c1 + c2;
		c1 = c2;
		c2 = c3;
	}
	return c3;
}
}
