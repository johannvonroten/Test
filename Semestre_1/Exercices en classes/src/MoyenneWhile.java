import java.util.Scanner;

public class MoyenneWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int valeur;

		
		System.out.println ("Veuillez indiquer un tout premier chiffre :");
		valeur = scan.nextInt();
		
		
		double somme=0, nombres=0, max=valeur, min=valeur;

		
		while (valeur != 0) {			
									
				somme += valeur;
				nombres = ++nombres;
				
				if (valeur < min)
					min = valeur;
				
				if (valeur > max )	
					max = valeur;
				
				System.out.println ("Veuillez indiquer un chiffre, pour arrêter la boucle inscrivez 0 :");
				valeur = scan.nextInt();
				
		}	
		
		System.out.println ("Votre moyenne est de : " + (somme / nombres));
		System.out.println ("Votre chiffre le plus grand est : " + max);
		System.out.println ("Votre chiffre le plus petit est : " + min);

	}


	}


