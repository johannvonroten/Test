import java.util.Random;

public class Exa2015CC1Exercice1ShiFuMi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random ();
		
		int a=0, b=0, signe1, signe2;
		
		for (int i = 0 ; i < 1 ; i++) {
			
			signe1 = random.nextInt(3);
			System.out.println ("Le premier joueur fais le signe (0 = feuille, 1 = caillou, 2 = ciseaux) " + signe1 );
			
			signe2 = random.nextInt(3);
			System.out.println ("Le deuxième joueur fais le signe (0 = feuille, 1 = caillou, 2 = ciseaux) " + signe2 );
		
			switch (signe1) {
			case 0 :
					if (signe2 == 0)
						System.out.println ("Match nul ! " );
					else if (signe2 == 1)
						++a;
					else if (signe2 == 2)
						++b;
				break;
			
			case 1 :
				if (signe2 == 0)
					++b;
				else if (signe2 == 1)
				System.out.println ("Match nul ! " );
				else if (signe2 == 2)
					++a;
	
				break;
			
			case 2 :
				if (signe2 == 0)
					++a;
				else if (signe2 == 1)
					++b;
				else if (signe2 == 2)
					System.out.println ("Match nul ! " );
				break;
				
			}	
			if (a==1)
				System.out.println ("Le premier joueur à gagné ! " );
			else if (b==1)
				System.out.println ("Le deuxième joueur à gagné ! " );
		}
	}
}