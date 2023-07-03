package Homeworks.L678_Java_Inheritance_Prepelita_Natalia;

public class TwoDShape1 {
    private double width;
    private double height;
    private String name;

    TwoDShape1() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape1(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape1(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape1(TwoDShape1 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }
    void setWidth(double w) { width = w;}
    double getHeight() { return height; }
    public void setHeight(double h) { height = h;}
    String getName() {return name;}

    void showDim() {
        System.out.println("Width and height: " + width + " and " + height);
    }
    double area(){
        System.out.println("The area() method must be overridden.");
        return 0.0;
    }

}
