import java.util.Scanner;

public class LendemainJour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner (System.in);
		
		int mois, annee, jour;
		
		System.out.println ("Veuillez indiquer une année :");
		annee = myInput.nextInt();
		
		System.out.println ("Le numéro du mois choisis :");
		mois = myInput.nextInt();
		
		System.out.println ("Le numéro du jour choisis :");
		jour = myInput.nextInt();
		
		switch (mois) {
		
		case 1 :			
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 2 :
		if (annee % 4 == 0 && !(annee % 100 == 0) || (annee % 400 == 0) && jour >= 28)
			System.out.println ("La date du lendemain est le " + 1 + "." + ++mois + "." + annee);
	    
		else if (annee % 4 != 0 && !(annee % 100 != 0) || (annee % 400 != 0)&& jour<30 )
	        System.out.println("La date du lendemain est le " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
			
	    
		case 3 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 4 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 5 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 6 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 7 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 8 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 9 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 10 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 11 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
		
		case 12 :
		if (jour <31)
			System.out.println ("le lendemain du jour sélectionné est le: " + ++jour + "." + mois + "." + annee);
		else 
			System.out.println ("le lendemain du jour sélectionné est le: " + "1" + "." + ++mois + "." + annee);
		break;
							
}
}
}
	





