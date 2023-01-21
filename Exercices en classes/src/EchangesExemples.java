import java.util.* ;

public class EchangesExemples {

	public static void main(String[] args) {
		// cr�er les variables (�tape 1)
		int nb1, nb2, temp ; 
		
		// installation du "canal d'�coute"
		Scanner saisie = new Scanner(System.in) ;
		
		// saisie de chaines de caract�res
		String message ;
		System.out.println("Entrer un message de personnalisation: ") ;
		message = saisie.next() ;
		
		// donner les valeurs (�tape 2)
		System.out.println("Entrer une 1�re valeur : ") ;
		nb1 = saisie.nextInt() ;
		System.out.println("Entrer une 2�me valeur : ") ;
		nb2 = saisie.nextInt() ;
		
		// afficher les valeurs initiales
		System.out.print("nb1 vaut : " + nb1) ;
		System.out.println(" nb2 vaut : " + nb2) ;
		
		// �change
		temp = nb1 ; // �tape 3
		nb1 = nb2 ;	 // �tape 4
		nb2 = temp ; // �tape 5
		
		// afficher les valeurs apr�s les �changes
		System.out.println(message) ;
		System.out.print("nb1 vaut : " + nb1) ;
		System.out.println(" nb2 vaut : " + nb2) ;
		
		// fermer le m�canisme d'�coute
		saisie.close();
		
	}

}