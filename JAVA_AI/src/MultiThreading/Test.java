
package MultiThreading;

public class Test {
    public static void main(String[] args) {

        World obj1 = new World();
        World1 obj2 = new World1();

        Thread t1 = new Thread(obj2);

        obj1.start();
        t1.start();

        for (;;) {
            System.out.println("Hello");
        }
    }
}
