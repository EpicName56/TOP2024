package Homework_33_34;

public class Dog extends Animal {

    public Dog() {
        super("Собака");
    }

    @Override
    public String makeSound() {
        return "гав-гав";
    }
}
