import java.util.Scanner;
public class Ch4Ex7Binaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int nombre, resultat=0, total=0, division=0, i;
		
		System.out.println ("Veuillez inscrire un nombre décimal ");		
		nombre = scan.nextInt();
		
		division=nombre;
		total=nombre;

		while (division>0) {

		resultat = division%2;	
		division = total/2;
		total = division;

		System.out.print (resultat + " ");		
		
		}
	}

}
