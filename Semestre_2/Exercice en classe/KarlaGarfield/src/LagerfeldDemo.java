public class LagerfeldDemo {
    public static void main(String[] args) {

        Shoes casual = new Shoes(41);
        Sweater comfortable = new Sweater("Winter", 3500, "L",  true);
        Trousers classic = new Trousers("Winter", 28000, 3, 34);

        Man brad = new Man("Brad", 27, casual, comfortable, classic);

        Shoes high = new Shoes(36);
        Sweater sexy = new Sweater("Summer", 42000, "S",  false);
        Skirt mini = new Skirt("Summer", 32000, 3, 32);

        Woman woman = new Woman("Jane", 23, mini, sexy, high);

        System.out.println(sexy.sell);
        System.out.println(comfortable.sell);
        System.out.println(mini.sell);

        Shoes higher = new Shoes(43);
        Trousers shorter = new Trousers("Summer", 17000, 35, 34);
        Sweater sexier = new Sweater("Summer", 12000, "XL",  true);

        Man charly = new Man ("Charly", 71, higher, sexier, shorter);
    }
}
