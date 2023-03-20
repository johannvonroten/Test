public class RoadBike extends Bicycle{

    int tireWidth;

    public RoadBike(int startSpeed, int startGear, int startTireWidth, Gourd Gourd) {
        super(startSpeed, startGear, Gourd);
        tireWidth = startTireWidth;

    }

    public int getTireWidth() {
        return tireWidth;
    }
    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    @Override
    public String toString() {
        return "speed:" + speed + " gear:" + gear + " gourd:" + Gourd.GourdContent + " tireWidth:" + tireWidth;
    }
    @Override
    public void ride() {
        System.out.println("Riding a road bike");
    }
}