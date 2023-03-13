import java.util.List;

public class CityDemo {
    public static void main(String[] args) {

    House house1 = new House(1, 1, "House1");
    House house2 = new House(2, 2, "House2");
    List<House> houses = List.of(house1, house2);
    Street street1 = new Street("Street1", houses);

    House house3 = new House(1, 3, "House3");
    List<House> houses2 = List.of(house3);
    Street street2 = new Street("Street2", houses2);

    House house4 = new House(1, 4, "House4");
    House house5 = new House(2, 5, "House5");
    House house6 = new House(3, 6, "House6");
    List<House> houses3 = List.of(house4, house5, house6);
    Street street3 = new Street("Street3", houses3);

    City city = new City("City", List.of(street1, street2, street3));

    }
}
