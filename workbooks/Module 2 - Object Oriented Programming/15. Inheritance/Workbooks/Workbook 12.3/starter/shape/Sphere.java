package shape;

public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        double radius = getRadius();
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        double radius = getRadius();
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

}