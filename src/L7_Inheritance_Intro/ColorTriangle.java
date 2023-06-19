package L7_Inheritance;

public class ColorTriangle extends Triangle {

    private String color;

    ColorTriangle(String color, String style, double width, double height){
        super(width, height, style);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    void showColor(){
        System.out.println("The color is " + color);
    }


}
