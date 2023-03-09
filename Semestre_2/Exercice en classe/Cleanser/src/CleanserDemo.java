public class CleanserDemo {
    public static void main(String[] args) {
        Detergent detergent = new Detergent("Dilute with water", "Apply to surface", "Scrub the surface", "Foam the surface");
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
    }
}
