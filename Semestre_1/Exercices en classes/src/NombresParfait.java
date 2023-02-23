
public class NombresParfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j=1, nombre=1, calcul, diviseur;
		
		for (i=0 ; i<=30000 ; i++) {
			++nombre;
			diviseur = 0;
			
			for (j=1 ; j<nombre ; j++ ) {				
				calcul = (nombre%j);
				
				if (calcul == 0)
					diviseur += j;

				
			}
			
			if (diviseur == nombre)
				System.out.println (nombre + " est un nombre parfait.");

		}
	}

}
