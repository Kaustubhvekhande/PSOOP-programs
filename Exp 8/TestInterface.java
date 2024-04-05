// /**
//  * interface
//  */
// interface Printable {

//     void print();
// }

// interface Showable{
//     void show();

// }

// class TestInterface implements Showable{
//     public void print (){
//         System.out.println("hello");       
//     }
//     public void show (){
//         System.out.println("Welcome");       
//     }
//     public static void main(String[] args) {
//         TestInterface t = new TestInterface();
//         t.print();
//         t.show();
//     }
// }




interface Drawable {
    void draw();
    static int cube (int x){
        return x*x*x;
    }
}

class Rectangle implements Drawable{
    public void  draw() {
        System.out.println("drawing a rectangle");
    }
}

class TestInterface {
    public static void main(String[] args) {
        Drawable d = new Rectangle();

        d.draw();
        System.out.println(Drawable.cube(3));
    }
}