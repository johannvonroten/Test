import java.util.Scanner;
public class PrimeNoel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double heuresS, heuresSu, heuresA, heuresAB, result = 0.0 ;
		
		System.out.println ("Veuillez indiquer le nombres d'heures supplémentaires : ");
		heuresS = scan.nextInt();

		System.out.println ("Veuillez indiquer le nombres d'heures d'absences : ");
		heuresA = scan.nextInt();
		
		heuresAB = heuresA*2/3;
		heuresSu = heuresS-heuresAB;
		
		if (heuresSu > 40) 
			result = 500;
		 else 
			 
			if (heuresSu>30 && heuresSu<=40 ) 
				result = 400;				
			 else 
				 
				if (heuresSu>20 && heuresSu<=30) 
					result = 300;		
				else 
					if (heuresSu>10 && heuresSu<=20) 
						result = 200;			
					else
						
						if (heuresSu<=10) 
							result = 100;				
						else {
						}	
			System.out.println ("Votre prime se monte à : " + result + "CHF");
 

	}

}
