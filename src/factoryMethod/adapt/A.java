package factoryMethod.adapt;

public class A {
    public Car makeCar(String name) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.makeCar(name);
        return car;
    }
}
