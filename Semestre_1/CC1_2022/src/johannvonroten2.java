import java.util.Scanner;

public class johannvonroten2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		double anneeE, salaire, salaireCalcul, totSal; 
		double salaire1=0, salaireTot=0;
		int classe, cpt = 0, nmbrE;
		
		System.out.print ("Entrez le nombre d'employés :");
		nmbrE = scan.nextInt();
		
		while (cpt<nmbrE) {
					
		System.out.print ("Entrez votre classe de salaire ? (15, 16, 17) :");
		classe = scan.nextInt();
		
		System.out.print ("Entrez vos années d'expériences ? :");
		anneeE = scan.nextDouble();
		
		cpt++;
		
				
		switch (classe) {
		case 15 :
			salaireCalcul = ((5675.10 * 2 / 100) * anneeE) + 5675.10 ;
			if (salaireCalcul <= 7945.15 )
			salaire1 = salaireCalcul;
			else
			salaire1 = 7945.15;
		
			break;
		
		case 16 :
			salaireCalcul = ((5410.00 * 2 / 100) * anneeE) + 5410.00 ;
			if (salaireCalcul <= 7574.00 )
			salaire1 = salaireCalcul;			
			else
			salaire1 = 7574.00;
			break;
		
		case 17 :
			salaireCalcul = ((5157.25 * 2 / 100) * anneeE) + 5127.25 ;
			if (salaireCalcul <= 7220.15 )
			salaire1 = salaireCalcul;
			else
			salaire1 = 7220.15;
			break;
			
		default :
			if (classe < 15 || classe > 17)
			System.out.println ("Classe de salaire incorrect") ;
			break;
		
		}
		salaireTot += salaire1;
	}
		
		System.out.println ("Les salaires s'élèvent à un total de : " + salaireTot + ".-") ;
		System.out.println ("Salaires moyen de l'équipe : " + salaireTot/nmbrE + ".-") ;

	}
}
