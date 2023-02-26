public class Circle {

    private int Area, Diameter;

    public Circle(int Area, int Diameter) {
        this.Area = Area;
        this.Diameter = Diameter;
    }

    public int getArea() {
        return Area;
    }

    public int getDiameter() {
        return Diameter;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    public void setDiameter(int Diameter) {
        this.Diameter = Diameter;
    }

    public String toString() {
        return "Circle: " + "Area: " + Area + " Diameter: " + Diameter;
    }
}
