package Homework_33_34;

public class Bird extends Animal {

    public Bird() {
        super("Птица");
    }

    public boolean canFly() {
        return true;
    }

    @Override
    public String makeSound() {
        return "чирик-чирик";
    }
}
