package Homework_39_40_45_46;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private String model;
    private int year;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Car(Builder carBuilder) {
        this.model = carBuilder.model;
        this.year = carBuilder.year;
        this.color = carBuilder.color;
    }

    @Override
    public int compareTo(Car o) {
        if (this.model.compareTo(o.model) == 0) {
            return Integer.compare(o.year, this.year);
        } else {
            return this.model.compareTo(o.model) | this.color.compareTo(o.color);
        }
    }

    public static class Builder {
        private String model;
        private int year;
        private String color;


        public Builder() {

        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, color);
    }

    @Override
    public String toString() {
        return "Машина модели: " + model + ", " + year + " года, " + color + " цвета";
    }
}
