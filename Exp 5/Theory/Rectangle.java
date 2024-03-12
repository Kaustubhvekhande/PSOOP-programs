
class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double len, double wid) {
        setLength(len);
        setWidth(wid);
    }
  
    // Accessor methods
    public void setLength(double len) {
        if (len <= 0) {
            throw new IllegalArgumentException("Length must be greater than zero.");
        }
        length = len;
    }
  
    public void setWidth(double wid) {
        if (wid <= 0) {
            throw new IllegalArgumentException("Width must be greater than zero.");
        }
        width = wid;
    }
  
    public double getArea() {
        return length * width;
    }
  
   
}
