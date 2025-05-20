package Old_Homework.Homework_51_52;

import java.util.Objects;

public class Box <T> {

    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(data, box.data);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }

    @Override
    public String toString() {
        return "Box = " + data;
    }

    public void isEmpty() {
        if (data == null) {
            System.out.println("Контейнер пуст");
        }
    }
}
