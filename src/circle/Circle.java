package circle;

public class Circle {
    private double radius = 1.0;
    private String color = "black";
    public static final int PI = 3;

    public Circle(){}
    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius * this.radius * PI;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", color = " + color +
                ", Area circle = "+ getArea() +
                '}';
    }
}
