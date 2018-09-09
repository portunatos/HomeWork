package hw6.v2.abilitymodel;

import hw6.v2.ability.ShootAbility;

public class AccurateShoot implements ShootAbility {
    @Override
    public void shoot() {
        System.out.println("Падение на снег! Выстрел! Точно в цель!");
    }
}
