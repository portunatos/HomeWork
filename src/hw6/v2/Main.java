package hw6.v2;

import hw6.v2.abilitymodel.AccurateShoot;
import hw6.v2.abilitymodel.FastRun;
import hw6.v2.abilitymodel.FastSwim;
import hw6.v2.abilitymodel.GoodJump;
import hw6.v2.sportsman.Biathlete;
import hw6.v2.sportsman.Human;
import hw6.v2.sportsman.Superman;
import hw6.v2.sportsman.Swimmer;

public class Main {
    public static void main(String[] args) {

        System.out.println("======================Соревнования по биатлону===================");

        System.out.println("======================Выступление биатлониста=====================");

        Human biathlet = new Biathlete("Биатлонист");
        biathlet.executeRun();
        biathlet.executeShoot();
        biathlet.greeting();
        biathlet.win();

        System.out.println("========================Выступление пловца=======================");

        Human swimmer = new Swimmer("Плавец");
        swimmer.executeRun();
        swimmer.executeShoot();
        swimmer.greeting();
        swimmer.lose();

        System.out.println("========================Выступление супермена=======================");

        Human superman = new Superman("Супермен");
        superman.setJumpAbility(new GoodJump());
        superman.setRunAbility(new FastRun());
        superman.setShootAbility(new AccurateShoot());
        superman.setSwimAbility(new FastSwim());

        superman.executeRun();
        superman.executeShoot();
        superman.greeting();

        System.out.println("======================Соревнования по плаванью===================");

        System.out.println("======================Выступление биатлониста=====================");

        biathlet.executeJump();
        biathlet.executeSwim();
        biathlet.lose();

        System.out.println("========================Выступление пловца=======================");

        swimmer.executeJump();
        swimmer.executeSwim();
        swimmer.win();

        System.out.println("========================Выступление супермена=======================");

        superman.executeJump();
        superman.executeSwim();

        ((Superman) superman).executeSuperAbility(Superman::superAction);

        ((Superman) superman).executeSuperAbility((s)-> System.out.println(s + " умеет пускать искры из глаз!"));


    }


}
