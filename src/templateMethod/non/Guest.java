package templateMethod.non;

public class Guest {
    public static void main(String[] args) {
        NonVegetableKimbab nonVegetableKimbab = new NonVegetableKimbab();
        NonTunaKimbab nonTunaKimbab = new NonTunaKimbab();

        System.out.println("****야채 김밥 추가****");
        nonVegetableKimbab.makeVagetableKimbab();
        System.out.println("****참치 김밥 추가****");
        nonTunaKimbab.makeTunaKimbab();
    }
}