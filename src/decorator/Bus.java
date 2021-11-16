package decorator;

public class Bus extends CarDeco {

    public Bus(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        expand();
    }

    private void expand() {
        System.out.println("크기 확장");
    }
}
