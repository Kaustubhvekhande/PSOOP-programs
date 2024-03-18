class Base{
    Base(){
        System.out.println("I am a constructor");
        
    }
    Base(int a){
        super();
        System.out.println("I am an over loaded constructor with value of a as:"+ a );
        
    
}
}
class Derived extends Base{
    Derived(int a,int b){
        super(a);
        System.out.println("I am a derived class constructor ");
        System.out.println("I am an over loaded constructor with value of b as:"+ b);
        
    }
}
class small extends Derived{
    small(int a,int b,int c){
        
    
    super(a,b);
    System.out.println("I am an over loaded constructor with value of c as:"+ c);
    }
}

public class Main
{
    public static void main(String[] args) {
    //Derived d=new Derived(4,5);
    small s=new small(3,5,7);
    
    
    
    }
}