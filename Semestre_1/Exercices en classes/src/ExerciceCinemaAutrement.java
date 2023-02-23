import java.util.Scanner;
public class ExerciceCinemaAutrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int age, prixBillet;
		
		System.out.println (" Entrez votre âge :");
		age = scan.nextInt();
		
		if (age <= 12) 
			prixBillet = 11;
		 else 
			
			if (age <= 16) 
				prixBillet = 13;
			 else  
				
				if (age < 65) 
					prixBillet = 16;
				 else 	
					prixBillet = 13;
		
		System.out.println (" Votre ticket de cinéma va vous coûter :" + prixBillet + "CHF");
					
	}
			
		

		
		
		
		
	
	}
	
