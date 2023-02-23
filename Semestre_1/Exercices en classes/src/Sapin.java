import java.util.Scanner;

public class Sapin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int hauteur, j, k, cpt = 1, etoileMax, nbrEtoile ;	
		
		System.out.println ("Hauteur :");		
		hauteur = scan.nextInt();
		
		etoileMax = hauteur * 2 + 1;
		
		for (int i = 0 ; i < hauteur ; i++) {
			nbrEtoile = i * 2 +1;
			for (k=1; k <= (etoileMax-nbrEtoile)/2 ; k++) {
				System.out.print(" ");
			}
			
			for (j=0; j < nbrEtoile ; j++) {
				System.out.print("*");
			}
			
			cpt++;
			System.out.println ();

		}
	}

}
