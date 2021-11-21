package factoryMethod.adapt;

public class CarFactory {
    public Car makeCar(String name) {
        /*try {
            Class<?> cls = Class.forName(className);
            return (Car) cls.newInstance();
        } catch (Exception e) {
            return null;
        }*/

        Car car = null;

        switch (name) {
            case "king":
                car = new KingCar();
                break;
            case "queen":
                car = new QueenCar();
                break;
        }

        return car;
    }
}
