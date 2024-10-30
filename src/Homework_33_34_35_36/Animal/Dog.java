package Homework_33_34_35_36.Animal;

public final class Dog extends Animal
        implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    public void move() {
        System.out.println("Собака может быстро бегать");
    }

    @Override
    public void canFly() {
    }

    @Override
    public String play() {
        return "С собаками можно играть";
    }

    @Override
    public String beFriendly() {
        return "Собаки домашние животные";
    }
}
