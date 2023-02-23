public class Billeterie {
    public static void main(String[] args) {
        int [] tableau = new int [20];

        //initialise tableau à -1
        initialise(tableau);
        // insère nouveau client
        nouveauClient(5, tableau);
        affiche(tableau);

        nouveauClient(9, tableau);
        nouveauClient(2, tableau);
        nouveauClient(8, tableau);
        nouveauClient(4, tableau);
        affiche(tableau);
        traitementClient(tableau);

        nouveauClient(1, tableau);
        nouveauClient(6, tableau);
        afficheFile(tableau);
        traitementClient(tableau);
        traitementClient(tableau);
        afficheFile(tableau);

    }
    public static void initialise(int[]tab){
        int i;

        for (i = 0; i<tab.length;i++){
            tab[i]= -1;

        }
    }
    public static void nouveauClient(int num, int [] tab){
        int i;

        for (i = 0; i< tab.length; i++){
            if (tab[i] == -1){
                tab[i] = num;
                i = tab.length;
            }
        }

    }
    public static void traitementClient(int [] tab){
        int i;

        for (i=1; i< tab.length; i++){
            tab[i-1]= tab[i];
        }
    }
    public static void affiche(int [] tab){
        int i;

        for (i=0; i< tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    public static void afficheFile(int [] tab){
    int i;

        for (i=0; i< tab.length; i++){
            if(tab[i]!= -1){
                System.out.print(tab[i] + " ");
            }
        }
        System.out.println();
        }
    }
