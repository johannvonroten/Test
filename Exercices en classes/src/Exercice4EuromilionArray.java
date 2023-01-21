import java.util.Random;

public class Exercice4EuromilionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random ();
		
		int [] partieUn, partieDeux;			
		int i, j, controle;
		
		partieUn = new int [5];
		partieDeux = new int [2];
		
		for (i = 0 ; i<5 ; i++) {
			partieUn [i] = random.nextInt(50)+1;		
			
			if (partieUn [i] == partieUn [0])
				partieUn [i] = random.nextInt(50)+1;		
			else if (partieUn [i] == partieUn [1])
				partieUn [i] = random.nextInt(50)+1;		
				else if (partieUn [i] == partieUn [2])
					partieUn [i] = random.nextInt(50)+1;		
					else if (partieUn [i] == partieUn [3])
						partieUn [i] = random.nextInt(50)+1;		
						else if (partieUn [i] == partieUn [4])
							partieUn [i] = random.nextInt(50)+1;		
							else if (partieUn [i] == partieUn [5])
								partieUn [i] = random.nextInt(50)+1;	
			System.out.println ("Vous devriez inscrire " + partieUn [i] + " dans votre grille.");

		}		
		System.out.println ("");		
		for (j = 0 ; j<2 ; j++) {
			partieDeux [j] = random.nextInt(12)+1;
			if (partieDeux [1] == partieDeux [0])
				partieDeux [1] = random.nextInt(50)+1;
			System.out.println ("Vous devriez remplir les étoile avec le numéro " + partieDeux [j] + " ");
			
				

			
		}
		
	}

}
