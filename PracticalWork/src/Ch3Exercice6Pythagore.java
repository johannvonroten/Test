import java.util.Scanner;

public class Ch3Exercice6Pythagore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		int cote1, cote2, hypo, a=0, b=0, c=0, testR = 0, testRa = 0, pui1, pui2, puiH;
		int essai1, essai2, essaiH;
		
		System.out.println ("Coté 1 :");	
		cote1 = scan.nextInt();
		System.out.println ("Coté 2 :");	
		cote2 = scan.nextInt();
		System.out.println ("Hypoténuse :");	
		hypo = scan.nextInt();		
		
		pui1 = (cote1*cote1);
		pui2 = (cote2*cote2);
		puiH = (hypo*hypo);	
		essai1 = (hypo*hypo)-(cote2*cote2);
		essai2 = (hypo*hypo)-(cote1*cote1);
		essaiH = (cote1*cote1)+(cote2*cote2);
		
		
		
		for (cote1 = 0 ; a<41417166 ; a++) {
			if (pui1 == essai1)
			++testR;
			else
			++testRa;
	
		for (cote2 = 0 ; b<41417166 ; b++) {	
			if (pui2 == essai2)
			++testR;
			else
			++testRa;

		for (hypo = 0 ; c<41417166 ; c++) {	
			if (puiH == essaiH)
			++testR;
			else
			++testRa;
		  }
		 }
		}
System.out.print ("Il y a " + testR + " tests réussis, sûr " + (testRa+testR) + " tests qui ont été fait.");

	}
}
