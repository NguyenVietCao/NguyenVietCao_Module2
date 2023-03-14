package ss7.resizeable;

public class Circle extends Shape {
    public double radius = 1;

    public Circle() {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Diện tích hình tròn
    public double getCircleArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }


    @Override
    public void resize(double percent) {
        this.radius = percent / 100 * this.radius + this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filter=" + filter +
                ", area = " + getCircleArea() +
                '}';
    }
}
