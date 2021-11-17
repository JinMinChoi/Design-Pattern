package templateMethod.adapt;

public class Guest {
    public static void main(String[] args) {
        Kimbab vegetableKimbab = new VegetableKimbab();
        Kimbab tunaKimbab = new TunaKimbab();

        System.out.println("****야채 김밥 추가****");
        vegetableKimbab.makeKimbab();

        System.out.println("****참치 김밥 추가****");
        tunaKimbab.makeKimbab();
    }
}
