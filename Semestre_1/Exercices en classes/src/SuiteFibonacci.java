import java.util.Scanner;

public class SuiteFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int terme, c1=1, c2=0, c3=0;
		
		System.out.println ("Nombres de termes :");		
		terme = scan.nextInt();
		
		System.out.print (0 + " ");		

		
		
		for (int i = 0 ; i < terme-1 ; i++) {

				c3 = c1 + c2;
				System.out.print(c3 + " ");
				c1 = c2;
				c2 = c3;
						
			}

		}
		
	}


