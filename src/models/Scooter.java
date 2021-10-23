package models;

public class Scooter {
    public int year;
    // encapsulation
    // -> getters
    // -> setters
    private int id;
    //add only after 1
    protected String name;
    //add only after 3
    String colour;

    //CONSTANTA
    public static final int VITEZA_MAXIMA = 32;

    //constructor
    public Scooter(int id) {
        this.id = id;
    }

    //ENCAPSULATION
    public int getId() {
        /*int i;
        System.out.println(i);*/
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