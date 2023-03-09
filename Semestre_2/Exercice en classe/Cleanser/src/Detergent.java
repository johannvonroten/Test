public class Detergent extends Cleanser {
    String foam, scrub;

    public Detergent (String dilute, String apply, String scrub, String foam) {
        super(dilute, apply, scrub);
        this.foam = foam;
        this.scrub = scrub;
    }

    public void foam() {
        System.out.println("Foam the surface");
    }
    public void scrub() {
        System.out.println("Scrub the surface");
    }
}
