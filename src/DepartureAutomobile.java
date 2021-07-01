import java.util.concurrent.ArrayBlockingQueue;

public class DepartureAutomobile extends Thread {
    private ArrayBlockingQueue<Automobile> arrayBlockingQueue;

    DepartureAutomobile(ArrayBlockingQueue<Automobile> blockArray) {
        this.arrayBlockingQueue = blockArray;
    }
    @Override
    public void run () {
        for (int i = 1; i < 99; i++) {
            try {
                sleep(4123);
                System.out.println(arrayBlockingQueue.take() + " уехал с парковки");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Парковочные места " + arrayBlockingQueue);
    }
}
