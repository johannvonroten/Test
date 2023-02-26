public class VoitureDemo {
    public static void main(String argv[]) {
        Voiture un;
        un = new Voiture();
        Voiture deux = new Voiture();
        Voiture trois = new Voiture();

        un.setModel("Laguna");
        deux.setModel("A110");
        trois.setModel("X3");

        System.out.println(un.getModel()+", "+deux.getModel()+" et "+trois.getModel());
    }
}
