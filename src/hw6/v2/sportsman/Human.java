package hw6.v2.sportsman;

import hw6.v2.ability.JumpAbility;
import hw6.v2.ability.RunAbility;
import hw6.v2.ability.ShootAbility;
import hw6.v2.ability.SwimAbility;

public abstract class Human {
    private String name;
    JumpAbility jumpAbility;
    RunAbility runAbility;
    ShootAbility shootAbility;
    SwimAbility swimAbility;


    public Human(String name) {
        this.name = name;
    }

    public abstract void greeting();

    public void setJumpAbility(JumpAbility jumpAbility) {
        this.jumpAbility = jumpAbility;
    }

    public void setRunAbility(RunAbility runAbility) {
        this.runAbility = runAbility;
    }

    public void setShootAbility(ShootAbility shootAbility) {
        this.shootAbility = shootAbility;
    }

    public void setSwimAbility(SwimAbility swimAbility) {
        this.swimAbility = swimAbility;
    }

    public String getName() {
        return name;
    }

    public void executeJump() {
        jumpAbility.jump();
    }

    public void executeRun() {
        runAbility.run();
    }

    public void executeShoot() {
        shootAbility.shoot();
    }

    public void executeSwim() {
        swimAbility.swim();
    }

    public void win() {
        System.out.println("Победу одержал " + name + "! Поздравляем!");
    }

    public void lose() {
        System.out.println("Увы, " + name + " сегодня потерпел поражение!");
    }
}
