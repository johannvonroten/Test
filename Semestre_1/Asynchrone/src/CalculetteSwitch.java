import java.util.Scanner;

public class CalculetteSwitch {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in)) {
			double reponse1, reponse2;
			char signe;
			
			System.out.println (" Veuillez indiquer un premier chiffre :");
			reponse1 = myInput.nextDouble();
			
			System.out.println (" Veuillez indiquer le signe mathématique :");
			signe = myInput.next().charAt (0);

			System.out.println (" Veuillez indiquer un second chiffre :");
			reponse2 = myInput.nextDouble();
			
			switch (signe) {
			case '+' :
				System.out.println ("La réponse de votre calcul est : " + (reponse1 + reponse2));
				break;
			
			case '-' :
				System.out.println ("La réponse de votre calcul est : " + (reponse1 - reponse2));
				break;
			
			case '*' :
			case 'x' :
			case 'X' :
				System.out.println ("La réponse de votre calcul est : " + (reponse1 * reponse2));
				break;
			case '/' :
			case ':' :
				if (reponse2 == 0)
				System.out.println ("Veuillez ne pas choisir 0 comme second chiffre ! ");
				else
				System.out.println ("La réponse de votre calcul est : " + (reponse1 / reponse2));
				break;
			}
		}

	}
}
