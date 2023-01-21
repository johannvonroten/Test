import java.util.Scanner;
public class Ch2Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		double r1, r2, r3, rTotaleParrallele, rTotalSerie, reponse;
		
		System.out.println ("Voulez-vous votre calcul en parrallèle ou en série ? 0 = Parrallèle, 1 = Série ");
		reponse = scan.nextDouble();

		System.out.println ("Valeur de R1: ");
		r1 = scan.nextDouble();
		
		System.out.println ("Valeur de R2: ");
		r2 = scan.nextDouble();
		
		System.out.println ("Valeur de R3: ");
		r3 = scan.nextDouble();

		rTotaleParrallele = r1 + r2 + r3;
		rTotalSerie = 1.0/(1.0/r1 + 1.0/r2 + 1.0/r3);
		
		
		
		if (reponse == 0)
		
		System.out.println ("Résistance équivalente en parallèle: " + rTotaleParrallele);
		
		else
		
		System.out.println ("Résistance équivalente en série: " + rTotalSerie);
		


	}

}
