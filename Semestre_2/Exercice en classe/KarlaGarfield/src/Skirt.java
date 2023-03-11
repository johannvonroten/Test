public class Skirt extends Clothes {
    int size, taxe;

    public Skirt (String collection, int sell, int taxe, int size) {
        super(collection, sell);
        this.size = size;
        this.taxe = sell+(sell*taxe/10);
        this.sell = sell+taxe;
    }
}

