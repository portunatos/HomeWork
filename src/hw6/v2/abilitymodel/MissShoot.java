package hw6.v2.abilitymodel;

import hw6.v2.ability.ShootAbility;

public class MissShoot implements ShootAbility {
    @Override
    public void shoot() {
        System.out.println("Пальцем в небо! Промах!");
    }
}
