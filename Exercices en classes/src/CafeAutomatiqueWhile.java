import java.util.Scanner;

public class CafeAutomatiqueWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		double somme = 0, prixCafe = 0;
		int nombre;
		int nb10 =0, nb20 =0, nb50=0, nb100 =0, nb200 =0;
		
		System.out.println ("Veuillez indiquer le prix du café en centime");
		prixCafe = scan.nextDouble();
		
		
		while (somme<prixCafe) {			
			
		
			System.out.println ("Veuillez indiquer l'argent que vous mettez dans la machine en centimes :");
				nombre = scan.nextInt();
				somme += nombre;
				
		
			switch (nombre) {	
				case 10 :	
					nb10 = ++nb10;	
					break;
		
				case 20 :
					nb20 = ++nb20;
					break;	
			
				case 50 :
					nb50 = ++nb50;
					break;
			
				case 100 :
					nb100 = ++nb100;
					break;
			
				case 200 :
					nb200 = ++nb200;
					break;	
					
				default :
					nombre = 0;
					System.out.println ("Fausse pièce") ;
					break;
					
			
			}
			
			
			System.out.println ("Votre total pour l'instant s'élève a : " + somme) ;

			
		}
		System.out.println ("Vous avez utilisés " + nb10 + " pièce de 10 centimes");
		System.out.println ("Vous avez utilisés " + nb20 + " pièce de 20 centimes");
		System.out.println ("Vous avez utilisés " + nb50 + " pièce de 50 centimes");
		System.out.println ("Vous avez utilisés " + nb100 + " pièce de 1 CHF");
		System.out.println ("Vous avez utilisés " + nb200 + " pièce de 2 CHF");
		
		System.out.println ("Voter café coûte: " +(prixCafe/100)+ " CHF");
		System.out.println ("Somme obtenue: " +(somme/100)+ " CHF");
		System.out.println ("Solde de votre argent: " +((somme%prixCafe/100))+" CHF");
		System.out.println ("Profitez bien de votre café !");

		
		
	}

}
