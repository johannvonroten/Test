import java.util.Scanner;

public class FactoMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre, terme=0;
		
		Scanner scan = new Scanner (System.in);
	
		System.out.println ("De quel chiffre voulez vous la factorisation ? ");
		nombre = scan.nextInt();
		
	int resultat = facto (nombre);
	 System.out.println("La factorielle de votre chiffre est : " + nombre);

	}
	
	public static int facto(int t) {
		int factor=1;
		
	for(int i = 1 ; i <= t ; i++){
		factor = factor * i;
		
	  }
	return factor;

	}
}
