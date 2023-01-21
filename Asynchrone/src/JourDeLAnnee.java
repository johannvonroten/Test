import java.util.Scanner;

public class JourDeLAnnee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in); 
				int mois, reponse1, jour;
			System.out.println (" Veuillez indiquer cette année :");
			reponse1 = myInput.nextInt();
			
			System.out.println (" Le numéro de ce mois :");
			mois = myInput.nextInt();
			
			System.out.println (" Le numéro de ce jour :");
			jour = myInput.nextInt();
			
			switch (mois) {
			case 1 :
				System.out.println ("c'est le " + ((0+jour)) + "ème jour de l'année");
				break;
			
			case 2 :
				System.out.println ("c'est le " + ((31+jour)) + "ème jour de l'année");
				break;
			
			case 3 :
				System.out.println ("c'est le " + ((61+jour)) + "ème jour de l'année");
				break;
				
			case 4 :
				System.out.println ("c'est le " + (92+jour) + "ème jour de l'année");
				break;
				
			case 5 :
				System.out.println ("c'est le " + (122+jour) + "ème jour de l'année");
				break;
				
			case 6 :
				System.out.println ("c'est le " + (153 + jour) + "ème jour de l'année");
				break;
				
			case 7 :
				System.out.println ("c'est le " + (183 + jour) + "ème jour de l'année");
				break;
				
			case 8 :
				System.out.println ("c'est le " + (214 + jour) + "ème jour de l'année");
				break;
				
			case 9 :
				System.out.println ("c'est le " + (245 + jour) + "ème jour de l'année");
				break;
				
			case 10 :
				System.out.println ("c'est le " + (275 + jour) + "ème jour de l'année");
				break;
				
			case 11 :
				System.out.println ("c'est le " + (306 + jour) + "ème jour de l'année");
				break;
				
			case 12 :	
				System.out.println ("c'est le " + (336 + jour) + "ème jour de l'année");
				break;
				
			}
		}

	}

