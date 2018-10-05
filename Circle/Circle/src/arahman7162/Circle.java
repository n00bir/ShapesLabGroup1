package arahman7162;


public class Circle extends Shape {
    //////Fields//////
    private int radius ;

    //////Constructors//////
    public Circle(int radius) {

        super("Circle");
        this.radius = radius;
    }
    //////Methods//////
        public double getArea(){
            return 3.14151926535897932384626433832795029 * radius *radius;
        }

        public double getPerimeter(){
            return 3.14151926535897932384626433832795029 * radius * 2;
        }
    }



}
