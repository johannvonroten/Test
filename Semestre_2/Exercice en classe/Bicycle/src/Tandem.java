public class Tandem extends Bicycle {

    private Gourd Gourd2;

    public Tandem(int startSpeed, int startGear, Gourd Gourd, Gourd Gourd2) {
        super(startSpeed, startGear, Gourd);
        this.Gourd = Gourd;
        this.Gourd2 = Gourd2;
    }
    public void speedUp(int inc) {
        speed += 2 * inc;
    }


    @Override
    public void ride() {
        System.out.println("Riding a tandem");
    }

    @Override
    public String toString() {
        return "speed:" + speed + " gear:" + gear + " gourd:" + Gourd.GourdContent + " gourd2:" + Gourd2.GourdContent;
    }

}


