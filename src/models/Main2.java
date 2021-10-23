package models;

public class Main2 {
    public static void main(String[] args) {
        Scooter scooter = new Scooter(1);
        scooter.year = 2021;
        scooter.name = "Bolt";
        scooter.colour = "green";

        // 1    print these
        // 2    move Scooter to "models" package to explain "protected"
        // 3    make a Main2
        // 4    add colour
        System.out.println(scooter.year);
        System.out.println(scooter.getId());
        System.out.println(scooter.name);
        System.out.println(scooter.colour);
        System.out.println(Scooter.VITEZA_MAXIMA);
        System.out.println(scooter.VITEZA_MAXIMA);
    }
}
