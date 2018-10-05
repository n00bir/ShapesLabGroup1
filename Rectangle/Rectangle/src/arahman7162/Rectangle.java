package arahman7162;

public class Rectangle extends Shape {
    //////Fields//////
    private int height ;
    private int width ;
    public Rectangle(int height,int width) {

        //////Constructors//////
        super("Rectangle");
        this.height = height;
        this.width = width;
    }
         //////Methods//////
        public double getArea(){
            return (height) * (width) ;
        }

        public double getPerimeter(){
            return (height) + (width) ;
        }




}
