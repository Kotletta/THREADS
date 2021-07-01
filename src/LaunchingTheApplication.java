import java.util.concurrent.ArrayBlockingQueue;

public class LaunchingTheApplication {
    public static void main(String[] args) throws InterruptedException {
        int capacity = 3;
        final ArrayBlockingQueue<Automobile>
                queue = new ArrayBlockingQueue<Automobile>(capacity);

        DepartureAutomobile departureAuto = new DepartureAutomobile(queue);
        ArrivalAutomobile arrivalAuto = new ArrivalAutomobile(queue);

        departureAuto.start();
        arrivalAuto.start();
    }
}
