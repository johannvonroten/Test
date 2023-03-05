public class PoupeeDemo {
    public static void main(String[] args) {


        Poupee p1 = new Poupee(0);
        Poupee p2 = new Poupee(1);
        Poupee p3 = new Poupee(2);
        Poupee p4 = new Poupee(3);
        Poupee p5 = new Poupee(4);
        Poupee p6 = new Poupee(5);
        Poupee p7 = new Poupee(6);
        Poupee p8 = new Poupee(7);
        Poupee p9 = new Poupee(8);
        Poupee p10 = new Poupee(9);


        p3.enfermer(p2);
        p10.enfermer(p3);
        p2.enfermer(p3);
        p1.enfermer(p10);

        System.out.println("Peut on mettre la 3ème poupée dans la 2ème ? " + p3.enfermer(p2));
        System.out.println("Peut on mettre la 10ème poupée dans la 3ème ? " + p10.enfermer(p3));
        System.out.println("Peut on mettre la 2ème poupée dans la 3ème ? " + p2.enfermer(p3));
        System.out.println("Peut on mettre la 1ère poupée dans la 10ème ? " + p1.enfermer(p10));

        System.out.println("Ouverture des poupées");
        System.out.println("La poupée 1 est ouverte ? " + p1.open());
        System.out.println("La poupée 2 est ouverte ? " + p2.open());
        System.out.println("La poupée 3 est ouverte ? " + p3.open());
        System.out.println("La poupée 4 est ouverte ? " + p4.open());
        System.out.println("La poupée 5 est ouverte ? " + p5.open());
        System.out.println("La poupée 6 est ouverte ? " + p6.open());
        System.out.println("La poupée 7 est ouverte ? " + p7.open());
        System.out.println("La poupée 8 est ouverte ? " + p8.open());
        System.out.println("La poupée 9 est ouverte ? " + p9.open());
        System.out.println("La poupée 10 est ouverte ? " + p10.open());
        System.out.println();
        System.out.println("Fermeture des poupées");
        System.out.println("La poupée 1 est ouverte ? " + p1.close());
        System.out.println("La poupée 2 est ouverte ? " + p2.close());
        System.out.println("La poupée 3 est ouverte ? " + p3.close());
        System.out.println("La poupée 4 est ouverte ? " + p4.close());
        System.out.println("La poupée 5 est ouverte ? " + p5.close());
        System.out.println("La poupée 6 est ouverte ? " + p6.close());
        System.out.println("La poupée 7 est ouverte ? " + p7.close());
        System.out.println("La poupée 8 est ouverte ? " + p8.close());
        System.out.println("La poupée 9 est ouverte ? " + p9.close());
        System.out.println("La poupée 10 est ouverte ? " + p10.close());

    }

}
