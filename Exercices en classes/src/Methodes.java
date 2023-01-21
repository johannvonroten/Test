
public class Methodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res;
		
		res = Math.random();		
		System.out.println("Random " + res);
		
		res = Math.PI;
		System.out.println("PI " + res);
		
		res = Math.abs(-5);
		System.out.println("Absolu " + res);
		
		res = Math.min(-2, 8);
		System.out.println("Minimum " + res);
		
//Création d'une méthode		
		int v1=3;
		int v2=6;
		
		int resu = myMin(v1, v2);
		System.out.println("MyMin " + resu);
				
		double res1 = myMin (5.3, -3.7); 
		System.out.println("MyMindouble " + res1);

		int res2 = myMin (4, 3, 2);
				System.out.println("MyMin3 " + res2);
				
		int min1 = myMin1 (4, 3, 2);
				System.out.println("MyMin3min " + res2);

	}
//Création d'une méthode
	
public static int myMin(int a, int b) {
	int min;
	if (a<b)
		min = a;
	else
		min = b;
	return min;
}

public static double myMin(double a, double b) {
	double min;
	if (a<b)
		min = a;
	else
		min = b;
	return min;	
}

public static int myMin(int a, int b, int c) {
	int min=0;
	if (a<b && a<c)
		min = a;
	else if (b<a && b<c)
		min = b;
	else if (c<a && c<b)
		min = c;
	return min;	
}

public static int myMin1(int a, int b, int c) {
	int min = myMin(a, b);
	int min1 = myMin(min, c);
	return min1;	
	
	
}

}


