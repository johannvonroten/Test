public class Voiture {
    int argus;
    Roue roue;
    Moteur moteur;

    public Voiture(int cylindre, int chevaux, int size, double pressure, int argus) {
        this.moteur = new Moteur(cylindre, chevaux);
        this.roue = new Roue(size, pressure);
        this.argus = argus;
    }
}
