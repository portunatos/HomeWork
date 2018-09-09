package hw6.v2.sportsman;

import hw6.v2.abilitymodel.AccurateShoot;
import hw6.v2.abilitymodel.BadJump;
import hw6.v2.abilitymodel.FastRun;
import hw6.v2.abilitymodel.SlowSwim;

public class Biathlete extends Human {

    public Biathlete(String name) {
        super(name);
        jumpAbility = new BadJump();
        runAbility = new FastRun();
        shootAbility = new AccurateShoot();
        swimAbility = new SlowSwim();
    }

    @Override
    public void greeting() {
        System.out.println("Биатлонист стрельбу закончил, \nСоперник с ходу в снег упал.");
    }
}
