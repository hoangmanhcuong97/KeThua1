package Point;

public class Point1 {
    private float x;
    private  float y;

    public Point1(){}
    public Point1(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
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
    public float[] getSpeed(){

        float arr[] = new float[2];
        arr[0]= x;
        arr[1]= y;
        return arr;
    }

    @Override
    public String toString() {
        String a = "";
        for (float i: getSpeed()) {
            a = a + i +", ";
        }
        return "Point1{" +
                "x=" + x +
                ", y=" + y +
                ", mang = " + a +
                '}';
    }
}
