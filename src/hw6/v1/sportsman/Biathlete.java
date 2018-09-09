package hw6.v1.sportsman;


import hw6.v1.action.Run;
import hw6.v1.action.Shoot;
import hw6.v1.model.Human;

public class Biathlete extends Human implements Run, Shoot {


    @Override
    public void greeting() {
        System.out.println("Биатлонист стрельбу закончил, \nСоперник с ходу в снег упал.");
    }

    @Override
    public void run() {
        System.out.println("Мчимся на лыжах по снегу..");
    }

    @Override
    public void shoot() {
        System.out.println("Пиф-паф!");
    }
}
