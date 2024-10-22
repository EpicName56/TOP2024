package Homework_33_34;

public class Main {

    public static void main(String[] args) {


        Animal dog = new Dog();
        dog.setName("Шарик");

        Animal dog2 = new Dog();
        dog2.setName("Бобик");

        Animal cat = new Cat();
        cat.setName("Барсик");

        Animal cat2 = new Cat();
        cat2.setName("Дымок");

        Animal bird = new Bird();
        bird.setName("Кеша");

        Animal bird2 = new Bird();
        bird2.setName("Яша");

        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(bird);
        System.out.println(bird2);

        System.out.println();


        // Создать список или массив объектов типа Animal, включающий в себя
        // собак, кошек и птиц

        Animal[] arr = new Animal[3];
        arr[0] = new Dog();
        arr[1] = new Cat();
        arr[2] = new Bird();

        for (Animal a : arr) {
            System.out.println(a.getName() + " издает звуки: " + a.makeSound());
        }
    }
}
