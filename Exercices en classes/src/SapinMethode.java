import java.util.Scanner;

public class SapinMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int hauteur;
		char signe;
		
		System.out.println ("Hauteur :");		
		hauteur = scan.nextInt();
		
		System.out.println ("Signe :");		
		signe = scan.next().charAt(0);
		
		sapin (hauteur, signe);
		
	
	}
	public static void sapin(int haut, char car) {
		int etoileMax, nbrEtoile, cpt=0;
		etoileMax = haut * 2 + 1;

	for (int i = 0 ; i < haut ; i++) {
		nbrEtoile = i * 2 +1;
		for (int k=1; k <= (etoileMax-nbrEtoile)/2 ; k++) {
			System.out.print(" ");
		}		
		for (int j=0; j < nbrEtoile ; j++) {
			System.out.print(car);
		}		
		cpt++;
		System.out.println ();
	}
	}
}
