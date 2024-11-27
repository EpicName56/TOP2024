package Homework_51_52;

public class CustomMutableClass {

    private Integer value;


    public CustomMutableClass(int value) {
        this.value = value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomMutableClass{" +
                "value=" + value +
                '}';
    }

    /**
     * Конструктор копирования
     *
     * @param cmc хранит в себе изменяемый класс
     */
    public CustomMutableClass(CustomMutableClass cmc) {
        this.value = cmc.value;
    }
}
