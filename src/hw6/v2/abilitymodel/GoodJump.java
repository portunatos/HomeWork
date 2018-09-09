package hw6.v2.abilitymodel;

import hw6.v2.ability.JumpAbility;

public class GoodJump implements JumpAbility {
    @Override
    public void jump() {
        System.out.println("Прыжок! Двойное сальто! Винт! Великолепно!");
    }
}
