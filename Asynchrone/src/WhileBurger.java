import java.util.Scanner;

public class WhileBurger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Combien de burger voulez-vous commander ? ");		
		int nombre = scan.nextInt();
		
		int cpt =0, burgerType= 0, burger1 = 0, burger2 = 0, burger3 = 0, burger4 = 0, burger5 = 0;
		
		while (cpt<nombre) {
			System.out.println ("Quel burger voulez-vous commander ? ");
			burgerType = scan.nextInt();
			cpt++;
			
		
			
			switch (burgerType) {
			case 1 :
				burger1 = ++burger1;			
				break;
			
			case 2 :
				burger2 = ++burger2;
				break;
			
			case 3 :
				burger3 = ++burger3;
				break;
				
			case 4 :
				burger4 = ++burger4;
				break;
				
			case 5 :
				burger5 = ++burger5;
				break;	
				
			default :
				nombre = 0;
				System.out.println ("Faute de numéro") ;
				break;
			}
			
		}
			System.out.println ("Vous avez choisis " + burger1 + " Cheese Burger, ça vous coûtera " + (burger1*23)+"CHF");
			System.out.println ("Vous avez choisis " + burger2 + " Burger du mois, ça vous coûtera " + (burger2*21)+"CHF");
			System.out.println ("Vous avez choisis " + burger3 + " Chick'Crisp Burger, ça vous coûtera " + (burger3*22)+"CHF");
			System.out.println ("Vous avez choisis " + burger4 + " Ca joue Burger, ça vous coûtera " + (burger4*22)+"CHF");
			System.out.println ("Vous avez choisis " + burger5 + " Big Fat Burger, ça vous coûtera " + (burger5*19)+"CHF");

			System.out.println ("Total " + ((burger1*23) + (burger2*21) + (burger3*22) + (burger4*22) + (burger5*19)) + "CHF");
 
		
		
		
		
	}

}

	


