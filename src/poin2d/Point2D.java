package poin2d;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){}
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = new float[2];
            arr[0] = x;
            arr[1] = y;
        return arr;
    }


    public String toString() {

        String result=" ";
        for (float i: getXY()
             ) {
            result = result + i +"\t";
        }
        return  "Point2D{" +
                "x = " + x +
                ", y = " + y +
                ", mang 2d: " + result +
                '}';
    }
}
