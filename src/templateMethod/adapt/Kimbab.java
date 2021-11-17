package templateMethod.adapt;

public abstract class Kimbab {
    protected void makeKimbab() {
        addKim();
        addRice();
        addAnother();
    }

    private void addKim() {
        System.out.println("김 추가");
    }

    private void addRice() {
        System.out.println("밥 추가");
    }

    abstract void addAnother();
}
