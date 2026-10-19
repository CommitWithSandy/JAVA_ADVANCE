
package MultiThreading;

public class World1 implements Runnable {

    @Override
    public void run() {
        for (;;) {
            System.out.println("World 1");
        }
    }
}
