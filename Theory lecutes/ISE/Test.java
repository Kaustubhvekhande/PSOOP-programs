class A{
    int x =10;
}

class B extends A{
    int x = 20;
}

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
    }
}