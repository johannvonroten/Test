import java.util.Scanner;

public class johannvonroten1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		double anneeE, salaire, salaireCalcul;
		int classe;
		
		
		System.out.print ("Entrez votre classe de salaire ? (15, 16, 17) :");
		classe = scan.nextInt();
		
		System.out.print ("Entrez vos années d'expériences ? :");
		anneeE = scan.nextDouble();
		
		
		
		
		switch (classe) {
		case 15 :
			salaireCalcul = ((5675.10 * 2 / 100) * anneeE) + 5675.10 ;
			if (salaireCalcul <= 7945.15 )
			System.out.println ("Votre salaire est de : " + salaireCalcul  + ".-");
			else
			System.out.println ("Votre salaire est de : 7945.15" );
		
			break;
		
		case 16 :
			salaireCalcul = ((5410.00 * 2 / 100) * anneeE) + 5410.00 ;
			if (salaireCalcul <= 7574.00 )
			System.out.println ("Votre salaire est de : " + salaireCalcul + ".-");
			else
			System.out.println ("Votre salaire est de : 7574.00" );
			break;
		
		case 17 :
			salaireCalcul = ((5157.25 * 2 / 100) * anneeE) + 5127.25 ;
			if (salaireCalcul <= 7220.15 )
			System.out.println ("Votre salaire est de : " + salaireCalcul + ".-");
			else
				System.out.println ("Votre salaire est de : 7220.15.-" );
			break;
			
		default :
			if (classe < 15 || classe > 17)
			System.out.println ("Classe de salaire incorrect") ;
			break;
		
		}
	}

}
