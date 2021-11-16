package decorator;

public class Taxi extends CarDeco {

    public Taxi(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        putTaxiLight();
    }

    private void putTaxiLight() {
        System.out.println("택시 등 설치");
    }
}
