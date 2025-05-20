package Old_Homework.Homework_33_34_35_36.Animal;

public final class Cat extends Animal
        implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу");
    }

    public void move() {
        System.out.println("Кошка может прыгать");
    }

    @Override
    public void canFly() {
    }

    @Override
    public String play() {
        return "С кошками можно играть";
    }

    @Override
    public String beFriendly() {
        return "Кошки домашние животные";
    }
}
