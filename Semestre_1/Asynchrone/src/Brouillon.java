		import java.util.ArrayList;
		import java.util.Random;
		
public class Brouillon {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub


		    // Créer un objet Random
		    Random rand = new Random();

		    // Créer un tableau de 4 lignes et 6 colonnes
		    int[][] array = new int[4][6];

		    // Créer une liste pour enregistrer les nombres déjà générés
		    ArrayList<Integer> numbers = new ArrayList<>();

		    // Remplir le tableau avec des nombres aléatoires compris entre 1 et 24
		    for (int i = 0; i < 4; i++) {
		      for (int j = 0; j < 6; j++) {
		        // Générer un nouveau nombre aléatoire
		        int n = rand.nextInt(24) + 1;

		        // Vérifier si le nombre a déjà été généré
		        while (numbers.contains(n)) {
		          // Si oui, générer un autre nombre
		          n = rand.nextInt(24) + 1;
		        }

		        // Ajouter le nouveau nombre à la liste et au tableau
		        numbers.add(n);
		        array[i][j] = n;
		      }
		    }

		    // Afficher le tableau
		    for (int i = 0; i < 4; i++) {
		      for (int j = 0; j < 6; j++) {
		        System.out.print(array[i][j] + "\t ");
		      }
		      System.out.println();
		    }
		  }
		}
	
	


