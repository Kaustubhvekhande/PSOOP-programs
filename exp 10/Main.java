import java.lang.*;

class Even extends Thread {
    public void run() {

        try {
            for (int i = 2; i <= 50; i += 2) {

                System.out.println("\tEven thread " + i);
                sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}

class Odd extends Thread {
    public void run() {

        try {
            for (int i = 1; i <= 50; i += 2) {

                System.out.println("\tOdd thread " + i);
                sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}

public class Main {
    public static void main(String[] args) {
        new Odd().start();
        new Even().start();
    }
}