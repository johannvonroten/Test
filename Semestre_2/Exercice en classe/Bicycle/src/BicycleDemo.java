public class BicycleDemo {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle(1, 10);
        Gourde gourde1 = new Gourde("Lait");

        Tandem tandem1 = new Tandem(2,15);
        Gourde gourde2 = new Gourde("Eau");
        Gourde gourde3 = new Gourde ("RedBull");


        System.out.println("La bicyclette est à la vitesse " + bicycle1.gear + " a une vitesse de " + bicycle1.speed + " km/h" + " et une gourde de " + gourde1.gourde);
        System.out.println("Le tandem est à la vitesse " + tandem1.gear + " et va à " + tandem1.speed + "km/h, la première gourde contient de l'" + gourde2.gourde + " et la seconde contient du " + gourde3.gourde);
    }
}
