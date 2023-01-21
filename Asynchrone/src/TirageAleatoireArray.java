import java.util.Random;
import java.util.Scanner;

public class TirageAleatoireArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Random random = new Random ();

		int nombre, tirage=0;
		int [] tabl1;	
		boolean [] verif;
		
		System.out.println ("Combien de tirages voulez-vous ? ");		
		nombre = scan.nextInt();
		
		tabl1 = new int [nombre];
		verif = new boolean [nombre+1];
		
		for (int i = 0 ; i<verif.length ; i++ ) {
		verif [i] = true;
		}
		
		int i=0;
		
		while (i<nombre) {
			tirage = random.nextInt(nombre)+1;
			
			if (verif [tirage] != false) {
				tabl1 [i] = tirage;	
				verif [tirage] = false;
				i++;
			}		
		}				
		
		for (int j = 0 ; j<tabl1.length ; j++) {						
			System.out.print (tabl1 [j]);		
			System.out.print (" ");		
			}	
	}	
}
