import java.util.Scanner;

public class Ch1Ex11Moyennes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double moyf, moya, exe, exo;
		
		Scanner Notes = new Scanner(System.in) ;
				
		String message ;
				
		System.out.println("Entrer la moyenne annuel : ") ;
		moya = Notes.nextInt() ;
		System.out.println("Entrer la note de l'exament écrit : ") ;
		exe = Notes.nextInt() ;
		System.out.println("Entrer la note de l'examen oral : ") ;
		exo = Notes.nextInt() ;
		
		moyf = ((moya*50)+(exe*25)+(exo*25))/100;
		
		System.out.print("La moyenne finale est de : " + moyf) ;
	}
	

}
