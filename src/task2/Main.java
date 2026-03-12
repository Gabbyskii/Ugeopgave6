package task2;

public class Main {
    void main(){
        PaintJob pj = new PaintJob("Room");

        pj.addSurface(new Rectangle(5, 10));
        pj.addSurface(new Rectangle(15, 10));
        pj.addSurface(new Rectangle(10, 20));

        pj.addDeduction(new Circle(15));
        pj.addDeduction(new Circle(20));

        pj.printSummary();

    }

}
