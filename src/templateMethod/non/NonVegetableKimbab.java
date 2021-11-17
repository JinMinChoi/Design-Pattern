package templateMethod.non;

public class NonVegetableKimbab {
    public void makeVagetableKimbab() {
        addKim();
        addRice();
        addVegetable();
    }

    private void addVegetable() {
        System.out.println("야채 추가");
    }

    private void addRice() {
        System.out.println("밥 추가");
    }

    private void addKim() {
        System.out.println("김 추가");
    }
}
