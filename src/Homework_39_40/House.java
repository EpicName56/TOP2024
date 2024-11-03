package Homework_39_40;

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
