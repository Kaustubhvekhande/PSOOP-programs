public class Shape{
	private String color;
	
	
	Shape(){
		this.color= "White";
	}
	
	Shape(String color){
		this.color= color;
	}
	
}


class Rectangle extends Shape{
	private double length, breadth;
	
	
	Rectangle(){
		super();
		this.length=1;
		this.breadth=1;
	}
	
	Rectangle(double length, double breadth, String c){
		super(c);
		this.length=length;
		this.breadth=breadth;
	}
	
	public void setlength(double length){
		this.length=length;
	}
	
	public double getLength(){
		return length;
	}
	
	public void setbreadth(double breadth){
		this.breadth=breadth;
	}
	
	public double getBreadth(){
		return breadth;
	}
	
	
	public void Display(){
		System.out.println("Details of rectangle are: ");
		System.out.println("Length: "+ length);
		System.out.println("breadth: "+ breadth);
	}
	
	public double getArea(){
		return length*breadth;
	}
}

class Box extends Rectangle{
	private double height;
	
	Box(){
		super();
		this.height=1;
	}
	
	Box(double l, double b,double h, String c){
		super(l,b,c);
		this.height=h;
	}
	
	public void setheight(double height){
		this.height=height;
	}
	
	public double getHeight(){
		return height;
	}
	
	
	
	@Override
	public void Display(){
		System.out.println("Details of box are: ");
		System.out.println("Length: "+ super.getLength());
		System.out.println("breadth: "+ super.getBreadth());
		System.out.println("Height: "+ height);
	}
	
	public double getVolume(){
		return getArea()*height;
	}
}


