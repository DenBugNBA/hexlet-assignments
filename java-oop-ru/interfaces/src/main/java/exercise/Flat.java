package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public void setBalconyArea(double balconyArea) {
        this.balconyArea = balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return this.area + this.getBalconyArea();
    }

    public String toString() {
        return "Квартира площадью " +
                this.getArea() +
                " метров на " +
                this.getFloor()
                + " этаже";
    }

    @Override
    public int compareTo(Home another) {
        double currentArea = this.getArea();
        double anotherArea = another.getArea();

        if (currentArea > anotherArea) {
            return 1;
        } else if (currentArea < anotherArea) {
            return -1;
        } else {
            return 0;
        }
    }
}
// END
