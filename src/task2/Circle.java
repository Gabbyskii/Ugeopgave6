package task2;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius*2;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }


    public String toString(){
        return "Circle radius: " + radius;
    }

}
