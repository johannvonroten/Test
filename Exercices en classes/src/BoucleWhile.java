import java.util.Scanner;
public class BoucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		int somme = 0;
		int nombre;
		
		while (somme<100) {
		
		System.out.println (" Veuillez indiquer un nombre plus petit que 100 :");
		nombre = scan.nextInt();
		somme += nombre;
		}
		
		
		System.out.println (" Somme obtenue: " +somme);
	
		
		
		
	}

}
