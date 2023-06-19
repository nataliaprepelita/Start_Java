package L7_Inheritance;

public class TwoDimensionShape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    TwoDimensionShape(){
        width = height = 0.0;
    }

    TwoDimensionShape(double width, double height){
        this.width = width;
        this.height = height;

    }

    void showDim(){
        System.out.println("Width and height: " + width + " & " + height);
    }
}
