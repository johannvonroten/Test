public class BicycleDemo {
    public static void main(String[] args) {

        Gourd water = new Gourd("water") ;
        Gourd milk = new Gourd("milk") ;

        Bicycle bike1 = new Bicycle(0,0, water); // creates Bicycle
        Bicycle bike2 = new Bicycle(0,0, null);
        Tandem tandem = new Tandem(0,0, null,null);
        MountainBike mb = new MountainBike(0,0,0, null);
        RoadBike rb = new RoadBike(0,0,0, null);


        tandem.speedUp(10);      // invokes method on objects
        tandem.changeGear(2);
        tandem.speedUp(20);//// speed:10 gear:2 gourd:water
        tandem.ride();
        mb.ride();


        tandem.printStates();// speed:20 gear:3 gourd:milk

        Bicycle [] garage = new Bicycle[3] ;
        garage[0] = new MountainBike(2,4,0, null) ;
        garage[1] = new RoadBike(6,0,2, null) ;
        garage[2] = new Tandem(4,0, null, null) ;
// I use all my bicycle
        for (Bicycle b : garage) // this is the program
            b.ride() ; // this is a difficult algorithm






    }
}
