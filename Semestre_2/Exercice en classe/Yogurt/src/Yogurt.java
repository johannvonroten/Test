public class Yogurt {
    protected int Energy;
    protected String Taste;
    protected Boolean OutOfDate;

    public Yogurt(String Taste, Boolean OutOfDate) {
        this.Taste = Taste;
        this.OutOfDate = OutOfDate;

        if (OutOfDate == true) {
            Energy = 20;
        } else {
            Energy = 15;
        }
    }
   public int getEnergy() {
        return Energy;
    }
    public String toString() {
        return "Energy: " + Energy + " Taste: " + Taste + " OutOfDate: " + OutOfDate;
    }
}
