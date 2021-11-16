package decorator;

public class CarDeco implements Car {
    private Car car;

    public CarDeco(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
