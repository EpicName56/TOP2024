import java.util.Objects;
import java.util.Scanner;

public class Lesson_10 {

    public static void main(String[] args) {

        String warm = "Тепло";
        String cold = "Холодно";

        Scanner firstScan = new Scanner(System.in);

        System.out.print("Собираемся на тренировку. На улице сейчас тепло или холодно?: ");
        String coldOrWarm = firstScan.nextLine();

        if (Objects.equals(coldOrWarm, warm)) {
            System.out.println("На улице сейчас тепло. Надеваем легкую форму");

        }
        if (Objects.equals(coldOrWarm, cold)) {
            System.out.println("На улице сейчас холодно. Надеваем теплую форму");
        }
        System.out.println();

        String prepare = "Подготовиться";
        String immediately = "Без подготовки";

        System.out.print("Вы пришли в тренажерный зал. Вы хотите побегать на беговой дорожке или сразу приступить" +
                " к силовым тренировкам?: ");

        String prepareOrImmediately = firstScan.nextLine();

        if (Objects.equals(prepareOrImmediately, prepare)) {
            System.out.println("Вы бегаете на дорожке и хорошо разминаетесь. Тренировка прошла отлично");
        }
        if (Objects.equals(prepareOrImmediately, immediately)) {
            System.out.println("Вы начинаете заниматься без подготовки и неудачно растягиваете мышцы");
        }
    }
}