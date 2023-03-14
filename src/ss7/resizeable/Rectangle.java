package ss7.resizeable;

public class Rectangle extends Shape{
    public double width ;
    public double height ;

    public Rectangle() {
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
    public double getRectangleArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        double height = this.height * percent / 100 + this.height;
        double width = this.width * percent / 100 + this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", filter=" + filter +
                ", Dien tich = " + getRectangleArea()+
                '}';
    }
}
