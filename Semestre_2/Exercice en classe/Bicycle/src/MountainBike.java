public class MountainBike extends Bicycle{

    int seatHeight;

    public MountainBike(int startSpeed, int startGear, int startHeight, Gourd Gourd) {
        super(startSpeed, startGear, Gourd);
        seatHeight = startHeight;

    }

    public int getSeatHeight() {
        return seatHeight;
    }
    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return "speed:" + speed + " gear:" + gear + " gourd:" + Gourd.GourdContent + " seatHeight:" + seatHeight;
    }
    @Override
    public void ride() {
        System.out.println("Riding a mountain bike");
    }
}
