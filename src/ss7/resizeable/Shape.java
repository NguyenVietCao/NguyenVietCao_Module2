package ss7.resizeable;

public abstract class Shape implements Resize {
    public String color = "green";
    public boolean filter = true;

    @Override
    public String toString() {
        return "Color= " + color + "filter =" + filter;
    }

}
