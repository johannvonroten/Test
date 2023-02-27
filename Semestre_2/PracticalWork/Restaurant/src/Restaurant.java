import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice = 0;
        Table[] tables = new Table[10];

        Table table1 = new Table(1, false);
        Table table2 = new Table(2, false);
        Table table3 = new Table(3, true);
        Table table4 = new Table(4, true);
        Table table5 = new Table(5, true);
        Table table6 = new Table(6, false);
        Table table7 = new Table(7, true);
        Table table8 = new Table(8, true);
        Table table9 = new Table(9, false);
        Table table10 = new Table(10, true);

        tables[0] = table1;
        tables[1] = table2;
        tables[2] = table3;
        tables[3] = table4;
        tables[4] = table5;
        tables[5] = table6;
        tables[6] = table7;
        tables[7] = table8;
        tables[8] = table9;
        tables[9] = table10;

        while (choice != 4) {

            System.out.println("Bienvenue au restaurant ! " + "1 = s'asseoir, " + "2 = partir, " + "3 = afficher, " + "4 = quitter");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < tables.length; i++) {
                        if (tables[i].isFree == true) {
                            tables[i].isFree = false;
                            System.out.println("Vous êtes assis à la table " + tables[i].number);
                            break;
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("A quel table êtes vous assis(e)?");
                    int tableNumber = scan.nextInt();
                    tables[tableNumber - 1].isFree = true;
                    if (tables[tableNumber - 1].isFree == true)
                        System.out.println("La table " + tables[tableNumber - 1].number + " est déjà libre");
                    else
                    System.out.println("Vous avez quitté la table " + tables[tableNumber - 1].number);
                    System.out.println();
                    break;
                case 3:
                    for (int i = 0; i < tables.length; i++) {
                        if (tables[i].isFree == true) {
                            System.out.println("La table " + tables[i].number + " est libre");
                        }  else {
                            System.out.println("La table " + tables[i].number + " est occupée");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Au revoir!");
                    break;
            }
        }
    }
}
