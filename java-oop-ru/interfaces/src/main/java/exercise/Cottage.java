package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;
    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public String toString() {
        return this.getFloorCount() +
                " этажный коттедж площадью " +
                this.getArea() +
                " метров";
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
