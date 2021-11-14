package strategy.non;

public class Boxing implements Fighting {
    @Override
    public void fight() {
        System.out.println("주먹으로 싸우다.");
    }
}
