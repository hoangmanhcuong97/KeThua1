package circle;

public class Cylinder extends Circle{
    private double height = 2.0;

    public Cylinder(){}
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + getRadius() +
                ", color = " + getColor() +
                ", Volume circle = "+ getVolume() +
                '}';
    }
}
