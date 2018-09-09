package hw6.v1.sportsman;

import hw6.v1.action.Jump;
import hw6.v1.action.Swim;
import hw6.v1.model.Human;

public class Swimmer extends Human implements Jump, Swim {

    @Override
    public void greeting() {
        System.out.println("Настоящий пловец, при запахе хлорки, понимает, что это родное.");
    }

    @Override
    public void jump() {
        System.out.println("Прыжок с трамплина!");
    }

    @Override
    public void swim() {
        System.out.println("И заплыв...был бы...в случае наличия воды...");
    }

}
