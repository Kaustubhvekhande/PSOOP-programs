import java.util.*;

public class Line
{
	private double slope;
	private double yInterecept;
	private double x1,y1;
	private double x2,y2;

	public Line(double slope, double yInterecept)
	{
		this.slope = slope;
		this.yInterecept = yInterecept;
		System.out.printf("The equation of line is (Slope-y-intercept) : %.2fx + %.2f \n", slope,yInterecept);
	}



	public Line ( double slope, double x1, double y1)
	{
		this.slope = slope;
		this.x1 = x1;
		this.y1 = y1;
		this.yInterecept= y1-slope*x1;
		System.out.printf("Slope point form : y - %.2f = %.2f(x - %.2f) \n",y1,slope,x1);
	}

	public Line (double x1, double y1, double x2, double y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.slope = (y2-y1) / (x2-x1);
		this.yInterecept = y1-slope*x1;
		System.out.printf("Two point from : (y - %.2f) / (%.2f - %.2f) = %.2f(x - %.2f) / (%.2f - %.2f) \n" , y1, y1 ,y2 , slope , x1 ,x1 ,x2); 
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter slope and y-intercept for line 1:");
		double slope1 = scanner.nextDouble();
		double yIntercept1 = scanner.nextDouble();
		System.out.println("Enter slope, x,y for line 2:");
		double slope2 = scanner.nextDouble();
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		System.out.println("Enter the x1,y2,x2,y2 for line 3:");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();
        
		Line line1 = new Line(slope1, yIntercept1);
        Line line2 = new Line(slope2, x1, y1);
        Line line3 = new Line(x2, y2, x3, y3);

	}

}
