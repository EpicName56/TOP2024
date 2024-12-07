package Homework_57_58;

@FunctionalInterface
public interface Printer {

    public abstract void print();

    /**
     * Метод распечатывает заданное сообщение
     *
     * @param message содержит сообщение
     */
    static void print(String message) {
        System.out.println("Распечатываю: " + message);
    }
}
