package hw6.v2.abilitymodel;

import hw6.v2.ability.RunAbility;

public class SlowRun implements RunAbility {
    @Override
    public void run() {
        System.out.println("Ползет как черепаха!");
    }
}
