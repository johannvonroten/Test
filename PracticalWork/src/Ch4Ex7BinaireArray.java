import java.util.Scanner;
public class Ch4Ex7BinaireArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int nombre, resultat=0, total=0, division=0, i=0, j=0, k, tabl=0;
		int [] tableau;		
		
		System.out.println ("Veuillez inscrire un nombre décimal ");		
		nombre = scan.nextInt();
		
		division=nombre;
		total=nombre;
		
		while (division>0) {

			resultat = division%2;
			division = total/2;
			total = division;
			i++;
		}

		tableau = new int [i];		
		
		division=nombre; 
		total=nombre;

		for (j=0 ; j<i ; j++) {

		resultat = division%2;	
		tabl = resultat;

		tableau [j] = tabl;
		
		division = total/2;
		total = division;

		}
		
		for (k = i-1 ; k > -1 ; k--) {
			System.out.print (tableau [k] + " ");

	}
	}

}
