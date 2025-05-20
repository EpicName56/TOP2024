package Old_Homework.Homework_47_48;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<TaskManager> tasks = new PriorityQueue<>();

        TaskManager task1 = new TaskManager.Builder()
                .name("Первая задача")
                .priority(2)
                .category("Feature")
                .build();

        TaskManager task2 = new TaskManager.Builder()
                .name("Вторая задача")
                .priority(1)
                .category("Documentation")
                .build();

        TaskManager task3 = new TaskManager.Builder()
                .name("Третья задача")
                .priority(3)
                .category("Documentation")
                .build();

        TaskManager task4 = new TaskManager.Builder()
                .name("Четвертая задача")
                .priority(1)
                .category("Bug")
                .build();

        TaskManager task5 = new TaskManager.Builder()
                .name("Пятая задача")
                .priority(3)
                .category("Bug")
                .build();

        TaskManager task6 = new TaskManager.Builder()
                .name("Шестая задача")
                .priority(1)
                .category("Feature")
                .build();

        TaskManager task7 = new TaskManager.Builder()
                .name("Седьмая задача")
                .priority(2)
                .category("Documentation")
                .build();

        TaskManager task8 = new TaskManager.Builder()
                .name("Восьмая задача")
                .priority(3)
                .category("Feature")
                .build();

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);
        tasks.add(task7);
        tasks.add(task8);

        System.out.println(tasks);

    }
}
