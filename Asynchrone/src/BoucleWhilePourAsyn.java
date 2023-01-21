import java.util.Scanner;

public class BoucleWhilePourAsyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Nombres de passages dans la boucle ");
		
		int nombre = scan.nextInt();
		
		int cpt =0;
		
		while (cpt<nombre) {
			System.out.println ("Je suis dans la boucle ");
			cpt++;
		}
		
		
		
	}

}
