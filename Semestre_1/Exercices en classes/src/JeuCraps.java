import java.util.Random;
import java.util.Scanner;

public class JeuCraps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Random random = new Random ();

		int de1, de2, total, tour = 0, total1, etat = 0;		
					
			de1= random.nextInt(6)+1;
			de2= random.nextInt(6)+1;
			
			total = de1 + de2;
			total1 = total;
			
			System.out.println (de1 + " et " + de2 + " somme " + total);
			
			if (total == 7 || total == 11)
				etat = 1;
			else if (total == 2 || total == 3 || total == 12)
				etat = 0;
				
			if (etat == 1)
				System.out.println ("Win");
			else if (etat == 0)
				System.out.println ("Loose");
				
System.out.println (etat);
			
			
			
		while (etat == 1)			
				
			de1= random.nextInt(6)+1;
			de2= random.nextInt(6)+1;
				
			total = de1 + de2;	
			
			System.out.println (de1 + " et " + de2 + " somme " + total);										
			
			if (total == 7)
				etat = 0;			
				
			if (total == total1)
			etat = 1;
						
System.out.println (etat);
			

		if (etat == 1)
				System.out.println ("Win");
		else if (etat == 0)
				System.out.println ("Loose");		
			
			}	
		

}
