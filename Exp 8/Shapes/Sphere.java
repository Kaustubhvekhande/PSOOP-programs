public class Sphere implements Volume, SurfaceArea {
    double Radius;

    public Sphere(double r) {
        this.Radius = r;
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow((Radius), 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow((Radius), 2);
    }
}
