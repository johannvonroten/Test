import java.util.Scanner;
public class Ch1Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner (System.in);
	
	System.out.println ("Veuillez entrer un premier entier");
	int chiffre = scan.nextInt();
	
	System.out.println ("Veuillez entrer un deuxième entier");
	int nombre = scan.nextInt();
	
	if (chiffre < nombre)
	
	System.out.println ("La somme est:"+ (chiffre + nombre) + "La moyenne de ces nombre est :" + ((chiffre + nombre)/2) + " Le produit de ces nombres " + (chiffre * nombre) + nombre + " est supérieur à " + chiffre) ;

	else
		System.out.println ("La somme est:"+ (chiffre + nombre) + "La moyenne de ces nombre est : " + ((chiffre + nombre)/2) + " Le produit de ces nombres " + (chiffre * nombre) + "enfin, " + chiffre + " est supérieur à " + nombre );

	}

}
