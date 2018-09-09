package hw6.v1.model;

public abstract class Human {
    public abstract void greeting();

    public void win() {
        System.out.println("Yeaaaaahh! I am winner!");
    }

    public void lose() {
        System.out.println("Uaaaaaaa =(...next time");
    }
}
