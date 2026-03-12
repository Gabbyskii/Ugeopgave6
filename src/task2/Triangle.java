package task2;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getArea() {
        System.out.println("Triangle!");
        return 0; //forkert: 0.5 * a * b * c;
    }

    @Override
    public double getPerimeter() {
        return  a + b + c;
    }

    public String toString(){
        return "Triangle: " + "a: "+ a +", b: "+ b +", c: " +c;
    }




}
