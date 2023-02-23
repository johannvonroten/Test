import java.util.Scanner;
public class AnneeBisextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int annee, calcul; 
			
		Scanner date = new Scanner (System.in);
		
		System.out.println (" Veuillez indiquer une année :");
		annee = date.nextInt();
		
		if ((annee % 4 == 0 && !(annee % 100 == 0)) || (annee % 400 == 0))
			
		System.out.println (" C'est une année Bissextile.");
		else 
			System.out.println (" Ce n'est pas une année Bissextile.");

		
	}

}
