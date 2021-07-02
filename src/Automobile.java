public class Automobile extends Thread {
    private String nameAuto;
    private int valueAuto;

    Automobile() {
        this.nameAuto = "Номер авто";
        this.valueAuto = +1000 + (int) (Math.random() * 7000);
    }

    @Override
    public synchronized String toString() {
        return nameAuto + " " + String.valueOf(valueAuto);
    }
}
