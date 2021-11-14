package strategy.adapt;

public class Funch implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("주먹으로 싸우다.");
    }
}
