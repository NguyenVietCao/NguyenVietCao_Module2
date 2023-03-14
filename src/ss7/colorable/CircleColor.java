package ss7.colorable;

public class CircleColor extends ShapeColor {
    public double radius = 1;

    public CircleColor() {
    }


    public CircleColor(double radius) {
        this.radius = radius;
    }

    public CircleColor(String color, boolean filter, double radius) {
        super(color, filter);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "CircleColor{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filter=" + filter +
                '}';
    }

    @Override
    public void resize(double percent) {
        radius = radius + radius * percent / 100;
    }
}
