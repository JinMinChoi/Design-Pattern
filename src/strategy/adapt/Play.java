package strategy.adapt;

public class Play {
    private FightStrategy fightStrategy;

    public void fight() {
        fightStrategy.fight();
    }

    public void setFightStrategy(FightStrategy fightStrategy) {
        this.fightStrategy = fightStrategy;
    }
}
