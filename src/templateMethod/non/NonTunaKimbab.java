package templateMethod.non;

public class NonTunaKimbab {
    public void makeTunaKimbab() {
        addKim();
        addRice();
        addTuna();
    }

    private void addTuna() {
        System.out.println("참치 추가");
    }

    private void addRice() {
        System.out.println("밥 추가");
    }

    private void addKim() {
        System.out.println("김 추가");
    }
}
