import java.util.Scanner;

public class BoucleWhileForBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Nombres de passages dans la boucle ");	
		int nombre = scan.nextInt();		
		
		int cpt =0;
		
		while (cpt<nombre) {
			System.out.println ("Je suis dans la boucle while ");
			cpt++;
			int valeur = 4;
			System.out.println ("Valeur " + valeur);
		}	
			
		for (cpt = 0 ; cpt < nombre ; cpt++) {
			
			System.out.println ("Je suis dans la boucle for ");
		}
			
		for (int i = 0 ; i<12 ; i++) {	
			System.out.print ("*");

			System.out.println ( i);

		}
		
		cpt = 0;

		do {
			System.out.println ("Je suis dans la boucle do while ");	
			cpt++;

		}
				
		while (cpt<nombre); {
		}	
		
		System.out.println ();
		System.out.println ("Nombre : " + nombre);

		
		
		
	}
	}

