package Homework_33_34;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeSound() {
        System.out.println(" ");
        return null;
    }


    /**
     * Метод выводит в консоль имя животного (если оно не было выбрано, то возвращается стандартное имя) и какие
     * уникальные звуки издает животное
     *
     * @return возвращает в консоль информацию об имени и издаваемом животном звуке
     */
    @Override
    public String toString() {
        return name + " издает звуки: " + makeSound();
    }
}
