public class StatTricount {
    public static void main(String[] args) {
        int somme1=0,somme2=0;

        //Affiche tableau
        display(dataTricount());
        //total pour une personne
        somme1=totalPersonne1(dataTricount());
        somme2=totalPersonne2(dataTricount());

        System.out.println("total de la personne 1 : " + somme1 );
        System.out.println("total de la personne 2 : " + somme2 );

        //Qui doit combien à qui
        quiDoitCombienAQui(dataTricount());
    }

    public static int[][] dataTricount() {
        int[][] data = {{290, 0, 2},
                {45, 1, 2},
                {108, 0, 2},
                {129, 0, 2},
                {89, 1, 2},
                {95, 1, 2},
                {124, 0, 2},
                {325, 1, 1},
                {45, 0, 0},
                {23, 1, 2},
                {92, 0, 2},
                {111, 1, 1},
                {118, 1, 2}};

        return data;
    }

    public static void display(int[][] matrice) {
        int i, j;

        for (i = 0; i < matrice.length; i++) {
            for (j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int totalPersonne1(int[][] matrice) {
        int i, j, somme1 = 0, somme2 = 0;

        for (i = 0; i < matrice.length; i++) {
            if (matrice[i][1] == 0) {
                somme1 += matrice[i][0];
            }
        }
        return somme1;
    }

    public static int totalPersonne2(int[][] matrice) {
        int i, j, somme1 = 0, somme2 = 0;

        for (i = 0; i < matrice.length; i++) {
            if (matrice[i][1] == 1) {
                somme2 += matrice[i][0];
            }
        }
        return somme2;
    }
    public static void quiDoitCombienAQui(int [][]matrice){
        int i, j,qui,quiDoit;
        int somme1 = 0, somme2 = 0,moitieSomme,montantAPayer,sommeQui = 0;

        for (i=0;i< matrice.length; i++){
            if (matrice[i][2]==2){
                if (matrice[i][1] == 0){
                    somme1 += matrice[i][0];
                }
                if (matrice[i][1] == 1) {
                    somme2 += matrice[i][0];
                }
            }
        }
        moitieSomme = (somme1  + somme2)/2;

        if  (somme1 < somme2){
            qui = 1;
            quiDoit = 0;
        } else {
            qui = 0;
            quiDoit = 1;
        }

        switch (qui){

            case 0 :
                sommeQui = somme1;
            case 1 :
                sommeQui = somme2;
        }

        montantAPayer = (sommeQui - moitieSomme) *-1 + ((somme1 + somme2) %  2);

        System.out.println("La personne " +quiDoit + " doit "  + montantAPayer + " à la personne " + qui);
    }
}

