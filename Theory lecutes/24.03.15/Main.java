class Phone{
    void Display(){
        System.out.println("Phone");
    }
}

class Iphone extends Phone{
    void Display(){
        System.out.println("Iphone");
    }
}

public class Main{
    public static void main(String[] args) {
        Phone p = new Phone();
        p.Display();

        Iphone i = new Iphone();
        //i.Display();
    }   
}

