package hw6.v2.sportsman;

import hw6.v2.abilitymodel.FastSwim;
import hw6.v2.abilitymodel.GoodJump;
import hw6.v2.abilitymodel.MissShoot;
import hw6.v2.abilitymodel.SlowRun;

public class Swimmer extends Human {
    public Swimmer(String name) {
        super(name);
        jumpAbility = new GoodJump();
        runAbility = new SlowRun();
        shootAbility = new MissShoot();
        swimAbility = new FastSwim();
    }


    public void greeting() {
        System.out.println("Настоящий пловец, при запахе хлорки, понимает, что это родное.");
    }
}
