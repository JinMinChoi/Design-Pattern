package decorator;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(new BasicCar());
        bus.assemble();

        System.out.println("++++++++++++");
        Taxi taxi = new Taxi(new BasicCar());
        taxi.assemble();
    }
}
