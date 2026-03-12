package task2;

import java.util.ArrayList;

public class PaintJob {

    protected String name;
    private ArrayList<Shape> surfaces;
    private ArrayList<Shape> deductions;

    public PaintJob(String name) {
        this.name = name;
        this.surfaces = new ArrayList<>();
        this.deductions = new ArrayList<>();
    }


    public void addSurface(Shape s){
        surfaces.add(s);
    }

    public void addDeduction(Shape s){
        deductions.add(s);
    }

    public double getTotalSurface(){
        double totalSurface = 0;
        for (Shape s: surfaces) {
            totalSurface += s.getArea();
        }
        return totalSurface;
    }
    public double getTotalDeductions(){
        double totalDeduction = 0;
        for (Shape s: deductions) {
            totalDeduction += s.getArea();
        }
        return totalDeduction;
    }

    public double getPaintableArea(){
        double roundingNum = getTotalSurface() - getTotalDeductions();
        return Math.round(roundingNum);
    }

    public void printSummary(){
        System.out.println("=== Malerberegner: " + name + " ===");
        System.out.println("Skal males i alt: " + getPaintableArea() + " m²");
    }


    @Override
    public String toString() {
        return  name + " surfaces=" + surfaces +
                ", deductions=" + deductions;
    }

}
