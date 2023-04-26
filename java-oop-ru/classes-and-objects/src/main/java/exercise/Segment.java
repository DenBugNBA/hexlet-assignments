package exercise;

// BEGIN
class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return this.beginPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public Point getMidPoint() {
        int midX = (this.beginPoint.getX() + this.endPoint.getX()) / 2;
        int midY = (this.beginPoint.getY() + this.endPoint.getY()) / 2;

        return  new Point(midX, midY);
    }
}
// END
