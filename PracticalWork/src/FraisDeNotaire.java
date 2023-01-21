import java.util.Scanner;

public class FraisDeNotaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
		
		double RevCad, prixBillet, honoraire, PrixVente, DroitEnre;
		
		System.out.println (" Quel est le revenu cadastral de votre immeuble ? :");
		RevCad = scan.nextDouble();
		
		System.out.println (" Quel est le prix de vente de votre immeuble ? :");
		PrixVente = scan.nextDouble();
		
		if (PrixVente>30000)
			DroitEnre = PrixVente*12.5/100;
		else 
			DroitEnre = PrixVente*6/100;
	
	
		if (RevCad <= 300000) 
			honoraire = ((RevCad * 4.56) / 100);
		
		 	else if ((RevCad > 300000) && (RevCad <= 700000)) 
				honoraire = 13680 + (RevCad * 2.85 / 100);

		 		else if ((RevCad > 700000) && (RevCad <= 1200000)) 
					honoraire = 25080 + (RevCad * 2.28 / 100);

		 			else if ((RevCad > 1200000) && (RevCad <= 1825000)) 
		 				honoraire = 36480 + (RevCad * 1.71 / 100);

		 				else if ((RevCad > 1825000) && (RevCad <= 2575000)) 
		 					honoraire = 47167 + (RevCad * 1.14 / 100);

		 					else if ((RevCad > 2575000) && (RevCad <= 10075000)) 
		 						honoraire = 55717 + (RevCad * 0.57 / 100);

		 						else   
		 							honoraire = 98467 + (RevCad * 0.057 / 100);

		
		System.out.println (" Vos frais au notaire d'élèvent à : " + (DroitEnre + honoraire + 6000) + "CHF");
					
	}

}
