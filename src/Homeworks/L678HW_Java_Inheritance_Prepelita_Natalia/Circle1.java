package Homeworks.L678_Java_Inheritance_Prepelita_Natalia;

public class Circle1 extends TwoDShape1 {
    Circle1(){
        super();
    }
    Circle1(double x){
        super(x, "circle");
    }
    Circle1(Circle1 ob){
        super(ob);
    }

    @Override
    double area() {
        return (getWidth() / 2 * getWidth() / 2 ) * 3.1416;
    }
}
