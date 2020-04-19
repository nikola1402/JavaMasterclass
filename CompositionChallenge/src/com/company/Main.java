package com.company;

public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed(false, 2, new Blanket(false, 210, 140));
        Door door = new Door(210, 150, false);

        Room room = new Room(door, bed);

        room.tidyUpTheRoom();
        room.getDoor().closeTheDoor();

        // NJIHOVO RESENJE

        System.out.println("************");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12,55);
        KingSizedBed bedd = new KingSizedBed("Modern", 4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Tim's room", wall1, wall2, wall3, wall4, ceiling, bedd, lamp);

        bedroom.makeKingSizedBed();
        bedroom.getLamp().turnOn();

    }
}
