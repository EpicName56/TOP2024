package Old_Homework.Homework_33_34_35_36;

import Old_Homework.Homework_33_34_35_36.Animal.*;

public class Main {

    public static void main(String[] args) {

        Animal[] animalArr = new Animal[3];
        animalArr[0] = new Dog("Шарик");
        animalArr[1] = new Cat("Барсик");
        animalArr[2] = new Bird("Кеша");

        for (Animal animal : animalArr) {

            if (animal instanceof Pet) {
                System.out.println(((Pet) animal).play() + " - " + ((Pet) animal).beFriendly());
            } else {
                System.out.println("С птицами нельзя играть, но они могут быть домашними");
            }
        }
    }
}
