import java.util.Scanner;
public class FraisDePort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double montant, fraisP = 0.0;
		
		System.out.println ("Veuillez indiquer le prix d'achat : ");
		montant = scan.nextInt();
		
		if (montant >= 200) 
			fraisP = 7.90;
		 else 
			 
			if (montant >= 160) 
				fraisP = 13.90;				
			 else 
				 
				if (montant >= 99) 
					fraisP = 15.90;
				else {	
					System.out.println ("Nous ne livrons pas pour des montant inférieurs à 99.-");}
 
		System.out.println ("Pour le montant inscrit, vos frais de port d'éleveront à : " + fraisP + " CHF");

				
			}
			

		
		
	}
		
	
	
	
