import java.util.Random;
import java.util.Scanner;

public class BlackJackAmeliore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
	
		Random random = new Random ();
				
		int somme = 0, somme2 = 0;
		int cartes, cartes2, reponse;
		int blackjack = 21;

			while (somme <= blackjack) {
				
				System.out.println ("Si vous voulez jouer une carte, appuyez sur 1, sinon 0 :");
				reponse = scan.nextInt();
		
				switch (reponse) {	
				
				case 1 :
					cartes = random.nextInt(13)+1;
					
						if (cartes > 10)
							cartes = 10;
							somme += cartes;
						System.out.println ("La valeur de cette carte est de : " + cartes);
						System.out.println ("Et le total de nos cartes sont de : " + somme);
						
						if (somme > 21)
						System.out.println ("Défaite");
					break;
			
				case 0 :
					while (somme2 < blackjack) {
						
						cartes2 = random.nextInt(13)+1; // de 1 à 10
					
						if (cartes2 > 10)
							cartes2 = 10;
						
						somme2 += cartes2;
					
						System.out.println ( "Cartes " + cartes2 + " \t " + "Sommes " +  + somme2);
					
					}
					
					
					
					if ((somme <= 21) && (somme2 > 21))
						System.out.println ( "Victoire");
					
					else 
						System.out.println ( "Défaite");
				
					break;	
				
				
	}

			
			
			
	}
	
}
}
			
			
			
