package ss7.colorable;

public abstract class ShapeColor implements IColorable {
    public String color = "Green";
    public boolean filter = true;

    public ShapeColor() {
    }

    public ShapeColor(String color, boolean filter) {
        this.color = color;
        this.filter = filter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilter() {
        return filter;
    }

    @Override
    public void howToColor() {

    }

    @Override
    public String toString() {
        return "ShapeColor{" +
                "color='" + color + '\'' +
                ", filter=" + filter +
                '}';
    }

    public abstract void resize(double percent);
}

