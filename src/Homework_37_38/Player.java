package Homework_37_38;

public final class Player {

    public static final int MAX_STAMINA = 10;
    public static final int MIN_STAMINA = 0;
    private static int countPlayer = 0;
    private static int emptySlots = 6;
    private int stamina = 0;
    public String playerName;
    boolean playerNeedRest = true;

    public Player(String playerName, int stamina) {
        countPlayer++;
        emptySlots--;
        this.stamina = stamina;
        this.playerName = playerName;
    }


    public int getStamina() {
        return stamina;
    }


    public static int getCountPlayer() {
        return countPlayer;
    }


    void run() {

        while (playerNeedRest) {

            if (stamina > MIN_STAMINA) {
                stamina--;
                System.out.println(playerName + " начинает быстро бежать");
                System.out.println("Сейчас у игрока " + playerName + " " + stamina + " единиц выносливости");


            } else {
                System.out.println("У " + playerName + " недостаточно выносливости, ему нужно отдохнуть. " + playerName
                        + " покидает поле");
                countPlayer--;
                emptySlots++;
                playerNeedRest = false;
                System.out.println("Сейчас на поле: " + countPlayer + " игроков. Есть еще " + emptySlots +
                        " свободных мест");
            }
        }
    }


    void info() {

        if (countPlayer > 6) {
            System.out.println("Достигнуто максимальное количество игроков");


        } else {
            System.out.println("Игрок " + playerName + " был добавлен в команду. Есть еще " + emptySlots +
                    " свободных мест");
        }
    }
}
