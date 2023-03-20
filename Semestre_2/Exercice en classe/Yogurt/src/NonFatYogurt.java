public class NonFatYogurt extends Yogurt{

    public NonFatYogurt(String Taste, Boolean OutOfDate) {
        super(Taste, OutOfDate);
        if (OutOfDate == true) {
            Energy = 10;
        } else {
            Energy = 8;
        }
    }
    public int getEnergy() {
        return Energy;
    }
    public String toString() {
        return "Energy: " + Energy + " Taste: " + Taste + " OutOfDate: " + OutOfDate;
    }
}
