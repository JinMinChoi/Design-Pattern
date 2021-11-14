package singleton;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton3 singleton3 = Singleton3.getInstance();
            System.out.println(singleton3.toString());
        }
    }
}
