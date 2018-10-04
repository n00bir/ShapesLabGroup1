package arahman7162;


public class ETriangle {
    //////Fields//////
    private int side;

    //////Constructors//////
    public ETriangle(int side) {
        this.side = side;
    }

    //////Methods//////
    public double getArea() {
        return ((side * side) * (Math.sqrt(3) / 4));
    }

    public double getPerimeter() {
        return (side * 3);
    }
}