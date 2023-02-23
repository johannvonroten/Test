import java.util.Scanner;
public class CraquerCodeIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int code, test, c1, d1, u1, c, d, u;
		int reponseBienPlace = 0,reponseMalPlace = 0;
		int Bingo, MalPlace, Faux;
		
		System.out.println (" Veuillez indiquer un code à trois chiffres différents :");
		code = scan.nextInt();
		
		System.out.println (" Entrez un code à trois chiffres différents pour tester notre mot de passe :");
		test = scan.nextInt();
		
		c1 = (code / 100);
		d1 = (code%100)/10;
		u1 = (code%10);
		
		c = (test / 100);
		d = (test%100)/10;
		u = (test%10);
		
		if (c==c1)
			++reponseBienPlace;
			else if (c==d1)
				++reponseMalPlace;
				else if (c==u1)
					++reponseMalPlace;
		if (d==d1)
			++reponseBienPlace;
			else if (d==c1)
				++reponseMalPlace;
				else if (d==u1)
					++reponseMalPlace;
		if (u==u1)
			++reponseBienPlace;
			else if (u==c1)
				++reponseMalPlace;
				else if (u==d1)
					++reponseMalPlace;
				
		if (reponseBienPlace == 3)
			System.out.println (" Bingo !");
		
		else if (reponseMalPlace == 1)
			System.out.println (" Malheureusement, un seul des chiffres sur les trois sont justes !");
		
		else if (reponseMalPlace == 2)
			System.out.println (" Malheureusement, seulement deux des chiffres sur les trois sont justes !");	
		
		else if (reponseMalPlace == 3)
			System.out.println (" Malheureusement, tous les chiffres sont justes, mais mal placés !");	
		
		else
			System.out.println (" Malheureusement, aucuns des chiffres ne sont justes !");	
			
		
scan.close ();
	}

}
