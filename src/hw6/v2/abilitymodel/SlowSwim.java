package hw6.v2.abilitymodel;

import hw6.v2.ability.SwimAbility;

public class SlowSwim implements SwimAbility {
    @Override
    public void swim() {
        System.out.println("Лыжи не ласты, плавать мешают!");
    }
}
