package strategy;

import strategy.adapt.*;

public class User {
    public static void main(String args[]){
        Play boxing = new Boxing();
        Play taekwondo = new Taekwondo();

        /**
         * 기존에 복싱은 주먹만을 사용하고,
         * 태권도는 발차기만을 사용한다.
         */
        boxing.setFightStrategy(new Funch());
        taekwondo.setFightStrategy(new Kick());

        System.out.print("복싱 : ");
        boxing.fight();
        System.out.print("태권도 : ");
        taekwondo.fight();

        /**
         * 추후, 태권도가 주먹을 사용한다.
         */
        taekwondo.setFightStrategy(new Funch());
        System.out.println("******태권도가 주먹을 사용하게 된 후*******");

        System.out.print("복싱 : ");
        boxing.fight();
        System.out.print("태권도 : ");
        taekwondo.fight();
    }
}
