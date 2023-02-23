
public class BoucleImbriquee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ("Je rentre dans la 1ère boucle");

		for (int i = 1 ; i<6 ; i++) {		

			for (int j = 0 ; j<10 ; j++) {		
				System.out.print (i);
			}
			System.out.println ();
		}
		
		System.out.println ();

		int nombre = 1;
		System.out.println ("Je rentre dans la 2ème boucle");

		for (int i = 1 ; i<6 ; i++) {		

			for (int j = 0 ; j<10 ; j++) {		
				System.out.print (nombre);
			}
			nombre++;
			System.out.println ();
		}
		
		
	}

}
