public class SablierPapillons {
	
	public static void main(String[] args) {
        String ch1 = "sablier";
        String ch2 = "papillons";
        afficheSablier(ch1);
        affichePapillons(ch2);

        afficheMatriceSablier(ch1);
        affichePapillons(ch2);

    }
    public static void afficheSablier(String ch1){
        System.out.println(ch1);
        String nouveau = "sablier";
        int i = 0;
        int indice = ch1.length()-1;
        for (i = 0; i<indice/2 + 1; i++){
            nouveau = nouveau.replace(nouveau.charAt(i), ' ');
            nouveau = nouveau.replace(nouveau.charAt(indice), ' ');
            System.out.println(nouveau);
            indice--;
        }
        indice++;
        for (i = indice/2; i>=0; i--){
            nouveau = nouveau.substring(0, i)+ ch1.charAt(i) + nouveau.substring(i+1);
            nouveau = nouveau.substring(0, indice)+ ch1.charAt(indice) + nouveau.substring(indice+1);
            System.out.println(nouveau);
            indice++;
        }
    }
    public static void affichePapillons(String ch2){
        String nouveau = "p       s";
        int i = 0;
        int indice = ch2.length()-1;
        int moitie = indice/2+1;
        for (i = 0; i<moitie; i++){
            nouveau = nouveau.substring(0, i)+ ch2.charAt(i) + nouveau.substring(i+1);
            nouveau = nouveau.substring(0, indice)+ ch2.charAt(indice) + nouveau.substring(indice+1);
            System.out.println(nouveau);
            indice--;
        }
        String nouveau2 = "         ";
        indice = ch2.length()/2;
        for (i = ch2.length()/2; i>=0; i--){
            nouveau = nouveau.substring(0, i)+ nouveau2.charAt(i) + nouveau.substring(i+1);
            nouveau = nouveau.substring(0, indice)+ nouveau2.charAt(indice) + nouveau.substring(indice+1);
            System.out.println(nouveau);
            indice++;
        }


    }
    public static void afficheMatriceSablier(String ch1){
        char [][]matrice = new char[ch1.length()][ch1.length()];
        int indicefin = ch1.length()-1;
        int indicedebut = 0;
        for (int i = 0; i< matrice.length; i++){
            for (int j = 0; j < matrice.length; j++){
                if (i< matrice.length/2+1){
                    if (j< indicedebut || j> indicefin)
                        matrice[i][j] = ' ';
                    else
                        matrice[i][j] = ch1.charAt(j);
                }
                else{
                    if (j< indicefin || j> indicedebut)
                        matrice[i][j] = ' ';
                    else
                        matrice[i][j] = ch1.charAt(j);
                }
                System.out.print(matrice[i][j]);
            }
            indicedebut++;
            indicefin--;
            System.out.println();
        }
    }
    public static void afficheMatricePapillons(String ch2){
        char [][]matrice = new char[ch2.length()][ch2.length()];
        int indicefin = ch2.length()-1;
        int indicedebut = 0;
        for (int i = 0; i< matrice.length; i++){
            for (int j = 0; j < matrice.length; j++){
                if (i< matrice.length/2+1){
                    if (j< indicedebut || j> indicefin)
                        matrice[i][j] = ch2.charAt(j);
                    else
                        matrice[i][j] = ' ';
                }
                else{
                    if (j< indicefin || j> indicedebut)
                        matrice[i][j] = ch2.charAt(j);
                    else
                        matrice[i][j] = ' ';
                }
                System.out.print(matrice[i][j]);
            }
            indicedebut++;
            indicefin--;
            System.out.println();
        }
    }
}