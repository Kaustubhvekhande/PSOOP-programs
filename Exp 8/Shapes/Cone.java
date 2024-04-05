public class Cone implements  Volume,SurfaceArea {
    double baseRadius;
    double  height;

    public Cone(double r , double h){
        this.baseRadius = r ;
        this.height= h;
    }
    @Override
    public double  getVolume() {
       return 1/3*Math.PI * Math.pow((this.baseRadius),2) * this.height;
    }

    @Override
    public double getSurfaceArea() {
        double l = Math.sqrt(baseRadius*baseRadius+ height*height);
        return Math.PI*baseRadius*(l+baseRadius);
    }

}
