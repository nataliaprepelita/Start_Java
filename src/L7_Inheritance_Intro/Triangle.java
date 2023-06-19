package L7_Inheritance;

public class Triangle extends TwoDimensionShape{

   private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    Triangle(){
        super();
        style = "None";
    }
    Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    double area(){
        return getWidth()*getHeight()/2;
    }

    void showStyle(){
        System.out.println("The triangle is " + style);
    }
}
