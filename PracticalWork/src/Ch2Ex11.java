import java.util.Scanner;

public class Ch2Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int model, valeurA, valeurN, ageV;
		
		double remise;
		
		System.out.println ("Veuillez indiquer la valeur argus de votre ancien véhicule :");
		valeurA = scan.nextInt();
		System.out.println ("Veuillez indiquer l'âge de votre ancien véhicule :");
		ageV = scan.nextInt();
		
		System.out.println ("Veuillez indiquer la valeur de votre nouveau véhicule :");
		valeurN = scan.nextInt();

		System.out.println ("Veuillez indiquer votre choix de véhicule : 1 = Fiesta, 2 = Escort 3 portes, 5 porte, 3 = Escort Break, 4 = Mondeo 4 portes, 5 portes, 5 = Mondeo Break, 6 = Scorpio, Taurus, 7 = Windsurf, Galaxy");
		model = scan.nextInt();
		
		
		remise = (valeurN*7.5/100);
				
		switch (model) {	
		case 1 :	
			if ((ageV>10)&&(valeurA<3000))
			System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 500 - 3000 ));
			else
			System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 500 - valeurA ));

			break;

		case 2 :
			if ((ageV>10)&&(valeurA<3000))
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 500 - 3000 ));
				else
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 500 - valeurA ));
			break;	
	
		case 3 :
			if ((ageV>10)&&(valeurA<3000))
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 1000 - 3000 ));
				else
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 1000 - valeurA ));
			break;
	
		case 4 :
			if ((ageV>10)&&(valeurA<3000))
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 800 - 3000 ));
				else
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 800 - valeurA ));
			break;
	
		case 5 :
			if ((ageV>10)&&(valeurA<3000))
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 1300 - 3000 ));
				else
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 1300 - valeurA ));
			break;
			
		case 6 :
			if ((ageV>10)&&(valeurA<3000))
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 2000 - 3000 ));
				else
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 2000 - valeurA ));
			break;
	
		case 7 :
			if ((ageV>10)&&(valeurA<3000))
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 1300 - 3000 ));
				else
				System.out.println ("Le prix de votre véhicule neuf sera de : " + (valeurN - remise - 1300 - valeurA ));
			break;
		}	
		
		
	}

}
