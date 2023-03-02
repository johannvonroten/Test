public class BicycleDemo {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle(1, 10);
        Gourde gourde1 = new Gourde("Lait");

        System.out.println("La bicyclette est à la vitesse " + bicycle1.gear + " a une vitesse de " + bicycle1.speed + " km/h" + " et une gourde de " + gourde1.gourde);

    }
}
