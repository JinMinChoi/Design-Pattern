package factoryMethod.adapt;

public class B {
    public Car makeCar(String name) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.makeCar(name);
        return car;
    }
}
