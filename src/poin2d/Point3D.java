package poin2d;

public class Point3D extends Point2D{
    private float z;

    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public void setZ(){
        this.z = z;
    }

    public double getZ(){
        return z;
    }

    public void setXYZ(float x, float y, float z){
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = this.z;
        return arr;
    }
    @Override
    public String toString() {
        String result = "";
        for (float i: getXYZ()
        ) {
            result = result + i +"\t";
        }
        return "Point3D{" +
                "x = " + getX() +
                ", y = " + getY() +
                ", z = " + z +
                ", mang 3d: " + result +
                '}';
    }
}
