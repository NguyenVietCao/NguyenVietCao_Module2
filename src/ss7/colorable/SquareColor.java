package ss7.colorable;

public class SquareColor extends ShapeColor {
    public double width = 1;

    public SquareColor() {
    }


    public SquareColor(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSquareArea() {
        return width * width;
    }

    public double getSquarePerimeter() {
        return width * 4;
    }

    @Override
    public void resize(double percent) {
        width = width + width * percent / 100;
    }


}
