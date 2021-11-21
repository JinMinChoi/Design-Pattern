package factoryMethod.non;

public class FactoryA {
    public Car makeCar(String carName){
        Car car = null;

        switch (carName) {
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