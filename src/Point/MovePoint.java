package Point;

public class MovePoint extends Point1{
    private float xSpeed;
    private float ySpeed;

    public MovePoint(){}
    public MovePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed =  xSpeed;
        this.ySpeed =  ySpeed;
    }
    public float[] getSpeed(){
        float arr[] = new float[2];
        arr[0]= xSpeed;
        arr[1]= ySpeed;
        return arr;
    }


    @Override
    public String toString() {
        String b = "";
        for (float i: getSpeed()) {
            b += i + ", ";
        }
        return "MovePoint{" +
                "xSpeed=" + getXSpeed() +
                ", ySpeed=" + getYSpeed() +
                ", mang = " +
                '}';
    }
}
