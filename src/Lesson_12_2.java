public class Lesson_12_2 {

    public static void main(String[] args) {

        int salaryDiana = 66660;
        int salaryAndrey = 77770;
        int salaryMaria = 88880;

        int newSalaryDiana = (66660 * 15) / 100;
        int finalSalaryDiana = salaryDiana + newSalaryDiana;

        int newSalaryAndrey = (77770 * 15) / 100;
        int finalSalaryAndrey = salaryAndrey + newSalaryAndrey;

        int newSalaryMaria = (88880 * 15) / 100;
        int finalSalaryMaria = salaryMaria + newSalaryMaria;

        System.out.println("Диана теперь получает " + finalSalaryDiana +
                " рублей в месяц. Годовой доход Дианы вырос на " + newSalaryDiana * 12 + " рублей");

        System.out.println("Андрей теперь получает " + finalSalaryAndrey +
                " рублей в месяц. Годовой доход Андрея вырос" +
                " на " + newSalaryAndrey * 12 + " рублей");

        System.out.println("Мария теперь получает " + finalSalaryMaria +
                " рублей в месяц. Годовой доход Марии вырос на " +
                newSalaryMaria * 12 + " рублей");
    }
}