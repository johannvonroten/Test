public class Vehicule {
    int speed;

    public Vehicule(int speed) {
        this.speed = speed;
    }

    public void accelerer (int speed) {
        this.speed += speed;
        System.out.println("Vitesse actuelle: " + this.speed);

    }
}
