package Homework_39_40_45_46;

import java.util.Objects;

public class House {

    private int floors;
    private int rooms;
    private int garage;

    public House(int floors, int rooms, int garage) {
        this.floors = floors;
        this.rooms = rooms;
        this.garage = garage;
    }


    public House(Builder houseBuilder) {
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.garage = houseBuilder.garage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floors == house.floors && rooms == house.rooms && garage == house.garage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors, rooms, garage);
    }


    public static class Builder {
        private int floors;
        private int rooms;
        private int garage;


        public Builder() {
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder garage(int garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }


    @Override
    public String toString() {
        return "Дом имеет: " + floors + " этажей, " + rooms + " комнат и " + garage + " гаражей";
    }
}
