import java.util.Scanner;

public class ExerciceModulo9Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//On désire écrire un programme qui détermine si
		//un nombre (<1000) est un multiple de 9, en
		//suivant les critères de divisibilité, wikipédia.
		//On utilisera donc pas le modulo 9, (mais oui pour
		//le modulo 10)
		
		double Nombre, Modulo, Calcul;
		Scanner Chiffre= new Scanner(System.in) ;
		
		System.out.println("Votre nombre est il un multiple de 9 ? Inscrivez-en un: ") ;
		Nombre = Chiffre.nextFloat();
				
		Modulo = (19%10);
				
		Calcul = (Nombre / (Modulo));
				
		System.out.println (Calcul);	
	}

}

