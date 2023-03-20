public class cagiva extends Vehicule {

    public cagiva(int speed) {
        super(speed);
    }

    @Override
    public void accelerer(int speed) {
        super.accelerer(speed);
        System.out.println("j'accélère de 5 km/h en pédalant plus vite. je suis donc bien sur un vélo et je roule à " + this.speed + " km/h. ");

    }
}
