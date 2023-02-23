import java.util.Scanner;
public class CraquerCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int code, test, c1, d1, u1, c, d, u;
		
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
		
		if (code == test)
			System.out.println (" Bingo !");
		
		if (c==c1)
			System.out.println (" un des chiffre est juste et à la bonne place !");	
			else if (c==d1)
				System.out.println (" un des chiffre est juste mais pas à la bonne place !");	
				else if (c==u1)
					System.out.println (" un des chiffre est juste mais pas à la bonne place !");	

		if (d==d1)
			System.out.println (" un des chiffre est juste et à la bonne place !");	
			else if (d==c1)
				System.out.println (" un des chiffre est juste mais pas à la bonne place !");	
				else if (d==u1)
					System.out.println (" un des chiffre est juste mais pas à la bonne place !");	
				
		if (u==u1)
			System.out.println (" un des chiffre est juste et à la bonne place !");	
			else if (u==c1)
				System.out.println (" un des chiffre est juste mais pas à la bonne place !");	
				else if (u==d1)
					System.out.println (" un des chiffre est juste mais pas à la bonne place !");	
				
		else
			System.out.println (" Malheureusement, aucuns des chiffres ne sont justes");	

	}

}
