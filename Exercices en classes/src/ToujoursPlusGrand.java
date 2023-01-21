import java.util.Scanner;

public class ToujoursPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int nombre, nombreA,i=1;
		
		System.out.println ("Veuillez inscrire un premier nombre !");		
		nombre = scan.nextInt();
		nombreA = nombre;

		for (i = 2 ; i<=10 ; i++) {
			System.out.println ("Inscrivez un nombre plus grand: No"+i);		
			nombre = scan.nextInt();
			
			while (nombre<=nombreA) {
				System.out.println ("Nombre non valide: " + nombre + " Veuillez inscrire un nouveau chiffre : ");		
				nombre = scan.nextInt();
			
			}
			nombreA = nombre;
		}	
	}

}
