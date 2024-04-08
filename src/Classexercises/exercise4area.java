package Classexercises;

public class exercise4area {
    public exercise4area(int l){
        System.out.println("Area of a square");
        System.out.println(l*l);
    }
    public exercise4area(int l, int b){
        System.out.println("Area of a rectangle");
        System.out.println(l*b);
    }
    public exercise4area(double b, int h){
        System.out.println("Area of triangle");
        System.out.println((0.5)*b*h);
    }

    public exercise4area(double r){
        System.out.println("Area of a cirle");
        System.out.println((22/7)*r*r);
    }
}
