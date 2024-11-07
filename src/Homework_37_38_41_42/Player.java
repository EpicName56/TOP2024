package Homework_37_38_41_42;

public class Player extends Game {

    public static final int MIN_STAMINA = 0;
    int stamina;
    public String playerName;
    boolean playerNeedRest = true;


    public Player(String playerName, int stamina) {

        this.playerName = playerName;
        this.stamina = stamina;

    }


    public String getPlayerName() {
        return playerName;
    }


    /**
     * Метод выполняет симуляцию быстрого бега у игрока и показывает сколько у него осталось выносливости
     * Если выносливость игрока падает ниже минимального значения, то он удаляется с поля и освобождает место
     */
    public void run() {

        while (playerNeedRest) {

            if (stamina > MIN_STAMINA) {
                stamina--;
                System.out.println(playerName + " начинает быстро бежать");
                System.out.println("Сейчас у игрока " + playerName + " " + stamina + " единиц выносливости");


            } else {
                System.out.println("У " + playerName +
                        " недостаточно выносливости, ему нужно отдохнуть. " + playerName + " покидает поле");
                playersCount--;
                playerNeedRest = false;
            }
        }
    }


    @Override
    public String toString() {
        return playerName;
    }
}
