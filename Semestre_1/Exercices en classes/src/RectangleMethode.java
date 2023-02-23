
public class RectangleMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle (3, 4);
		rectangle1 (2, 2);
		rectangle2 (1, 12);
		rectangle3 (3, 4, '"');
		rectangle4 (2, 5, '&');
		rectangle5 (1, 10, '!');


		
	}
	public static void rectangle(int haut, int larg) {
		int largeur = 4;
		int hauteur = 3;
		larg = largeur;
		haut = hauteur;
		for (int i = 0 ; i<haut ; i++) {		
			for (int j = 0 ; j<larg ; j++) {		
			System.out.print("*");
			}
			System.out.println();	
	}
	}
	public static void rectangle1(int haut, int larg) {
	int largeur = 2;
	int hauteur = 2;
	larg = largeur;
	haut = hauteur;
	for (int i = 0 ; i<haut ; i++) {		
		for (int j = 0 ; j<larg ; j++) {		
		System.out.print("*");
		}
		System.out.println();	
}
}
	public static void rectangle2(int haut, int larg) {
	int largeur = 12;
	int hauteur = 1;
	larg = largeur;
	haut = hauteur;
	for (int i = 0 ; i<haut ; i++) {		
		for (int j = 0 ; j<larg ; j++) {		
		System.out.print("*");
		}
		System.out.println();	
}
}
	public static void rectangle3(int haut, int larg, char car) {
	int largeur = 4;
	int hauteur = 3;
	larg = largeur;
	haut = hauteur;
	for (int i = 0 ; i<haut ; i++) {		
		for (int j = 0 ; j<larg ; j++) {		
		System.out.print(car);
		}
		System.out.println();	
}
}
	public static void rectangle4(int haut, int larg, char car) {
	int largeur = 5;
	int hauteur = 2;
	larg = largeur;
	haut = hauteur;
	for (int i = 0 ; i<haut ; i++) {		
		for (int j = 0 ; j<larg ; j++) {		
		System.out.print(car);
		}
		System.out.println();	
}
}
	public static void rectangle5(int haut, int larg, char car) {
	int largeur = 10;
	int hauteur = 1;
	larg = largeur;
	haut = hauteur;
	for (int i = 0 ; i<haut ; i++) {		
		for (int j = 0 ; j<larg ; j++) {		
		System.out.print(car);
		}
}
}
}

