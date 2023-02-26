public class Rectangle {
    private int Area, Diameter;

    public Rectangle(int Area, int Diameter) {
        this.Area = Area;
        this.Diameter = Diameter;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    public int getDiameter() {
        return Diameter;
    }

    public void setDiameter(int Diameter) {
        this.Diameter = Diameter;
    }

    public String toString() {
        return "Rectangle: " + "Area: " + Area + " Diameter: " + Diameter;
    }
}
