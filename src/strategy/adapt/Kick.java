package strategy.adapt;

public class Kick implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("발차기로 싸우다.");
    }
}
