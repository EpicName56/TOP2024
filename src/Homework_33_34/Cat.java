package Homework_33_34;

public class Cat extends Animal {

    public Cat() {
        super("Кошка");
    }

    @Override
    public String makeSound() {
        return "мяу-мяу";
    }
}
