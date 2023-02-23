import java.util.Scanner;

public class Ch1Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Franc, FrancB=1.00, FrancE, FrancD, convE, convD, Euro = 1.03, Dollar = 1.01;
				
		Scanner Notes = new Scanner(System.in) ;
		
		String message ;
				
		System.out.println("Combien avez-vous de CHF ? ") ;
		Franc = Notes.nextInt() ;
		
		FrancE = Franc * Euro;
		FrancD = Franc * Dollar;
	
		System.out.println("Ca représente"+ FrancE +"Euros") ;
		System.out.println("Ca représente"+ FrancD +"Dollars") ;

	}

}
