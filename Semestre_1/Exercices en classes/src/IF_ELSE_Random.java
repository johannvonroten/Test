import java.util.Random;
import java.util.Scanner;

public class IF_ELSE_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Générer des numéro aléatoires entre 1 à 10 (2ème méthode)
		int val3;
		int a = 2;
		
		Random Rand = new Random ();
		val3 = Rand.nextInt(10);
		System.out.println ("La valeur aléatoire avec la deuxième méthode est de :" + val3 );
		
		
		
		//Générer des numéro aléatoires entre 1 à 10 (1ère méthode)
		System.out.println("La valeur aléatoire avec la première méthode est de :" + (int)(Math.random()*10));
		
		//trouver le code unicode
		char caract = 'a';
		System.out.println ("Le caractère choisis est:" + caract );
		System.out.println ("Valeur en Unicode :" + (int)caract) ;
		
		int val1, val2;
		
		//Scanner (outil)
		Scanner scan= new Scanner(System.in) ;		
		
		//== != >< >= <=
		boolean test = (3!=5);
		System.out.println (test);	
		
		System.out.print ("Valeur 1 :");
		val1 = scan.nextInt();
				
		System.out.print ("Valeur 2: ");
		val2 = scan.nextInt();		
		
		// { = indentation; Pas de ; après le IF ou le  ELSE
		if(val1<val2) {
			System.out.println ("La plus grande est la valeur :" +val2);
			
		}else {
			System.out.println ("La plus grande est la valeur :" +val1);
		}
		
		
		System.out.println ("");

	}

}
