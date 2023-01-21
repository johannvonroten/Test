import java.util.Scanner;

public class IfElseIfElseCinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PrixN=16, PrixR=13, PrixE=11, PrixL=3;
		
		Scanner scan= new Scanner(System.in) ;
		
		int age, lunette ;
		
		System.out.println("Veuillez renseigner votre âge: ") ;
		age = scan.nextInt();
		
		System.out.println("Voulez-vous des lunettes 3D = 0 = Non, 1 = Oui ") ;
		lunette = scan.nextInt();
		
		if (age <= 12 && lunette == 1) 
			System.out.println("Le prix est de :" + (PrixE+PrixL));
		
		else if (age <= 12 && lunette == 0) 
			System.out.println("Le prix est de :" + PrixE);
		
			
		else if (age <= 16 && lunette == 1) 
			System.out.println("Le prix est de :" + (PrixR+PrixL));
		
		else if (age <= 16 && lunette == 0) 
			System.out.println("Le prix est de :" + PrixR);		
		 
			
		else if (age >= 65 && lunette == 1) 
			System.out.println("Le prix est de :" + (PrixR+PrixL));
		
		else if (age >= 65 && lunette == 0) 
			System.out.println("Le prix est de :" + PrixR);		
			
			
		else if ((age>=16 && age<=65) && lunette == 1)			
			System.out.println("Le prix est de :" + (PrixN+PrixL));
		
		else
			System.out.println("Le prix est de :" + PrixN);
		}
	
	


	}