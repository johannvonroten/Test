import java.util.Random;

public class AnimalDemo {
    public static void main(String[] args) {

        Animal[] animals = new Animal[10];
        for (int i = 0; i < animals.length; i++) {
            Random random = new Random();
            int randomInt = random.nextInt(2);
            if (randomInt == 0) {
                animals[i] = new Chat();
            } else {
                animals[i] = new Chien();
            }
        }
        for (Animal animal : animals) {
            animal.shout();
        }
    }
}
