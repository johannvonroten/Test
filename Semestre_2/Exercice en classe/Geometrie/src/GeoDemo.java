public class GeoDemo {
    public static void main(String[] args) {
        Square square = new Square(10, 10);
        Circle circle = new Circle(10, 10);
        Rectangle rectangle = new Rectangle(10, 10);

        System.out.println(square.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}
