package models;

public class Scooter {
    public int year;
    // ENCAPSULATION
    // 1/4 OOP Principles
    // getters and setters are needed to access the data!
    private int id;
    protected String name;
    String colour;

    //CONSTANT
    public static final int MAXIMUM_SPEED = 30;

    //constructor
    public Scooter(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id;
    }
}
