import java.util.Scanner;

public class Ch3Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);	
		int element, element1, boisson;
		char element2 = 'n';
		
		while (element2 == 'n') {

		System.out.println ("Veuillez choisir un élément ci-dessous:");	
		System.out.println ();		
		System.out.println ("1. Prix des boissons");		
		System.out.println ("2. Prix des pizzas");		
		System.out.println ("3. Prix des salades");		
		System.out.println ("4. Sortir du menu");		
		element = scan.nextInt();
		
		
		switch (element) {
		case 1 :
			System.out.println ("1. Jus d'orange");		
			System.out.println ("2. Fendant");		
			System.out.println ("3. Whisky");
			element1 = scan.nextInt();
			if (element1 == 1) {
				System.out.println ("Le prix d'un jus d'orange est de 2 Frs");
			System.out.println ();}
			else if (element1 == 2) {
				System.out.println ("Le prix d'un fendant est de 8 Frs");
			System.out.println ();}
			else if (element1 == 3) {
				System.out.println ("Le prix d'un whisky est de 70 Frs");	
			System.out.println ();}
			break;
		
		case 2 :
			System.out.println ("1. Margharita");		
			System.out.println ("2. 4 saisons");		
			System.out.println ("3. Calzone");
			element1 = scan.nextInt();
			if (element1 == 1) {
				System.out.println ("Le prix d'une Margharita est de 13 Frs");
			System.out.println ();}
			else if (element1 == 2) {
				System.out.println ("Le prix d'une 4 saisons est de 16 Frs");	
			System.out.println ();}
			else if (element1 == 3) {
				System.out.println ("Le prix d'une Calzone est de 16 Frs");	
			System.out.println ();}
			break;	
		
		case 3 :
			System.out.println ("1. Verte");		
			System.out.println ("2. Mêlée");		
			System.out.println ("3. Niçoise");
			element1 = scan.nextInt();
			if (element1 == 1) {
				System.out.println ("Le prix d'une salade verte est de 5 Frs");
			System.out.println ();}
			else if (element1 == 2) {
				System.out.println ("Le prix d'une salade mêlée est de 7 Frs");	
			System.out.println ();}
			else if (element1 == 3) {
				System.out.println ("Le prix d'une salade niçoise est de 8 Frs");
			System.out.println ();}
			break;
			
		case 4 :
			System.out.println ("Voulez-vous vraiment quitter le menu ?");
			System.out.println ("o, n");
			element2 = scan.next().charAt(0);
			if (element2 == 'o')
				System.out.println ("Le programme s'arrète");
			else if (element2 == 'n') {
				System.out.println ("Le programme continue");
			System.out.println ();}
			
		
		
	
		}
		
		}	
		
	}

}
