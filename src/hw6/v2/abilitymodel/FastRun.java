package hw6.v2.abilitymodel;

import hw6.v2.ability.RunAbility;

public class FastRun implements RunAbility {
    @Override
    public void run() {
        System.out.println("Скользит по снегу со скоростью звука!");
    }
}
