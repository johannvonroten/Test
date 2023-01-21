
public class JosephProfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// saisie du nombres de soldats
		// saisie du pas
		
		int nbSoldats = 15;
		int indiceMort = -1;
		int pas = 3;
		int cptPas = 0;

		// allocation et initialisation du vecteur

		boolean[] tab = new boolean[nbSoldats];
		for (int i = 0; i < tab.length; i++)
			tab[i] = true;

		// affichage
		
		System.out.print("\t");

		for (int i = 0; i < tab.length; i++)
			System.out.print(tab[i] + "\t");
	
		int nbMorts = 0;
		
		while (nbMorts < nbSoldats) {
			// avance de 1 
			indiceMort = (indiceMort+1)%nbSoldats;
			
			if(tab[indiceMort] == true) {  //si false on fait rien
				
				cptPas++;
			
				if(cptPas == pas) {			// on doit le tuer	
					tab[indiceMort] = false;
					nbMorts++;
					cptPas = 0;
					// affichage
					System.out.println();
					System.out.print(indiceMort + "\t");
					for (int i = 0; i < tab.length; i++)
						System.out.print(tab[i] + "\t");
				}
					
			}
			

		}
		System.out.println();
		System.out.println("Dernier Indice Mort : " + indiceMort);
		System.out.println("Le survivant : " + (indiceMort+1));
	}

}
	


