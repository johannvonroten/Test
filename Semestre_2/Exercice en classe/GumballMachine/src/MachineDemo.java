public class MachineDemo {
    public static void main(String[] args) {

        Machine machine1 = new Machine(100);
        Gumball gumball1 = new Gumball("Green", 5);
        Gumball gumball2 = new Gumball("Red", 5);
        Gumball gumball3 = new Gumball("Blue", 5);

        System.out.println(machine1);
        System.out.println("Vous avez acheté un chewing gum " + gumball1.color + ", " + gumball2.color + ", " + gumball3.color + " pour " + gumball1.price*3 + " centimes");

    }
}
