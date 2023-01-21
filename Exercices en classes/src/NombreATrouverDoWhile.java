import java.util.Random;
import java.util.Scanner;

public class NombreATrouverDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Random random = new Random ();

		int nombreDev, nombreTest, tour = 0;		
		
		nombreDev= random.nextInt(50)+1;
		
		System.out.println (nombreDev);	

		
		do {
			System.out.println ("Entrer un nombre pour deviner ");	
			nombreTest = scan.nextInt();	
			
			if (nombreTest < nombreDev)
				System.out.println ("Votre propostition est plus petite !");	
				
			if (nombreTest > nombreDev)	
				System.out.println ("Votre propostition est plus grande ! ");
			++tour;
			
		}while (nombreTest < nombreDev || nombreTest > nombreDev); {
			
		System.out.println ("Vous avez trouvé le chiffre en " + tour + " tours !");	
		}


}
}