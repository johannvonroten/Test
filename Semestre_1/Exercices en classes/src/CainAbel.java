import java.util.Random;

public class CainAbel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random Rand = new Random ();

		int i=0, j=0, somme=0, lancer, tours=0;
		int winA=3, winC=6, abel=0, cain=0;
		
		while (somme != 3 && somme != 6) {
			somme=0;
			tours++;
			
			for (j=0 ; j<3 ; j++) {
				lancer = Rand.nextInt(2)+1;
				somme += lancer;


			}
			if (somme == winA)
				System.out.println ("3 faces ! Abel gagne ! En " + tours + " jetés de pièces lancées");
			else if (somme == winC)
				System.out.println ("3 piles ! Cain gagne ! En " + tours + " jeté de pièces lancées");
		}
			
	}
}
