public class Lesson_12_2 {

    public static void main(String[] args) {

        int salaryDiana = 66_660;
        int salaryAndrey = 77_770;
        int salaryMaria = 88_880;

        int newSalaryDiana = (66_660 * 15) / 100;
        int finalSalaryDiana = salaryDiana + newSalaryDiana;

        int newSalaryAndrey = (77_770 * 15) / 100;
        int finalSalaryAndrey = salaryAndrey + newSalaryAndrey;

        int newSalaryMaria = (88_880 * 15) / 100;
        int finalSalaryMaria = salaryMaria + newSalaryMaria;

        System.out.println("Диана теперь получает " + finalSalaryDiana +
                " рублей в месяц. Годовой доход Дианы вырос на " + newSalaryDiana * 12 +
                " рублей. Теперь годовой доход Дианы составляет: " + finalSalaryDiana * 12 +
                " рублей в год");

        System.out.println("Андрей теперь получает " + finalSalaryAndrey +
                " рублей в месяц. Годовой доход Андрея вырос" +
                " на " + newSalaryAndrey * 12 + " рублей. Теперь годовой доход Андрея составляет: " +
                finalSalaryAndrey * 12 + " рублей в год");

        System.out.println("Мария теперь получает " + finalSalaryMaria +
                " рублей в месяц. Годовой доход Марии вырос на " +
                newSalaryMaria * 12 + " рублей. Теперь годовой доход Марии составляет: "
                + finalSalaryMaria * 12 + " рублей в год");
    }
}