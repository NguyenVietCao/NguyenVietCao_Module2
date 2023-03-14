package ss6.lopCircle_lopCylinder;

public class Cylinder extends Circle {

    public double height = 2;

    public Cylinder() {
    }

    public double getVolume() {
        return this.getAcreage() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
