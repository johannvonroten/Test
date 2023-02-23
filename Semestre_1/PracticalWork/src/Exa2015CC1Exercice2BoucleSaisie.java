import java.util.Random;
import java.util.Scanner;

public class Exa2015CC1Exercice2BoucleSaisie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random ();
		Scanner scan = new Scanner (System.in);

		int nombreB, nombreM = 1, i = 0, j = 1;		
		
			for (i = 0 ; i < 3 ; i++) {

			System.out.println ("Veuillez indiquer un nombre entre " + nombreM + " et 100 ");		
			nombreB = scan.nextInt();		
			
			if (nombreB == 100) {
				i = 3;}
			
			else if (nombreB > 100) {
				System.out.println ("Saisie invalide ");
				i = 3;}

			else if (nombreB < nombreM) {
				System.out.println ("Saisie invalide ");
				i = 3;}

			nombreM = nombreB;			
		
		}
			System.out.println ("Programme terminé ");
	}
}