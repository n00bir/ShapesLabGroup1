package arahman7162;

public abstract class Shape{
    private String type;
    public Shape(String type){
        this.type = type;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){

        return "I am a" +type + ".";
    }
}





public class Runner {
    public static void main (String[] args){
        Shape shape1 = new Rectangle();
        Shape shape2 =  new ETriangle ();
        Shape shape3 =  new Circle();
        System.out.println(shape4);
        System.out.println("My Perimeter is: " + shape4.getPerimeter());
        System.out.println("My Area is :") + shape4.getArea();
        Shape[] shapes = { shape1,shape2,shape3};
        for (Shape cur : shapes){
            System.out.println(cur);
            System.out.println("My Perimeter is: " + cur.getPerimeter());
            System.out.println("My Area is :" + cur.getArea());
        }
    }
}

}
