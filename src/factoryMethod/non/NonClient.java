package factoryMethod.non;

public class NonClient {
    public static void main(String[] args) {
        FactoryA a = new FactoryA();
        FactoryB b = new FactoryB();

        a.makeCar("king").getName();
        a.makeCar("queen").getName();

        b.makeCar("king").getName();
        b.makeCar("queen").getName();
    }
}
