import java.util.Scanner;
public class Paques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        
			Scanner scan = new Scanner (System.in);
			System.out.println("En quelle année sommes-nous ? ");
			int year = scan.nextInt ();
						
			int Y = year;
		    int a = Y % 19;
		    int b = Y / 100;
		    int c = Y % 100;
		    int d = b / 4;
		    int e = b % 4;
		    int f = (b + 8) / 25;
		    int g = (b - f + 1) / 3;
		    int h = (19 * a + b - d - g + 15) % 30;
		    int i = c / 4;
		    int k = c % 4;
		    int L = (32 + 2 * e + 2 * i - h - k) % 7;
		    int m = (a + 11 * h + 22 * L) / 451;
		    int month = (h + L - 7 * m + 114) / 31;
		    int day = ((h + L - 7 * m + 114) % 31) + 1;
		    
		    System.out.println("Pâque de l'année " + year + " sera le " + day + " jour " + " du " + month + "ème mois de l'année ! " );
	}

	}

