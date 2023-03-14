package ss7.colorable;

public class RectangleColor extends ShapeColor {
    public double width = 1;
    public double height = 1;

    public RectangleColor() {
    }


    public RectangleColor(double width, double height) {
        this.width = width;
        this.height = height;
    }

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

    public double getRectangleArea(double width, double height) {
        return width * height;
    }

    public double getRectanglePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void resize(double percent) {
        height = height + height * percent / 100;
        width = width + width * percent / 100;

    }


}
