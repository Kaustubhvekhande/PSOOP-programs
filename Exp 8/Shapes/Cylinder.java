interface Volume{
    public double getVolume();
    
}
interface SurfaceArea{
    public double getSurfaceArea();

}
public class Cylinder implements  Volume,SurfaceArea {
    double baseRadius;
    double  height;

    public Cylinder(double r , double h){
        this.baseRadius = r ;
        this.height= h;
    }
    @Override
    public double  getVolume() {
       return Math.PI * Math.pow((this.baseRadius),2) * this.height;
    }

    @Override
    public double getSurfaceArea() {
        return 2*Math.PI*this.baseRadius* (this.height + this.baseRadius);
    }

}
