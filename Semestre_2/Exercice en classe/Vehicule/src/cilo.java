public class cilo extends Vehicule {

    public cilo(int speed) {
        super(speed);
    }

    @Override
    public void accelerer(int speed) {
        super.accelerer(speed);
        System.out.println("j'accélère de 70 km/h en tournant la poignée. je suis donc bien en moto et je roule à " + this.speed + " km/h. ");

    }
}

