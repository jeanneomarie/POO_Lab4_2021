package models;

public class Main2 {
    public static void main(String[] args) {
        Scooter scooter = new Scooter(1);
        scooter.year = 2022;
        scooter.name = "Bolt";
        scooter.colour = "green";

        System.out.println(scooter.year);
        System.out.println(scooter.getId());
        System.out.println(scooter.name);
        System.out.println(scooter.colour);
        System.out.println(Scooter.MAXIMUM_SPEED);
    }
}
