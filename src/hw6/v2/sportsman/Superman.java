package hw6.v2.sportsman;

import hw6.v2.ability.SuperAbility;

public class Superman extends Human {
    public Superman(String name) {
        super(name);
    }

    public void executeSuperAbility(SuperAbility superAbility) {
        superAbility.superAction(getName());
    }

    public static void superAction(String name) {
        System.out.println(name + " умеет летать!!!");
    }

    @Override
    public void greeting() {
        System.out.println("Я могу все!!!");
    }
}
