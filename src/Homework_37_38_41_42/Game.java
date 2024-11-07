package Homework_37_38_41_42;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static int playersCount = 0;
    private static final int MAX_PLAYERS = 6;
    static ArrayList<Player> players = new ArrayList<>();
    static int playerNumberPlace = 1;


    /**
     * Метод создает игрока внутри Game и добавляет его в список
     * Если количество игроков достигает максимума, то новый игрок не будет добавлен в список
     *
     * @param player содержит заранее заданную информацию об игроке (имя и количество выносливости)
     */
    public void addPlayer(Player player) {

        if (playersCount < MAX_PLAYERS) {
            playersCount++;
            Player newPlayer = new Player(player.playerName, player.stamina);
            players.add(newPlayer);
            System.out.println(player + " был добавлен в команду, всего игроков: " + playersCount);

        } else {
            System.out.println("Достигнут максимум игроков. " + player + " не был добавлен в команду");
        }
    }


    public static void removePlayer(Player player) {
        players.remove(player);
    }


    public List<Player> getPlayers() {
        return players;
    }


    /**
     * Метод выводит информацию о количестве игроков и наличии свободных мест
     */
    public static void info() {

        if (playersCount > MAX_PLAYERS) {
            System.out.println("Достигнуто максимальное количество игроков. Нельзя добавить больше игроков");

        } else {
            System.out.println("Есть еще " + (MAX_PLAYERS - playersCount) + " свободных мест");
        }
    }


    /**
     * Метод выполняет проверку на наличие имени игрока из списка и указывает его позицию на поле
     */
    static void сheckName(String playerName) {

        for (int i = 0; i < players.size(); i++) {

            if (players.get(i).getPlayerName().equals(playerName)) {
                System.out.println(playerName + " присутствует на " + playerNumberPlace + " позиции");
                playerNumberPlace = 1;
                break;

            } else {
                System.out.println(playerName + " отсутствует на " + playerNumberPlace + " позиции");
                playerNumberPlace++;
            }
        }
    }
}
