package Homework_33_34_35_36.Animal;

public abstract class Animal {

    private String name;

    public abstract void makeSound();
    public abstract void move();
    public abstract void canFly();

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
