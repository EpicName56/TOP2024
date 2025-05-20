package Old_Homework.Homework_55_56;

import java.util.Objects;

public class Car {

    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Машина " + model + " " + year + " года выпуска";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}
