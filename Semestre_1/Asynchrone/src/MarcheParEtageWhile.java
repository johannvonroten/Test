import java.util.Scanner;

public class MarcheParEtageWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombreEt, nombreMa, cptMa =1, cptEt =1;
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Nombres d'étages de votre maison ");		
		nombreEt = scan.nextInt();
		
		System.out.println ("Nombres de marche, par étage de votre maison ");		
		nombreMa = scan.nextInt();
	 
		
		while (cptMa<=(nombreEt*nombreMa)) {
			System.out.println ("Vous êtes sur la marche " +cptMa);	
			
			if (cptMa%nombreMa == 0)
				System.out.println ("Vous êtes a l'étage " + (cptMa/nombreMa));
	
			cptMa++;
			
			
					
	}

}
}