public class citroen extends Vehicule {

    public citroen(int speed) {
        super(speed);
    }

    @Override
    public void accelerer(int speed) {
        super.accelerer(speed);
        System.out.println("j'accélère de 15 km/h en appuyant sur les gaz. je suis donc bien en voiture et je roule à " + this.speed + " km/h. ");

    }

}
