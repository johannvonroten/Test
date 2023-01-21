import java.util.Scanner;

public class Ch3Ex8Factorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		int i, factor = 1;
		int nombre;
		
		System.out.println ("De quel chiffre voulez vous la factorisation ? ");
		nombre = scan.nextInt();
			  
		for(i = 1 ; i <= nombre ; i++){
			factor = factor * i;
			
		  }
		
		  System.out.println("La factorielle de " + nombre + " est : " + factor);
	}

}
