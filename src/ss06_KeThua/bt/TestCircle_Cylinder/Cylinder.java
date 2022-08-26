package ss06_KeThua.bt.TestCircle_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return super.area() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder:\n" +
                "height=" + height + ", radius=" + super.getRadius() +
                ", color=" + super.getColor();
    }
}
