package hw6.v2.abilitymodel;

import hw6.v2.ability.SwimAbility;

public class FastSwim implements SwimAbility {
    @Override
    public void swim() {
        System.out.println("Плывет как рыба в воде");
    }
}
