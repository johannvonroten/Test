import java.util.Scanner;

public class PiLeipniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double i, terme, divise = 1, nbr2=0, calcul=0, nbr1=0, nbr3=0, calculeI=0;
		char signe;
		
		System.out.println ("Nombres de termes :");		
		terme = scan.nextInt();
		
		nbr1 = 4/1;
		

		for (i=1 ; i<terme+1 ; i++) {
			divise += 2;
			calculeI = 4/divise;
			nbr2 = calculeI;
			
		
			if (i%2 == 0)
				calcul = nbr1+nbr2;
			else if (i%2 == 1)
				calcul = nbr1-nbr2;
			
		}
		
		System.out.print(calcul + " ");

			
			nbr3 = nbr1;
			nbr1 = nbr2;
			nbr2 = calculeI;
					
	}

}
