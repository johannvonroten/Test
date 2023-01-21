import java.util.Scanner;

public class ExerciceMarcheForImbrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int etage=3, marches=6;
		
		for (int i = 1 ; i <= etage ; i++) {

			for (int j =1 ; j <= marches ; j++) {
				System.out.println ("Je me trouve à la marche " + j);

			}
			System.out.println ("Je me trouve à l'étage " + i);

		}
	}

}
