public class Bicycle {
    int speed = 0;
    int gear = 1;
    protected Gourd Gourd;

    public Bicycle(int startSpeed, int startGear, Gourd Gourd) {
        gear = startGear;
        speed = startSpeed;
        this.Gourd = Gourd;
    }
    public void changeGear(int g) {
        gear = g;
    }

    public  void speedUp(int inc) {
        speed += inc;
    }

    public void applyBrakes(int dec) {
        speed -= dec;
    }

    public void printStates() {
        System.out.println("speed : " + speed);
        System.out.println("gear : " + gear);
        if (Gourd != null) {
            System.out.println("Gourd : " + Gourd.GourdContent);
        }
    }
    public void changeGourd(Gourd NewGourd) {
        Gourd = NewGourd;
    }

    public void removeGourd() {
        Gourd = null;
    }
    public  void setGourd(Gourd gourd) {
        this.Gourd = gourd ;
    }

    public Gourd getGourd() { return Gourd ; } ;

    public void ride() {
        System.out.println("Riding a bicycle");
    }

    public String toString() {
        return "speed:" + speed + " gear:" + gear + " gourd:" + Gourd.GourdContent;
    }
}
