import java.util.Scanner;

public class JoursMois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner (System.in); 
				int mois, reponse1;
			System.out.println ("Veuillez indiquer une année :");
			reponse1 = myInput.nextInt();
			
			System.out.println ("Le numéro du mois choisis :");
			mois = myInput.next().charAt (0);
			
			switch (mois) {
			case '1' :
				System.out.println ("Il y aura 31 jours pendant le mois de Janvier de l'année " + reponse1);
				break;
			
			case '2' :
				if ((reponse1 % 4 == 0 && !(reponse1 % 100 == 0)) || (reponse1 % 400 == 0))
					
					System.out.println ("Il y aura 29 jours pendant le mois de Mars de l'année " + reponse1);
					else 
						System.out.println (" Il y aura 28 jours pendant le mois de Mars de l'année " + reponse1);
				break;
			
			case '3' :
				System.out.println ("Il y aura 31 jours pendant le mois de Mars de l'année " + reponse1);
				break;
				
			case '4' :
				System.out.println ("Il y aura 30 jours pendant le mois de Avril de l'année " + reponse1);
				break;
				
			case '5' :
				System.out.println ("Il y aura 31 jours pendant le mois de Mai de l'année " + reponse1);
				break;
				
			case '6' :
				System.out.println ("Il y aura 30 jours pendant le mois de Juin de l'année " + reponse1);
				break;
				
			case '7' :
				System.out.println ("Il y aura 31 jours pendant le mois de Juillet de l'année " + reponse1);
				break;
				
			case '8' :
				System.out.println ("Il y aura 31 jours pendant le mois de Août de l'année " + reponse1);
				break;
				
			case '9' :
				System.out.println ("Il y aura 30 jours pendant le mois de Septembre de l'année " + reponse1);
				break;
				
			case 10 :
				System.out.println ("Il y aura 31 jours pendant le mois de Octobre de l'année " + reponse1);
				break;
				
			case 11 :
				System.out.println ("Il y aura 30"
						+ " jours pendant le mois de Novembre de l'année " + reponse1);
				break;
				
			case 12 :	
				System.out.println ("Il y aura 31 jours pendant le mois de Décembre de l'année " + reponse1);
				break;
				
			}
		}

	}

