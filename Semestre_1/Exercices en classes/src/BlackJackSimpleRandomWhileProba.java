import java.util.Random;

public class BlackJackSimpleRandomWhileProba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random ();
				
		int somme = 0;
		int cartes, victoire=0;
		int blackjack = 21;
	

		
		while (somme < blackjack) {
		
			cartes = random.nextInt(13)+1; // de 1 à 10
			
			if (cartes > 10)
				cartes = 10;
			
			somme += cartes;
		
			System.out.println ( "Cartes " + cartes + " \t " + "Sommes " +  + somme);
		
		}
		
		
		if (somme == 21) {
			System.out.println (" You win ! ");
		++victoire;
	}
		else {
			System.out.println (" You lose ");	
		}
	       double proba = victoire / 1000000.0 * 100.0;
	        double probaArrondi = Math.round(proba*10.0)/10.0;
	        System.out.println("Probabilité de gagner : " + probaArrondi);	
		
	}



	}


