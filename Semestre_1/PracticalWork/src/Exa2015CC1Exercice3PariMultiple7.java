import java.util.Random;
import java.util.Scanner;

public class Exa2015CC1Exercice3PariMultiple7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int nombre=1, cas1, cas2, cas3, cas4, i, win=0;
		
		for (i = 1 ; i<9999 ; i++) {		
		
			cas1 = (nombre-2)%4;
			if (cas1 == 0) {
			win++;}
			
			cas2 = nombre%3;		
			cas3 = nombre%5;
			if (cas3 == 0 || cas2 == 0) {
			win++;}
				
			cas4 = nombre%7;
			if (cas4 == 0) {
			win++;}
		
			if ( win == 3)
				System.out.print (nombre + " ");
			
			win=0;
			nombre++;
		}
	}
}