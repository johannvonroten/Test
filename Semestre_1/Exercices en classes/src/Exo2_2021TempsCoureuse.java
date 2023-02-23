public class Exo2_2021TempsCoureuse {

	public static void main(String[] args) {
        double [][]temps = {{0, 0, 0},
                {54.13, 108.74, 0},
                {53.98, 107.46, 0},
                {55.04, 109.41, 0},
                {54.17, 108.73, 0},
                {54.95, 108.95, 0},
                {55.01, 109.28, 0},
                {54.02, 109.71, 0},
                {54.55, 108.54, 0},
                {55.02, 109.55, 0},
                {54.71, 109.25, 0}} ;
        String []coureuses = {"",
                "Michaela Shiffrin",
                "Michèle Gisin",
                "Petra Vhlova",
                "Katherina Lienzberger",
                "Wendy Holdener",
                "Laurence St-Germain",
                "Chiara Mair", 
                "Camille Rast",
                "Katherina Truppe",
                "Sara Hector"} ;
        System.out.println("Voici les temps des différentes coureuses lors de la 1e manche");
        affiche(coureuses, temps, 0);
        System.out.println();
        System.out.println("Voici les temps des différentes coureuses à l'arrivée");
        affiche(coureuses, temps, 1);
        System.out.println();
        System.out.println("Voici les temps des différentes coureuses lors de la manche 2");
        temps = calculeTempsManche2(temps);
        affiche(coureuses, temps, 2);
        System.out.println();
        double [][]result = classement(coureuses, temps, 2);
        afficheBest5(coureuses, result, 2);
    }
    public static void affiche(String []coureuses, double [][]temps, int étape){
        for (int i = 1; i< temps.length; i++){
            System.out.println(coureuses[i] + " " + temps[i][étape]);
        }
    }
    public static double[][] calculeTempsManche2(double [][]temps){
        for (int i = 1; i< temps.length; i++){
            temps[i][2] = temps[i][1]-temps[i][0];
        }
        return temps;
    }
    public static double[][] classement(String[]coureuses, double [][]temps, int etape){
        double [][]tri = new double[5][2];
        double minimum = 1000.0;
        double paspluspetit = 0.0;
        for (int i = 0; i< tri.length; i++){
            for (int j = 1; j<temps.length; j++){
                if (i!=0){
                    if (temps[j][etape]>paspluspetit){
                        if (temps[j][etape]<minimum ){
                            minimum = temps[j][etape];
                            tri[i][0] = j;
                            tri[i][1]= minimum;
                        }
                    }
                }
                else{
                    if (temps[j][etape]< minimum){
                        minimum = temps[j][etape];
                        tri[i][0] = j;
                        tri[i][1]= minimum;
                    }
                }

            }
            paspluspetit = minimum;
            minimum = 1000.0;
        }
        return tri;
    }
    public static void afficheBest5(String []coureuses, double [][]result, int etape){
        for(int i = 0; i< result.length;i++){
            System.out.println((int)(result[i][0]) + " " + coureuses[(int)(result[i][0])] + " " + result[i][1]);
        }
    }
}