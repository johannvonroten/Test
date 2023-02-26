public class GaufreDemo {
    public static void main(String[] args) {
        Gaufre one;

        one = new Gaufre();

        one.setArome("Chocolat");
        one.setGrammes(200);
        one.setGrignoter(10);
        one.setManger(20);

        System.out.println("La gaufre est de " + one.getArome() + " et elle pèse " + one.getGrammes() + " grammes" + " chaque bouchées fait " + one.getGrignoter() + " grammes et chaque morceau fait " + one.getManger() + " grammes.");
    }
}

