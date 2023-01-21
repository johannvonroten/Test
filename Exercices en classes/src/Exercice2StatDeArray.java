import java.util.Random;
import java.util.Scanner;

public class Exercice2StatDeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] nombre;	
		double tirage=0, moyenne, stat=0, taille;
		Scanner input = new Scanner (System.in);
		int i, j, total,win = 0;
		
		System.out.println ("Combien de tirage de dé voulez vous faire ? ");		
		taille = input.nextInt();
		
		nombre = new double [6];		
		tirage=0;
		
		for (j = 0 ; j<6 ; j++) {
			win = 0;
			for (i = 0 ; i<taille ; i++) {
				Random random = new Random ();
				tirage = random.nextInt(6);
				
				if (tirage == j)
					win++;
				nombre [j] = win;	
		}	
			stat = (nombre [j]/taille)*100;
			System.out.println ("On peut tomber sur la face " + (j+1) + " à " + stat + "%");
	}		
	}
}