public class Bicycle {
    public static void main(String[] args) {

    }
    int speed = 0; // vitesse en km/h
    int gear = 1; // plateau
    void changeGear ( int newValue){
        gear = newValue;
    }
    void speedUp ( int increment){
        speed = speed + increment;
    }
    void applyBrakes ( int decrement){
        speed = speed - decrement;
    }
    void printStates () {
        System.out.println("speed:" + speed + " gear:" + gear);
    }
}
