package Homework_39_40;

public class Main {

    public static void main(String[] args) {

        House house1 = new House.Builder()
                .floors(3)
                .rooms(12)
                .garage(1)
                .build();

        House house2 = new House.Builder()
                .floors(6)
                .rooms(18)
                .build();


        System.out.println(house1);
        System.out.println(house2);

    }
}
