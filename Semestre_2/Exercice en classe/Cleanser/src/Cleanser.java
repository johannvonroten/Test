public class Cleanser {
   String dilute, apply, scrub;

    public Cleanser (String dilute, String apply, String scrub) {
         this.dilute = dilute;
         this.apply = apply;
         this.scrub = scrub;
    }
    public void dilute() {
        System.out.println("Dilute with water");
    }
    public void apply() {
        System.out.println("Apply to surface");
    }
    public void scrub() {
        System.out.println("Scrub the surface");
    }
}
