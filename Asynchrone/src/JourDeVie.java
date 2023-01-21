import java.util.Scanner;

public class JourDeVie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in); 
				int mois, annee, jour, moisN, anneeN, jourN, nb1=0, nb2=0; 
				double nbA, bissex, nbSem,nbJours;
			
			System.out.println ("Veuillez indiquer l'année actuelle : ");
			annee = myInput.nextInt();
			
			System.out.println ("Veuillez indiquer le numéro de ce mois : ");
			mois = myInput.nextInt();
			
			System.out.println ("Veuillez indiquer le numéro de ce jour : ");
			jour = myInput.nextInt();
			
			System.out.println ("Veuillez indiquer votre année de naissance : ");
			anneeN = myInput.nextInt();
			
			System.out.println ("Veuillez indiquer votre mois de naissance : ");
			moisN = myInput.nextInt();
			
			System.out.println ("Veuillez indiquer votre jour de naissance : ");
			jourN = myInput.nextInt();
			
			nbA = annee-anneeN-1;
			bissex=(nbA/4);
			
			switch (mois) {
			case 1 :
				nb1 = 0+jour;
				break;
			
			case 2 :
				nb1 = 31+jour;
				break;
			
			case 3 :
				nb1 = 59+jour;			
				break;
				
			case 4 :
				nb1 = 90+jour;
				break;
				
			case 5 :
				nb1 = 120+jour;
				break;
				
			case 6 :
				nb1 = 151+jour;
				break;
				
			case 7 :
				nb1 = 181+jour;
				break;
				
			case 8 :
				nb1 = 212+jour;
				break;
				
			case 9 :
				nb1 = 243+jour;
				break;
				
			case 10 :
				nb1 = 273+jour;
				break;
				
			case 11 :
				nb1 = 304+jour;
				break;
				
			case 12 :	
				nb1 = 334+jour;
				break;
				
				
		}
			
			
			switch (moisN) {
			case 1 :
				nb2 = 365-jourN;
				break;
			
			case 2 :
				nb2 = 337-jourN;
				break;
			
			case 3 :
				nb2 = 306-jourN;
				break;
				
			case 4 :
				nb2 = 276-jourN;			
				break;
				
			case 5 :
				nb2 = 245-jourN;				
				break;
				
			case 6 :
				nb2 = 215-jourN;				
				break;
				
			case 7 :
				nb2 = 184-jourN;			
				break;
				
			case 8 :
				nb2 = 153-jourN;			
				break;
				
			case 9 :
				nb2 = 123-jourN;				
				break;
				
			case 10 :
				nb2 = 92-jourN;			
				break;
				
			case 11 :
				nb2 = 62-jourN;				
				break;
				
			case 12 :
				nb2 = 31-jourN;	
				break;		
				
		}
			
			nbJours = (nbA*365) + bissex + nb1 + nb2 ;	
			nbSem = (nbJours / 365) * 52.143;		
			
			System.out.println ("T'as date d'anniversaire est le " + anneeN + "." + moisN + "." + jourN);
			System.out.println ("La date du jours est le " + annee + "." + mois + "." + jour);

			
			System.out.println ("Vous avez vu se lever le soleil exactement " + nbJours + " fois, bravo !");
			System.out.println ("Ca représente également " +  nbSem + " semaines !");

			
	}
	}

