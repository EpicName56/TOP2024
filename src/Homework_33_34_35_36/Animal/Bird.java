package Homework_33_34_35_36.Animal;

public class Bird extends Animal {

    public Bird(String name) {
        super(" ");
    }

    public void move() {
        System.out.println("Птица может передвигаться небольшими прыжками");
    }


    // т.к. не все птицы умеют
    // летать, то в переопределяемом методе move в классе Bird проверять
    // значение поля canFly и в зависимости от него выводить
    // соответствующее сообщение

    // я не понял поставленной задачи
    // нужно проверять canFly, но не понятно как
    // реализовать через еще один интерфейс?

    @Override
    public void canFly() {
        System.out.println("Птицы могут летать");

    }

    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик");
    }
}
