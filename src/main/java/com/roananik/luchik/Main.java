package com.roananik.luchik;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("John Smith", new Limitation(25.25, 1.5)),
                new Cat("Tom", new Limitation(30, 2)),
                new Robot("Dayson", new Limitation(20.5, 0.5))
        };

        Obstacle[] obstacles = {
                new Racetrack("R1", 26),
                new Wall("W1", 1.2),
                new Racetrack("R1",40),
                new Wall("W1",0.1)
        };

        Passage.competition(participants, obstacles);
    }
}