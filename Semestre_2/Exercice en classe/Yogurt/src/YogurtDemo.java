public class YogurtDemo {
    public static void main(String[] args) {
        Yogurt[] yogurts = new Yogurt[6];

        Yogurt yogurt1 = new Yogurt("Banane", false);
        Yogurt yogurt2 = new Yogurt("Fraise", true);
        BifidusYogurt by1 = new BifidusYogurt("Pomme", false);
        BifidusYogurt by2 = new BifidusYogurt("Chocolat", true);
        NonFatYogurt nfy1 = new NonFatYogurt( "Vanille", false);
        NonFatYogurt nfy2 = new NonFatYogurt( "Cerise", true);

        yogurts[0] = yogurt1;
        yogurts[1] = yogurt2;
        yogurts[2] = by1;
        yogurts[3] = by2;
        yogurts[4] = nfy1;
        yogurts[5] = nfy2;

        for (Yogurt yogurt : yogurts) {
            System.out.println(yogurt);
        }




    }
}
