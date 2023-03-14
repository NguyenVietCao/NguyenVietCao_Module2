package ss6.poin2D_poin3D;

public class Point3D extends Point2D {
    protected float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array3d = new float[3];
        array3d[0] = this.x;
        array3d[1] = this.y;
        array3d[2] = this.z;
        return array3d;
    }

    @Override
    public String toString() {
        return "point3D{" +
                " x=" + x +
                ", y=" + y +
                " , z=" + z +
                '}';
    }
}
