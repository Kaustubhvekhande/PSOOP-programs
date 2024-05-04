import java.lang.*;

public class Test {
    private double base;
    private int power;
    private int logbase;
    private int argument;

    // Constructor for the test object. Initializes all variables to 0 or null
    public Test(){
        this.base = 2;
        this.power = 2;
        this.logbase = 2;
        this.arguments = 2;
    }

    public double calculate(double base , int power){
        return Math.pow(base,power);
    }
    public double calculate(int logbase, int argument){
        return Math.log(argument) / Math.log(logbase);
    }

    public static void main(String[] args) {
        Test t = new Test();
        
    }
}

