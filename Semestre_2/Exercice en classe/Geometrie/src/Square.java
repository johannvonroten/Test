public class Square {
    private int Area, Diameter;

    public Square(int Area, int Diameter) {
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
        return "Square: " + "Area: " + Area + " Diameter: " + Diameter;
    }
}
