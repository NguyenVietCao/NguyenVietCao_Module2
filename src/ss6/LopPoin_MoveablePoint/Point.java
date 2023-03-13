package ss6.LopPoin_MoveablePoint;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y ){
        this.x = x;
        this.y = y;
    }
    public  float[] getXY(){
        float [] array = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }
}
