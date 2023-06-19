package L7_Inheritance;

public class ShapesDemo {
    public static void main(String[] args) {
        TwoDimensionShape twoDshape = new TwoDimensionShape(23,45);
        Triangle triangle1 = new Triangle(2,3,"transparent");
        Triangle triangle2 = new Triangle(3,7,"colored");
        Rectangle r1 = new Rectangle(20,30);
        ColorTriangle ct1 = new ColorTriangle("red", "big", 12, 156);

        System.out.println("Info about triangle1: ");
        triangle1.showStyle();
        triangle1.showDim();
        System.out.println("Area of triangle1: " + triangle1.area());

        System.out.println("Info about triangle2: ");
        triangle2.showStyle();
        triangle2.showDim();
        System.out.println("Area of triangle2: " + triangle2.area());

        System.out.println("Info about r1: ");
        r1.showDim();
        System.out.println("Area of r1: " + r1.area());
        System.out.println("Is square:  " + r1.isSquare());


        Triangle t3 = new Triangle();
        System.out.println(t3.getStyle().toUpperCase());

        System.out.println("Info about ct1: ");
        ct1.showDim();
        System.out.println("Area of ct1: " + ct1.area());
        ct1.showColor();

    }
}
