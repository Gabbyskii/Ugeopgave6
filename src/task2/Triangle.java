package task2;

public class Triangle implements Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getArea() {
        return 0.5 * a * b; //forkert: 0.5 * a * b * c;
    }

    @Override
    public double getPerimeter() {
        return  a + b + c;
    }

    public String toString(){
        return "Triangle: " + "a: "+ a +", b: "+ b +", c: " +c;
    }




}
