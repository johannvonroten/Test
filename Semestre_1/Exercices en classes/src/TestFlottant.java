
public class TestFlottant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.2;
		
		double somme;
		
		somme = x + x + x + x + x;
		
		System.out.println("La somme vaut " + somme);
	
		
		if (somme == 1.0 )
			System.out.println("La somme vaut 1");
		
		else
			System.out.println("La somme ne vaut pas 1");
				
/////////////////////////////////////////////////////////////////		
		
		double z = 0.1;
		
		double total;
		
		total = z + z + z + z + z + z + z + z + z + z;
		
		System.out.println("La somme vaut " + total);
	
		
		if (total == 1.0 ) // Jamais comparer deux doubles
			System.out.println("La somme vaut 1");
		
		else
			System.out.println("La somme ne vaut pas 1");
		
/////////////////////////////////////////////////////////////		
		
		int a = Integer.MAX_VALUE;
		
		
		System.out.println("La valeur vaut " + a);
		
/////////////////////////////////////////////////////////////
		
		int b = Integer.MAX_VALUE;
		
		b = ++b;
		
		System.out.println("La valeur vaut " + b);
											
		
		
	}

}
