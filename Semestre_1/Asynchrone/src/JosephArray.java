
public class JosephArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		i = (i+1)%soldat
		
		int soldat=10, pas=3, cptPas = 3, nmbrMort = 0, leMort = 0;
		
		boolean[] tableau = new boolean[soldat];
		
		for (int i = 0 ; i<tableau.length ; i++) {
			tableau [i] = true;
		}
		for (int i = 0 ; i<tableau.length ; i++) {
			System.out.print (tableau [i] + " ");
			System.out.print ("\t");
	}		
		while (nmbrMort < soldat) {			
			leMort = (leMort+1)%soldat;

			if(tableau[leMort] == true) { 				
				cptPas++;
			
				if(cptPas == pas) {				
					tableau[leMort] = false;
					nmbrMort++;
					cptPas = 0;
					System.out.println();
					System.out.print(leMort + "\t");
					
					for (int i = 0; i < tableau.length; i++) 
						System.out.print(tableau[i] + "\t");		
				}	
			}
		}
			
			System.out.println ();
			System.out.println("Dernier Indice Mort : " + leMort);
			System.out.println("Le survivant : " + (leMort+1));

	}

}
