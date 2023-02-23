import java.util.Scanner;
public class PrixTTCTVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		double TVA, Remise = 0.0, PrixN, PrixB;
		
		System.out.println ("Veuillez indiquer le prix hors taxes : ");
		PrixB = scan.nextDouble ();
		
		TVA = (PrixB*7.6/100);
		
		 
		if (PrixB >= 1000 && PrixB <= 1999) 
			Remise = (PrixB*1/100);
			else 
			
				if (PrixB >= 2000 && PrixB <= 4999) 
					Remise = (PrixB*3/100);	
					else 
			
						if (PrixB >= 5000) 
							Remise = (PrixB*5/100);
							else 
				
			System.out.println ("");	
			System.out.println ("Votre facture se monte à : " + (PrixB + TVA - Remise) + "CHF");
			System.out.println ("Votre TVA se monte à : " + TVA + "CHF, " + "et votre Remise se monte à : " + Remise + "CHF");
		
	}

}
