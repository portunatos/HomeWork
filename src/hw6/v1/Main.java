package hw6.v1;

import hw6.v1.sportsman.Biathlete;
import hw6.v1.sportsman.Swimmer;

public class Main {
    public static void main(String[] args) {
        Biathlete biathlete = new Biathlete();
        biathlete.run();
        biathlete.shoot();
        biathlete.greeting();

        System.out.println("=============================================================================");

        Swimmer swimmer = new Swimmer();
        swimmer.jump();
        swimmer.swim();
        swimmer.greeting();
    }
}
