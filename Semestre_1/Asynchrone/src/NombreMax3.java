import java.util.Scanner;

public class NombreMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b, c;

		Scanner scan = new Scanner (System.in);

		System.out.println ("Veuillez indiquer la valeur de a");
		a = scan.nextInt ();
		
		System.out.println ("Veuillez indiquer la valeur de b");
		b = scan.nextInt ();
		
		System.out.println ("Veuillez indiquer la valeur de c");
		c = scan.nextInt ();

		
		
		if (a>b && a>c)
			System.out.println ("Max = a");	
		else if (b>a && b>c)
			System.out.println ("Max = b");	
		else 
			System.out.println (" Max = c");	

		
		
		
		
		
		
		
	}
}
