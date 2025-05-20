package Old_Homework.Homework_37_38_41_42;

public class Main {

    public static void main(String[] args) {

        Game football = new Game();


        Player p1 = new Player("Егор", 5);
        Player p2 = new Player("Саша", 10);
        Player p3 = new Player("Вася", 7);
        Player p4 = new Player("Женя", 8);
        Player p5 = new Player("Максим", 6);
        Player p6 = new Player("Данил", 9);
        Player p7 = new Player("Ваня", 4);

        Game.info();

        football.addPlayer(p1);
        football.addPlayer(p2);
        football.addPlayer(p3);
        football.addPlayer(p4);
        football.addPlayer(p5);
        football.addPlayer(p6);
        football.addPlayer(p7);

        System.out.println(football.getPlayers());

        Game.info();

        p1.run();
        p5.run();

        Game.info();

        Game.сheckName("Вася");
        Game.сheckName("Ваня");
    }
}
