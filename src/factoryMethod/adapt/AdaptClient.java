package factoryMethod.adapt;

public class AdaptClient {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.makeCar("king").getName();
        a.makeCar("queen").getName();

        b.makeCar("king").getName();
        b.makeCar("queen").getName();
    }
}
