public class BifidusYogurt extends Yogurt{

    public BifidusYogurt(String Taste, Boolean OutOfDate) {
        super(Taste, OutOfDate);
        if (OutOfDate == true) {
            Energy = 30;
        } else {
            Energy = 10;
        }
    }
    public int getEnergy() {
        return Energy;
    }
    public String toString() {
        return "Energy: " + Energy + " Taste: " + Taste + " OutOfDate: " + OutOfDate;
    }

}
