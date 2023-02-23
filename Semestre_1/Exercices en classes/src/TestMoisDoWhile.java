import java.util.Scanner;

public class TestMoisDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int mois = 0;
		
		do {
			System.out.println ("Entrez un mois ");	
		mois = scan.nextInt();	
		}
				
		while (mois<1 || mois>12); 
			
		System.out.println ("Ok");	

	}
}

