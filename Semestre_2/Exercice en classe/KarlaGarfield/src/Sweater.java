public class Sweater extends Clothes {
    String size;
    boolean turtleneck;

    public Sweater (String collection, int sell, String size, boolean turtleneck) {
        super(collection, sell);
        this.size = size;
        this.turtleneck = turtleneck;
    }

}
