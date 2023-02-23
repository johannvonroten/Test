import java.util.Scanner;

public class Ch1Ex23Arrondis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in) ;	
		
		System.out.println("Donnez un nombre entier :");
		
		int nombre = scan.nextInt ();
		
		int dizaine = nombre%100;
		int multiple = nombre /100;
		int arrondi;
		
	if (nombre<50)
		arrondi = 100;
	else if (dizaine >= 50)
		arrondi = (multiple+1)*100;
	else
		arrondi = (multiple *100);
	
	if (arrondi == nombre)
		System.out.println (nombre + "arrondi donne" + arrondi + " et " + nombre + "=" + arrondi);
	else if (nombre>arrondi)
		System.out.println (nombre + "arrondi donne" + arrondi + " et " + nombre + ">" + arrondi);
	else
		System.out.println (nombre + "arrondi donne" + arrondi + " et " + nombre + "<" + arrondi);

}




	}