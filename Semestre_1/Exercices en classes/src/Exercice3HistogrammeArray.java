import java.util.Random;
import java.util.Scanner;

public class Exercice3HistogrammeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner input = new Scanner (System.in);
		Random random = new Random ();
		
		int [] nombre;			
		int taille, i, j=0, total;
		
		System.out.println ("Combien d'indices voulez-vous ? ");		
		taille = input.nextInt();
		
		nombre = new int [taille];
		
		for (i = 0 ; i<taille ; i++) {
			nombre [i] = random.nextInt(50)+1;
			System.out.println ("");		

			for (j = 0 ; j<nombre [i] ; j++) {
				System.out.print ("*");		
		}	
		}		
	}
}
