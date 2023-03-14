package ss7.resizeable;

public class Square extends Shape {
    public double width = 1;

    public Square() {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSquareArea() {
        return this.width * this.width;

    }

    @Override
    public void resize(double percent) {
        double width = this.width * percent / 100 + this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", color='" + color + '\'' +
                ", filter=" + filter +
                ", Area = " + getSquareArea() +
                '}';
    }
}
