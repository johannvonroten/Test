import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int largeur, hauteur;
		
		System.out.println ("Largeur :");		
		largeur = scan.nextInt();
		
		System.out.println ("Hauteur :");		
		hauteur = scan.nextInt();
		
		for (int i = 0 ; i < hauteur ; i++) {

			for (int j = 0; j < largeur ; j++) {
				System.out.print("*");

			}
			System.out.println ();

		}
	}

}
